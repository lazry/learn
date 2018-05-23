/*1. Na początku program zapyta użytkownika, czy ten chce wprowadzić nowe liczby, czy
operować na istniejących.
2. Jeśli użytkownik zechce wprowadzić nowe liczby:
  ● odczyta podane z klawiatury przez użytkownika 5 liczb, a następnie zapisze je w
pliku liczby.txt .
3. Jeśli użytkownik nie zechce wprowadzać nowych liczb:
  ● ten krok zostanie pominięty (uwaga, wtedy plik liczby.txt musi już istnieć – w
    przeciwnym razie powinien zostać wyświetlony stosowny komunikat, a program
    zakończy działanie).
4. Następnie program odczyta podany z klawiatury parametr operacji: A, G lub H.
5. Następnie program odczyta dane z pliku liczby.txt i wykona następujące operacje:
  ● Jeśli parametr to A – obliczy średnią arytmetyczną liczb z pliku liczby.txt.
  ● Jeśli parametr to G – obliczy średnią geometryczną liczb z pliku liczby.txt.
  ● Jeśli parametr to H – obliczy średnią harmoniczną liczb z pliku liczby.txt.
6. Oprócz obliczenia odpowiedniej średniej, program powinien również odszukać największą
    oraz najmniejszą spośród liczb w pliku liczby.txt .
7. Program powinien przygotować 3 pliki :
  ● wynik.txt – zawierający obliczoną średnią (oraz informację jaka to średnia;);
  ● najmniejsza.txt – zawierający najmniejszą spośród liczb;
  ● największa.txt – zawierający największą spośród liczb.*/
  #include <unistd.h>
#include <fcntl.h>
#include <stdio.h>
#include <stdlib.h>
#include <math.h> 	//do obliczania srednich
 
int main(){
    
	FILE * pFile; 
	int li[5];
	int flag = 0;  //flaga 0 gdy uzytkownik sam wprowadza liczby
	int flag1 = 0; //flaga 0 gdy plik do odczytu liczb istnieje
	int flag2 = 0; //flaga zmienia na 1 gdy zostala wprowadzona dobra litera
	int i = 0;
	printf ("Wprowadzic nowe liczby czy operowac na istniejacych(-1 by na istniejących)?");
	for ( i = 0; i<5 && flag == 0; i++){
		scanf ("%d",&li[i]);
		if(li[0] == (-1)){ 
			flag = 1; 
			break;
		}
	}
	if(flag == 0){
		pFile = fopen ("liczby.txt","w");
		fprintf(pFile, "%d %d %d %d %d", li[0], li[1], li[2], li[3], li[4]);
		fclose (pFile);
	}
	else {
		pFile = fopen ("liczby.txt","r");
		if (pFile!=NULL){
			scanf( "%i %i %i %i %i", &li[0], &li[1], &li[2], &li[3], &li[4]);
		}
		else{
			flag1 = 1;} //plik do odczytu nie istnieje i flaga sie zmienia na 1
		fclose (pFile);
	}
	
	if ( flag1 == 0){
		int wynik = 0;
		double wynik2;
		char parametr; //parametr operacji sredniej
		char a = 'A';
		char b = 'G';
		char c = 'H';
		while (flag2 == 0){
			printf ("Jakiego rodzaju srednia chcesz obliczyc? (A/G/H)");
			scanf("%c", &parametr);
			if(parametr == a){
				pFile = fopen ("wynik.txt","w");
				wynik = (li[0]+li[1]+li[2]+li[3]+li[4])/5;
				flag2 = 1;
				fprintf(pFile, "Srednia arytmetyczna: %d", wynik);
				fclose (pFile);
			}
			else if(parametr == b){
				pFile = fopen ("wynik.txt","w");
				wynik = (li[0]*li[1]*li[2]*li[3]*li[4]);
				wynik2=(double)wynik;
				wynik2=pow(wynik2, 0.2);
				flag2 = 1;
				fprintf(pFile, "Srednia geometryczna: %lf", wynik2);
				fclose (pFile);
					
			}
			else if(parametr == c){
				pFile = fopen ("wynik.txt","w");
				wynik = 5/(1/li[0] + 1/li[1] + 1/li[2] + 1/li[3] + 1/li[4]);
				flag2 = 1;
				fprintf(pFile, "Srednia harmoniczna: %d", wynik);
				fclose (pFile);
			}
		}
		int min, max;
		
		max = min = li[0];
		for( i = 1; i < 5; i++){
			if(li[i] > max)
				max = li[i];
			if(li[i] < min)
				min = li[i];
		}
		pFile = fopen ("najwieksza.txt","w");
		fprintf(pFile, "%d", max);
		fclose (pFile);
		pFile = fopen ("najmniejsza.txt","w");
		fprintf(pFile, "%d", min);
		fclose (pFile);
	}
	return 0;
}
