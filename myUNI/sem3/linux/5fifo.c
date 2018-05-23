/*● Proces macierzysty P pełni rolę producenta danych. Proces ten
    tworzy dwa procesy potomne K1 i K2, które będą pracować na
    danych.
● Proces macierzysty w pętli nieskończonej przyjmuje liczby od
   użytkownika (wprowadzane z klawiatury), a następnie przesyła je
   do pierwszego z procesów potomnych.
● Pierwszy proces potomny podnosi odebraną liczbę do kwadratu, a
  następnie przekazuje ją do procesu trzeciego.
● Proces trzeci wyświetla wynik potęgowania na ekranie
  (opcjonalnie – zapisuje wyniki do pliku wynikowego (zbiorczego,
  kolejne wyniki w kolejnych liniach)).*/
  #include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>
#include <sys/stat.h>

#define FIFO "my_fifo"
#define FIFO2 "my_fifo2"

void clientM(const char *OUT){ //macierzysty 
	FILE *fp;
	int liczba;
	
	printf("OUT: %s\n", OUT);
	
	/* W petli pobieramy dane od uzytkownika */
	while(1){
		fp = fopen(FIFO, "w");
		fprintf(stdout, "Podaj liczbe: ");
		scanf("%d", &liczba);
		/* Zapisujemy je do otwartego poprzednio deskryptora */
		fprintf(fp, "%d", liczba);
		fclose(fp);
		printf("Macierzysty Zapisano %d do pliku\n", liczba);
		sleep(1);
	}
}

void serverP1(const char *IN, const char *OUT){ //P1 pobiera dane wpisane przez uzytkownika i je poteguje
	FILE *fp;
	int liczba;
	int wynik;
	printf("IN: %s\n", IN);
	printf("OUT: %s\n", OUT);
	
	while(1){
		fp = fopen(FIFO, "r");
		fscanf( fp, "%d", &liczba);
		printf("P1 wczytalem: %d\n\n", liczba);
		fclose(fp);
		//sleep(1); ten sleep sprawil, ze program nie dzialal na zajeciach
		
		fp = fopen(FIFO2, "w");
		wynik = liczba*liczba;
		printf("P1 potega: %d\n\n", wynik);
		fprintf(fp, "%d", wynik);
		fclose(fp);
		sleep(1);
	}
}

void serverP2(const char *IN){ //P2 odbiera i wyswietla wynik na ekranie
	FILE *fp;
	int liczba;
	printf("IN: %s\n", IN);
	
	while(1){
		fp = fopen(FIFO2, "r");
		fscanf( fp, "%d", &liczba);
		printf("P2 Wynik potegowania: %d\n\n", liczba);
		fclose(fp);
		sleep(1);
	}
}

int main(void){
		
	/* UWAGA! Na prawa dostepu tworzonego pliku ma wplyw UMASK */
	umask(0);
    mkfifo(FIFO, 0666); //0 z przodu oznacza notacje ósemkowa
    mkfifo(FIFO2, 0666);
    
	/* rozdwajamy proces */
	if(fork()){ //proces P1
		serverP1(FIFO, FIFO2); //P1 czyta i podnosci do potegi i przekazuje do P2
	}
	else if(fork()){ //proces P2
		serverP2(FIFO2); //P2 odbiera i wyswietla wynik na ekranie
	}
	else{
		clientM(FIFO);//macierzysty czyta liczby i przekazuje do P1
	}
	
	
	return 0;
}
