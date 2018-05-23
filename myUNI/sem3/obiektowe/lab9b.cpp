/* lab9 - oddany

2.	Napisa? program wykorzystuj?cy  obiektow? implementacj? stosu (co najmniej jednego) do sprawdzenia, 
czy wczytane z klawiatury (znak po znaku) wyra?enie jest palindromem*. 
Zilustrowa? dzia?anie programu w bloku main().

#include <iostream> 
#include <conio.h>
using namespace std;

#define SIZE 100
class stack {
	int stck[SIZE];
	int ses;

public:
	stack();			// konstruktor tworz?cy stos pusty
	bool isFull();		// sprawdzenie czy stos jest pe?ny
	bool isEmpty();		// sprawdzenie czy stos jest pusty
	void clear();  		// wyczyszczenie stosu
	void push(char el); // w?o?enie na stos elementu el typu int
	void pop();     	// zdj?cie ze stosu szczytowego elementu
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
		cout << endl << "Stos jest juz pelny" << endl;
}
void stack::pop() {
	if (!isEmpty())
		ses--;
	else
		cout << endl << "Stos jest juz pusty" << endl;
}

char stack::top() {
	return stck[ses];
}

int main() {
	char znak;
	stack s, s2, s3;
	int ilosc = 0;
	cout << "Wprowadz ciag znaku jeden po drugim" << endl;
	do {
		cin >> znak;
		if (znak != ' ' && znak != '!') {
			s.push(znak);
			ilosc++;
		}
	} while (znak != '!');
	s3 = s;
	while (!s3.isEmpty()) {
		s2.push(s3.top());
		s3.pop();
	}
	while (!s.isEmpty()) {
		if (s.top() != s2.top()) {
			cout << "to nie jest palindrom!" << endl;
			system("pause");
			return 0;
		}
		s.pop();
		s2.pop();
	}
	cout << "to jest palindrom!" << endl;
	system("pause");
}*/