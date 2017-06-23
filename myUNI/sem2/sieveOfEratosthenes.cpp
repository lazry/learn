#include <cstdlib>
#include <math.h>
#include <iostream>
using namespace std;

// structures
    struct liczba
    {
        liczba *next;
        int wartosc;
        int status;
    };

    struct lista
    {
        liczba *head;  // wskaźnik na początek listy
        liczba *straznik;
        void dodaj_liczbe ( int wartosc, int status);
        void wypisz_liste ();
        lista();
    };
    lista::lista() {
    head = 0;       // konstruktor
    }

void lista::dodaj_liczbe(int wartosc, int status) //add element of list
{
    liczba *p = new liczba;    // creates new element
    p->wartosc = wartosc;		// enter values of new element
    p->status = status;

    if (head==0) // sprawdzamy czy to pierwszy element listy
    {
        // jeżeli tak to nowy element jest teraz początkiem listy
        head = p;
        straznik = head;
    }

    else
    {
        // w przeciwnym wypadku idziemy do straznika
          straznik->next = p;
          p->next = 0;
          straznik = p;
    }
}
void lista::wypisz_liste(){     // writes all list elements values to cout
    liczba *temp = head;
    int x = 0;
    while (temp)
    {
        if( temp->status){
            x = temp->wartosc;
            cout<<x<<" ";
        }
        temp = temp->next;
    }
}

    int main(){
        int n, x;
        cout<<"Enter amount of numbers"<<endl;     // reads from cin number
        cin>>n;
        int max = sqrt(n);				// sqrt for further use
        lista li;
        for (int i = 1; i<=n; i++)              // tworzenie listy n-elementowej
            li.dodaj_liczbe( i, 1);
        liczba *p = li.head;
        for (int i=2; i<=max; i++)              // petla idzie od 2 do pierwiastka z n
        {
            liczba   *p = li.head;
            int j = i*i;
            while(p)                            //rozpoczecie przeszukiwania listy
            {
                if(p->wartosc == j){        //sprawdzenie dwoch warunkow w el. listy
                    p->status = 0;
                    j+=i;
                }
                if(j > n)
                    p=0;
                else
                p = p->next;
            }

        }
        li.wypisz_liste();
    }
