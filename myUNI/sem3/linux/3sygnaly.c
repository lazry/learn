/* Napisać program, który powoła 2 procesy potomne (mają one poinformować o swoim PID i
numerze).
Proces macierzysty ma za zadanie odbierać wszystkie sygnały poza SIGINT, SIGQUIT i SIGTSTP.

Zadania dla procesów:
Proces macierzysty:
  ● Po otrzymaniu sygnału SIGUSR1, ma on za zadanie wyświetlić komunikat
    „Proces macierzysty: Oberwałem sygnałem SIGUSR1! Koncze działanie!”
  ● Po otrzymaniu sygnału SIGUSR2, ma za zadanie wyświetlić komunikat
    „Proces macierzysty: z SIGUSR2 sobie poradzę, dzialam dalej!”
Proces potomny 1:
  ● Co 5 sekund wyświetla komunikat: „Proces 1: obecny!”
  ● W przypadku odebrania sygnału SIGUSR1 wyświetla komunikat: „Jestem proces 1, radze
    sobie z SIGUSR1!”
  ● W przypadku odebrania sygnału SIGTERM zamyka wszystkie procesy potomne, pozostawia
    macierzysty
Proces potomny 2:
  ● Co 5 sekund wyświetla komunikat: „Proces 2: obecny!”
  ● W przypadku odebrania SIGUSR1: Zawiesza działanie procesu 1.
  ● W przypadku odebrania SIGUSR2: Odwiesza działanie procesu 1.*/
  #include <stdio.h>
#include <stdlib.h>
#include <signal.h>
#include <unistd.h>

int pidM;
int pidP1;
int pidP2;
void signals_handler (int sig){
  	sigset_t mask_set;
	sigset_t old_set;
	sigaddset(&mask_set, SIGINT);
	sigaddset(&mask_set, SIGQUIT);
	sigaddset(&mask_set, SIGTSTP);
 	sigprocmask(SIG_SETMASK, &mask_set, &old_set);
	psignal(sig, "\nMaska ustawiona!");
	pause();
	sigprocmask(SIG_SETMASK, &old_set, NULL);
	return;
}
void sig_handler1 (int sig){
  //Po otrzymaniu sygnalu SIGUSR1, ma on za zadanie wyswietlic komunikat 
	printf("\nProces macierzysty: Oberwalem sygnalem SIGUSR1! Koncze dzialanie!");
	kill(pidM, SIGKILL);
	return;
}
void sig_handler2 (int sig){
	printf("\nProces macierzysty: z SIGUSR2 sobie poradze, dzialam dalej!");
	return;
}

void sig_handler11 (int sig){
	printf("\nJestem proces 1, radze sobie z SIGUSR1!");
	return;
}

void sig_handler12 (int sig){
  //W przypadku odebrania sygnalu SIGTERM zamyka wszystkie procesy potomne, pozostawia macierzysty
	kill( pidP2, SIGKILL);
	kill( pidP1, SIGKILL);	
	return;
}

void sig_handler21 (int sig){
	//W przypadku odebrania SIGUSR1: Zawiesza dzialanie procesu 1.
	kill( pidP1, SIGSTOP);
	return;
}

void sig_handler22 (int sig){
	//W przypadku odebrania SIGUSR1: Odwiesza dzialanie procesu 1.
	kill( pidP1, SIGCONT);
	return;
}

int main(void) {
	
	printf("Proces macierzysty. PID: %d\n", getpid());
	pidM = getpid();
	if(fork()==0) //P1
	{
		printf("1. PID: %d\n", getpid());
		pidP1 = getpid();
		signal(SIGUSR1, sig_handler11);
		signal(SIGTERM, sig_handler12);
		while(1){
			printf("Proces 2: obecny!");
			sleep(5);
		}
		return 0;
	}
	if(fork()==0) //P2
	{
		printf("2. PID: %d\n", getpid());
		pidP2 = getpid();
		signal(SIGUSR1, sig_handler21);
		signal(SIGUSR2, sig_handler22);
		while(1){
			printf("Proces 2: obecny!");
			sleep(5);
		}
		return 0;
	}
	
	/* zastawiamy "pulapke" na sygnal */
	signal(SIGUSR3, signals_handler);
	signal(SIGUSR1, sig_handler1);
	signal(SIGUSR2, sig_handler2);
	
	/* petla nieskonczona */
	for(;;)
	pause();
	
	return 0;
}
