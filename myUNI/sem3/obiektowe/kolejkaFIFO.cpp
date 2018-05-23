/* Lab3 - DO ODDANIA
sortowanie listy jednokierunkowej przy pomocy drugiej listy jednokoerunkowej
*//*
#include <iostream> 
#include <conio.h>
using namespace std;

#define RozmiarTablicy  7  

class FIFO {
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

FIFO::FIFO() {
	tail = -1;
	head = -1;
}

bool FIFO::isFull() {
	if (tail == RozmiarTablicy - 1)
		return 1;
	else
		return 0;
}

bool FIFO::isEmpty() {
	if (tail == head)
		return 1;
	else
		return 0;
}

void FIFO::clear() {
	tail = -1;
}

void FIFO::enqueue(char wart) {
	if (!isFull()) {
		kolejka[++tail] = wart;
	}
	else
		cout << endl << "Kolejka jest pelna" << endl;
}

void FIFO::dequeue() {
	if (!isEmpty()) {
		for (int i = 0; i <= tail; i++) {
		kolejkaPOM[i] = kolejka[i];
	}
		for (int i = 0; i < tail; i++)
			kolejka[i] = kolejkaPOM[i + 1];
		tail--;
	}
	else
		cout << endl << "Kolejka jest pusta" << endl;
}

char FIFO::first() {
	if (isEmpty()){
		cout << "Kolejka jest juz pusta" << endl;
	}
	else
		return kolejka[0];
}

int main() {
	char elm;
	FIFO k, dk, k2;

	cout << endl << "Wprowadz element kolejki" << endl;
	for (int i = 0; i< RozmiarTablicy-1; i++) {
		cin >> elm;
		k.enqueue(elm);
	}


	//który porządkuje niemalejąco elementy zadanej kolejki FIFO,
	//korzystając z jednej pomocniczej kolejki FIFO i kilku prostych zmiennych.
	int rozmiar2; //AKTUALNY ROZMIAR KOLEJKI1
	int rozmiar = rozmiar2 = RozmiarTablicy-1;
	char temp;
	int min;
	
	while (rozmiar2) {
		min = k.first();
		for (int i = 0; i < rozmiar; i++) {
			//pierwszy wrzucamy na koniec i go zdejmujemy
			k.enqueue(k.first());
			k.dequeue();
			if (k.first() < min) {
				min = k.first();
			}
		}
		for (int i = 0; i < rozmiar; i++) {
			if (k.first() == min) {
				k2.enqueue(min);
				k.dequeue();
				rozmiar2--;
			}
			else {
				k.enqueue(k.first());
				k.dequeue();
			}
			rozmiar = rozmiar2;
		}
	}


	//ODCZYTYWANIE POSORTOWANEJ KOLEJKI
	cout << endl << "Zawartosc kolejki (pierwszy element od lewej)" << endl;
	dk = k2;
	while (!dk.isEmpty()) {
		cout << dk.first() << " ";
		dk.dequeue();
	}

	cin>> elm;
	return 0;
}*/