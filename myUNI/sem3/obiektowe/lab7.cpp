/* Lab7 - DO ODDANIA
Wykorzystując dowolną implementację stosu (kolejki LIFO) napisać program, 
który wczytuje z klawiatury wyrażenie arytmetyczne zapisane w notacji postfiksowej (post order) 
i wyznacza wartość tego wyrażenia, np. dla wyrażenia postaci 2 3 – 4 5 + * program powinien wyznaczyć wartość –9. 
Dla uproszczenia przyjąć, że w wyrażeniu wykorzystywane są wyłącznie operatory dwuargumentowe, tj. *, /, +, -.*/
/*#include <iostream> 
#include <conio.h>
#include <string>
using namespace std;

#define SIZE 50
class stack {
	int stck[SIZE];
	int ses;

public:
	stack();			// konstruktor tworzący stos pusty
	bool isFull();		// sprawdzenie czy stos jest pełny
	bool isEmpty();		// sprawdzenie czy stos jest pusty
	void clear();  		// wyczyszczenie stosu
	void push(int el); // włożenie na stos elementu el typu int
	void pop();     	// zdjęcie ze stosu szczytowego elementu
	int top(); 		// odczytanie (bez zdejmowania) szczytowego elementu
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

void stack::push(int el) {
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

int stack::top() {
	return stck[ses];
}


//PROGRAM WLASCIWY
char main() {
	stack s;
	int a, b, wynik;		//zmienne do wykonywania dzialan
	// *, /, +, -. to ma dzialac

	printf("Wprowadz swoje wyraznie: ");
	//w wyrazenie wszystko ma byc oddzielone spacja oproc minusow od liczb ujemnych
	//wyrazenie zakanczane jest znakiem =
	char wyrazenie[SIZE-10];
	int i = -1;

	cin.getline(wyrazenie, SIZE-10);
	
	i = 0;
	while (wyrazenie[i] != '=') {
		if (wyrazenie[i] == ' ')
			i++;
		//cala obsluga operatora '-'
		if (wyrazenie[i] != '=') {
			if (wyrazenie[i] == '-' && wyrazenie[i + 1] != ' ') {
				wynik = -((wyrazenie[i + 1] - '0') % 48);
				s.push(wynik);
				i++;
			}
			else if (wyrazenie[i] == '-' && wyrazenie[i + 1] == ' ') {
				b = s.top();
				s.pop();
				a = s.top();
				s.pop();
				wynik = a - b;
				s.push(wynik);
			}
			// obsluga reszty operatorow
			else if (wyrazenie[i] == '+' || wyrazenie[i] == '*' || wyrazenie[i] == '/') {
				b = s.top();
				s.pop();
				a = s.top();
				s.pop();
				switch (wyrazenie[i]) {
				case '+':
					wynik = b + a;
					s.push(wynik);
					break;
				case '*':
					wynik = b * a;
					s.push(wynik);
					break;
				case '/':
					wynik = a / b;
					s.push(wynik);
					break;
				}
			}
			else {
				wynik = (wyrazenie[i] - '0') % 48;
				s.push(wynik);
				cout << "wrzucono na gore: " << s.top() << endl;
			}
			i++;
		}
	}
	
	printf("\nWynik to: %d", s.top());

	char z;
	cin >> z;
	return 0;
}*/