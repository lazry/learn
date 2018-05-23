/* 
	Napisać program wielowątkowy (plik programu nazwać nazwisko_threads.c
	Program ma wyznaczać n-ty wyraz ciągu Lucasa dla zadanego n.
 */

#include <unistd.h>
#include <pthread.h>
#include <stdio.h>

#define THREADS 2		//okreslamy ilosc watkow
pthread_t p_thread[THREADS];


int lucas (int n)		//algorytm lucasa w funkcji
{
	if (n==0)
		return 2;
	else
		if(n==1)
			return 1;
		else
			return lucas(n-1)+lucas(n-2);
}
void *matematyczna(void *arg) {		//watek matematyczny
	
	/* Wymuszamy konwersje argumentu do INT, inny i tak nie bedzie  */
	
	int liczba = (int)arg;
	int wynik = 0;
	void * rezultat;	//w tym bedzie przekazywany rezultat
	printf("Wątek matematyczny uruchomiony z parametrami:");
	printf("N: %d\n",liczba);
	
	//dzialanie:
	wynik = lucas(liczba);	//wywolujemy funkcje lucasa
	rezultat = (void *)wynik;	//wynik konwertujemy do przekazania

	/* Konczymy dzialanie watku z okreslonym statusem.
	   poprawne zakończenie wątku. */
	pthread_exit(rezultat);
	
}
void *imienna(void *arg) {
	
	char str [30] = "mikolaj";	//okreslamy przykladowe imie do 30 znakow
		
	//dzialanie:
	int i;
	for(i = 0; ; i++){	//petla wyswietlajaca imie co 8000 microsekund
		if ( i>6)
			i = 0;
		printf("%c", str[i]);	//przy takim czasie mozna dostrzec w jakim tempie 
		usleep(8000);		//pracuja watki
	}
	
	pthread_exit(NULL);		//nic nie zwracamy
}

int main() {

		int arg = 0;
		int arg1 = 1;
		char str [30];
		void * wynik;

		//komunikat interakcyjny dla uzytkownika
		printf("Podaj który wyraz ciągu Lucasa ma wyświetlić program.\n");
		scanf ("%d", &arg);

		//wywolanie dwoch watkow 
		if(pthread_create(&p_thread[0], NULL, matematyczna, (void *)arg))
		{
			printf("Blad przy tworzeniu watku matematycznego! \n");
		}
		if(pthread_create(&p_thread[1], NULL, imienna, (void *)arg1))
		{
			printf("Blad przy tworzeniu watku imiennego! \n");
		}
		
  
		/* Dolaczamy , czyli czekamy, az watek sie zakonczy. */
		//drugi arg to wartość zwracana przez watek
		pthread_join(p_thread[0], &wynik);
		
		//wyswietlamy komunikat o wyniku
		printf("Wynik to %d \n", (int)wynik);	
		return 0;
}
