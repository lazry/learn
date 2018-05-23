/* Napisać program tworzący rodzinę procesów o zadanej historii (zdjęcie). 
Każdy proces powinien wypisać swój PID i wprowadzić się w stan wstrzymania (s leep ) na pewien
czas. Sprawdzenie utworzonego drzewa zależności zrealizować przy pomocy polecenia pstree z opcją
–c wywołanego przy pomocy funkcji e xeclp (). Program realizujący polecenie pstree powinien
zastąpić proces zaznaczony okręgiem. */

#include <sys/types.h>
#include <unistd.h>
#include <stdio.h>

int main(void){
	int i;
	if(fork()==0) //P1
	{
		printf("1 PID: %d, PPID: %d\n", getpid(), getppid());
		sleep(30);
		return 0;
	}
	if(fork()==0) //P2
	{
		printf("2 PID: %d, PPID: %d\n", getpid(), getppid());
		for(i=3; i<=5; i++){
			if(fork()==0) //P3, P4, P5
			{
				printf("%d PID: %d, PPID: %d\n", i, getpid(), getppid());
				sleep(30);
				return 0;
			}
		}
		sleep(30);
		return 0;
	}
	if(fork()==0) //P6
	{
		printf("6 PID: %d, PPID: %d\n", getpid(), getppid());
		for(i=7; i<=8; i++){
			if(fork()==0) //P7, P8
			{
				printf("%d PID: %d, PPID: %d\n", i, getpid(), getppid());
				sleep(30);
				return 0;
			}
		}
		if(fork()==0) //P9
		{
			printf("9 PID: %d, PPID: %d\n", getpid(), getppid());
			if(fork()==0) //P10 na exec pstree
			{
				printf("10 PID: %d, PPID: %d\n", getpid(), getppid());
				execlp("pstree", "pstree", "-cp", (char *)NULL);				
				sleep(30);
				return 0;
			}				
			sleep(30);
			return 0;
		}
		sleep(30);
		return 0;
	}
	sleep(30);
	return 0;
}
