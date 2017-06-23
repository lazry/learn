#include <cstdlib>
#include <math.h>
#include <iostream>
#include <string.h>
#include <algorithm>        // nie wszystkie biblioteki byly tu konieczne i sa pozostalosciami prob i bledow
#include <fstream>
#include <string>
using namespace std;


int main(){
        string s1, s2;
        int d1, d2;




        ifstream myfile ("in_1.txt");                                       //odczytuje plik pierwszy
                          if (myfile.is_open())
                          {
                              myfile >> s1;                                 //plik w postaci stringa jest wgrywany do s1 - stosu1
                              d1 = s1.length();                             //sprawdzana jest ilosc cyfr w liczbie

                            myfile.close();
                          }
                          else cout << "Plik liczby 1 nie istnieje";        // gdy plik nie istnieje wyswietla sie ten komunikat
        ifstream myfile2 ("in_2.txt");                                      //odczytuje plik drugi - dzialanie takie samo ja z plikiem pierwszym
                          if (myfile2.is_open())
                          {
                              myfile2 >> s2;
                              d2 = s2.length();
                            myfile2.close();
                          }
                          else cout << "Plik liczby 2 nie istnieje";

        int d3 = 0;
        if (d1>d2) d3 = d1+1;       //jezeli dlugosc stosu pierwszego jest wieksza od dlugosci stosu drugiego to stos pierwszy jest dlugosci stosu 1 +1
        else d3 = d2+1;             // w przeciwnym przypadku dlugosc stosu 3 jest rowna dlugosci stosu 2 +1

        char stos3[d3];

        int c1 = 0, c2 = 0, w = 0, r = 0, x = 0;  // cyfra 1, cyfra 2, wierzcholek stosu3, reszta z dzielenia, wynik
            d1--;
            d2--;
        while((d1>=0) || (d2>=0) || (r != 0)){        //warunek na dojscie do konca obu stosow s1 i s2 oraz brak reszty z dodawania do dopisania
            if(d1 < 0) c1 = 0;                    //sprawdzenie czy pierwszy stos doszedl juz  do konca
            else c1 = s1[d1]%48;                  //do cyfry pierwszej jest prtzypisywana wartosc ze stosu pierwszego od konca przy konwersji z kodu ASCII na inta przy pomocy modulo 48
            if(d2 < 0) c2 = 0;                    //sprawdzenie czy drugi stos doszedl juz  do konca
            else c2 = s2[d2]%48;                  //do cyfry drugiej przypisywana wartosc stosu od konca (wierzcholka) z rownoczesna konwersja na inta
            x = r + c1 + c2;                        // suma wartosci cyfry z pierwszego stosu, drugiego stosu oraz reszty z dodawania poprzednich elementow stosu

            if (x >= 10){                           //sprawdzenie czy konieczne jest stworzenie reszty
                stos3[w] = x+38;                    //jesli jest taka koniecznosc sprawdza sie wartosc ktora nie wykracza poza cyfre jednosci + kod ASCII - 10
                r = 1;                              //reszta jest konieczna i jej wartosc wynosi 1
            }
            else {
                stos3[w] = x+48;                       // gdy reszta nie jest potrzebna na wierzcholek stosu 3 przypisuje wartosc taka jaka jest + kod ASCII
                r = 0;                              // reszta niepotrzebna takze jej wartosc wynosi 0
            }
            w++;                    //wierzcholek stosu 3 rosnie aby moc "polozyc" na stosie kolejny element
            d1--;                   //zdjemujemy kolejne elementy ze stosow 1 oraz 2
            d2--;


        }

        ofstream myfile3 ("out_1.txt");// wpisuje do pliku wynik dodawania od konca stosu 3
          if (myfile3.is_open())
          {
            for( int i = w-1; i>0; i--) // iteracja leci od wierzcholka stosu, z pominieciem NULL konczacego tablice, w dol zdejmujac kolejne elementy ze stosu
                myfile3 << stos3[i];
            myfile3.close();
          }
          else cout << "Unable to open file out_1"; // gdy pliku do zapisu nie ma wyskakuje blad

    }

