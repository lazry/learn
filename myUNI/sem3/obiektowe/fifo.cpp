#include <iostream> 
#include <conio.h>
using namespace std;

#define RozmiarTablicy  6  

class FIFO{
		char  kolejka[RozmiarTablicy];
		char kolejkaPOM[RozmiarTablicy];
		int head;
		int tail;

 public:
   	FIFO();
	bool isFull();    			// sprawdzenie, czy kolejka jest pełna
	bool isEmpty();				// sprawdzenie, czy kolejka jest pusta
    void clear();		    	// wyczyszczenie (usunięcie) kolejki
	void enqueue(char wart);	// wstawienie na koniec kolejki elementu wart	  
	void dequeue(); 			// usunięcie z kolejki pierwszego elementu
	char first(); 				// odczytanie pierwszego elementu
};

FIFO::FIFO(){
	tail = -1;
	head = -1;
}

bool FIFO::isFull() {   
     if( tail == RozmiarTablicy-1)
         return 1;
     else
         return 0;
}

bool FIFO::isEmpty() {  
     if(tail == -1)
             return 1;
     else
         return 0;
}

void FIFO::clear() {
     tail = -1;   
}

void FIFO::enqueue(char wart) {
     if(tail != RozmiarTablicy-1){
             tail++;
             kolejka[tail] = wart;
             if(head == -1)
                     head = tail;
     }
     else 
          cout << endl << "Kolejka jest pelna" << endl;
}

void FIFO::dequeue() { 
     if(tail == head)tail = -1;
     if(tail != -1){ 
          copy(kolejka,kolejka + tail+1,kolejkaPOM );
          for(int i = 0; i < tail; i++)
          kolejka[i] = kolejkaPOM[i+1];
          tail--;
     }
     else
         cout << endl << "Kolejka jest pusta" << endl;
}

char FIFO::first() {   
     return kolejka[head];
}

int main(){
char elm, plc;
FIFO k, dk, k2;
	
                   cout << endl << "Wprowadz element kolejki" << endl;
	               for(int i = 0; i<6; i++){
                           elm=getche();
                           k.enqueue(elm);
                }
                   
     /*2.	Wykorzystując wynik realizacji pkt. 1, napisać program, 
     który porządkuje niemalejąco elementy zadanej kolejki FIFO, 
     korzystając z jednej pomocniczej kolejki FIFO i kilku prostych zmiennych.*/
     int rozmiar = RozmiarTablicy;
     int rozmiar2 = RozmiarTablicy;     
     char temp;
     int min = k.first();
     k.dequeue();
     for( int j = 0 ; j <rozmiar2; j++){
          for(int i = 0; i < rozmiar; i++){
             if(k.first() < min)
                        min = k.first();
             }
             for(int i = 0; i < rozmiar; i++){       
                     if( min != k.first()){
                     temp = k.first();
                     k.dequeue();
                     k.enqueue(temp);
             }
             else {
                  k.dequeue();
                  k2.enqueue(min);
          }}
     }
     cout << endl << "Zawartosc kolejki (pierwszy element od lewej)" << endl;
                     dk=k2;
                     while(!dk.isEmpty()){
                           cout << dk.first() << " ";
                           dk.dequeue();
                     } 
             
getche();     
return 0;	
}     
     
