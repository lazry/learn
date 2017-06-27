#include <algorithm>
#include <conio.h>
#include <cstdio>
#include <cstdlib>
#include <ctime>
#include <fstream>
#include <functional>
#include <iostream>
#include <iterator>
#include <limits>
#include <stdio.h>
#include <stdlib.h>
#include <string>
#include <vector>

#define ROZMIAR 1000000
using namespace std;

long MierzCzas()
  {
   static clock_t start=0;
   clock_t teraz=clock();
   long wynik=((1000*(teraz-start)+(CLOCKS_PER_SEC>>1))/CLOCKS_PER_SEC);
   start=teraz;
   return wynik;
  }

  void merge(vector<int>& a, int m, vector<int>& b, int n, ofstream &c){ //merge and sort numbers
	int pa = 0, pb = 0;
	while(pa < m && pb < n){
		if(a[pa] < b[pb])
			c<<a[pa++]<<endl;
		else
			c<<b[pb++]<<endl;
	}
	if(pa == m)
		while(pb < n)	//Array A exhausted
			c<<b[pb++]<<endl;
	else
		while(pa < m)	//Array B exhausted
			c<<a[pa++]<<endl;
}


  int main()
{
    long lines_count = 0;
    int file_count = 1;
    string line;
    char buffer[20];
    vector<string> fileArray;


    sprintf (buffer, "plikTym%d.txt", file_count );
    fileArray.push_back(buffer);
    ofstream outFile(fileArray[file_count-1]);
    ifstream inFile("als/lab_5.txt");
    if(inFile.is_open())
    {
        while(getline(inFile, line))
        {
            lines_count++;
            if ((lines_count%ROZMIAR) == 0){
                outFile.close();
                file_count++;
                sprintf (buffer, "plikTym%d.txt", file_count );
                fileArray.push_back(buffer);
                outFile.open(fileArray[file_count-1]);
            }
            outFile<<line<<endl;
        }
        outFile.close();
        inFile.close();
    }

    //rozpoczecie sortowania
    MierzCzas();
    while(fileArray.size()>1){
        vector<string> tempArray;       //wektor tymczasowy do storowania tymczasowej tablicy
        file_count = 1;
        //zbiera dla calego fileArray merge co dwa i zapisuje w trzecim wektorze tymczasowym, ktory jest oprozniany
        for( int i = 0; i < fileArray.size(); i+=2){
            vector<int> wejscie1;       //wektor na plik 1
            vector<int> wejscie2;       //wektor na plik 2
            int value = 0;
            int x = 0;

            ifstream myfile (fileArray[i]);            //odczytuje plik pierwszy
                // test file open
                if (myfile) {
                // read the elements in the file into a vector
                    while ( myfile >> value )
                        wejscie1.push_back(value);
                    myfile.close();
                }
                    else cout << "Plik sort_1 nie istnieje.";
            value = 0;
            sort (wejscie1.begin(), wejscie1.end());
            ifstream myfile2 (fileArray[i+1]);            //odczytuje plik drugi
                // test file open
                if (myfile2) {
                // read the elements in the file into a vector
                    while ( myfile2 >> value )
                        wejscie2.push_back(value);
                    myfile2.close();
                }
                    else {
                        cout << "Plik sort_2 nie istnieje.";
                        x = 1;
                    }
            //po wgraniu plikow usuwa te pliki!!
            remove(fileArray[i].c_str());
            remove(fileArray[i+1].c_str());

            //sprawdza czy sa to pliki milionowe (pierwsze, najmniejsze)
            if( fileArray.size() == lines_count/ROZMIAR){
                //dla tych plikow milionowych stosuje quicksorta
                sort (wejscie1.begin(), wejscie1.end());
                sort (wejscie2.begin(), wejscie2.end());
            }
            //robi merge do nowo stworzonego pliku o kolejnej nazwie spush_backowanej do tempArray
                sprintf (buffer, "plikTym%d.txt", file_count );
                tempArray.push_back(buffer);
                ofstream outFile(tempArray[file_count-1]);
                cout<<"outfile opened"<<tempArray[file_count-1]<<endl;
            //if its the last file to merge it changes its output file name
            if(fileArray.size() == 2){
                remove("plikTym1.txt");
                outFile.open("lab5_wy.txt");
            }
            //jesli nie ma drugiego pliku do polaczenia (ilosc plikow jest nieparzysta) to plik zostaje poprostu przepisany
            if (x == 1){
                for(int i = 0; i < wejscie1.size(); i++)
                    outFile<<wejscie1[i]<<endl;
            }
            //zlaczone wartosci zapisuje do pliku o nazwie kolejnej (uzyj zmiennej file_count)
            else  merge(wejscie1, wejscie1.size(), wejscie2, wejscie2.size(), outFile);
            outFile.close();
            file_count++;
        }
        //funkcja przewartosciowujaca fileArray przy uzyciu tymczasowego wektora
        // vector<tempObject>().swap(tempVector); to clear vector
        vector<string>(tempArray).swap(fileArray);         //update of fileArray
        vector<string>().swap(tempArray);                  //deletes temporary array

    }
    //komunikat diagnostyczny
    cout<<"Ilosc liczb w pliku wejsciowym: "<<lines_count<<"\nCzas sortowania: "<<MierzCzas()<<"ms.\n";
}
