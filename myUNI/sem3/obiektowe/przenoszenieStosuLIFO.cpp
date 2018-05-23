/*	Lab2 - oddany
	za pomoca dwoch stosow kopiuje zawartosc w takiej samej kolejnosci do drugiego
*//*
#include <iostream> 
#include <conio.h>
using namespace std;

#define SIZE 5
class stack {
	int stck[SIZE];
	int ses;

public:
	stack();			// konstruktor tworzący stos pusty
	bool isFull();		// sprawdzenie czy stos jest pełny
	bool isEmpty();		// sprawdzenie czy stos jest pusty
	void clear();  		// wyczyszczenie stosu
	void push(char el); // włożenie na stos elementu el typu int
	void pop();     	// zdjęcie ze stosu szczytowego elementu
	char top(); 		// odczytanie (bez zdejmowania) szczytowego elementu
};

stack::stack() {
	ses = -1;
}

bool stack::isFull() {
	if (ses == (SIZE - 1)) {
		return 1;
	}
	else {
		return 0;
	}
}

bool stack::isEmpty() {
	if (ses == -1)
		return 1;
	else
		return 0;
}

void stack::clear(void) {
	ses = -1;
}

void stack::push(char el) {
	if (!isFull()) {
		ses++;
		stck[ses] = el;
	} 
	else 
		cout<< endl << "Stos jest juz pelny"<<endl;
}
void stack::pop() {
	if (!isEmpty())
		ses--;
	else
		cout<< endl << "Stos jest juz pusty"<<endl;
}

char stack::top() {
	return stck[ses];
}

int main() {
	char elm;
	char zap;
	int size3 = 0;
	stack s, ds, s2;

	//zapis stosu 1
	for (int i = 0; i < SIZE; i++) {
		cout << endl << "Wprowadz element stosu" << endl;
		cin>> elm;
		s.push(elm);
		size3++;
	}
	cout << endl << "Zawartosc stosu 1 (szczyt stosu u gory)" << endl;
	ds = s;
	while (!ds.isEmpty()) {
		cout << ds.top() << endl;
		ds.pop();
	}

	//przerzucanie stosow
	for (int j = 0; j < SIZE; j++) {
		//wrzucanie na S2
		for (int i = 0; i<size3; i++) {
			s2.push(s.top());
			s.pop();
		}
		//zapis gornej wartosci S2 (pierwszej S1)
		zap = s2.top();
		//przerzucenie S2 z powrotem na S1
		for (int i = 0; i<size3; i++) {
			s.push(s2.top());
			s2.pop();
		}
		s2.push(zap);
		size3--;
	}
	s.clear();
	//wyswietlana jest ostateczna postac S2
	cout << endl << "Zawartosc stosu 2 (szczyt stosu u gory)" << endl;
	ds = s2;
	while (!ds.isEmpty()) {
		cout << ds.top() << endl;
		ds.pop();
	}


	char x;
	cin>>x;
	return 0;
}*/
