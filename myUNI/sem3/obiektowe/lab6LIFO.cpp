/* Lab6 - oddane 
#include <iostream> 
#include <conio.h>
using namespace std;

#define SIZE 100
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

char stack::top() {
	return stck[ses];
}

int main() {
	int liczbaD = 0;
	stack s, ds, s2;

	
	printf("Wprowadz liczbe dziesietna.\n");
	cin >> liczbaD;
	printf("liczba %d dziesietnie to (", liczbaD);
	while (liczbaD > 0) {;
		s.push(liczbaD % 2);
		liczbaD /= 2;
	 }
	ds = s;
	while (!ds.isEmpty()) {
		printf("%d", ds.top());
		ds.pop();
	}
	printf(") binarnie.\n");
	

	/*2)	wczytuje z klawiatury wyrażenie arytmetyczne z nawiasami, a następnie sprawdza poprawność ich sparowania. 
	W wyrażeniu mogą wystąpić nawiasy okrągłe (), kwadratowe [] oraz klamrowe {}.*//*
	printf("Wprowadz wyrazenie arytmetyczne / by zakonczyc\n");
	char wyrazenie[40];
	int i = -1;
	do {
		i++;
		scanf_s("%c", &wyrazenie[i]);
		s2.push(wyrazenie[i]);
	} while (wyrazenie[i] != '/');
	ds = s2;
	int flag=0, flag1=0, flag2 = 0, flag3 =0, flag4= 0, flag5= 0;
	int flag6 = 0; //flaga bledu wyrazenia
	while (!ds.isEmpty()) {
		if (ds.top() == '}') {
			flag = 1;
		}
		if (ds.top() == ']') {
			flag1 = 1;
		}
		if (ds.top() == ')') {
			flag2 = 1;
		}
		if (ds.top() == '{') {
			flag3 = 1;
		}
		if (ds.top() == '[') {
			flag4 = 1;
		}
		if (ds.top() == '(') {
			flag5 = 1;
		}
		if (flag3 == 1 && flag == 0) {
			flag6 = 1;
		}
		if (flag4 == 1 && flag1 == 0) {
			flag6 = 1;
		}
		if (flag5 == 1 && flag2 == 0) {
			flag6 = 1;
		}
		if (flag3 == 1 && ((flag4 == 0 && flag1 == 1) || (flag5==0 && flag2 ==1))) {
			flag6 = 1;
		}
		if (flag4 == 1 && (flag5 == 0 && flag2 == 1)) {
			flag6 = 1;
		}
		ds.pop();
	}
	if ((flag != flag3) || (flag1 != flag4) || (flag2 != flag5))
		flag6 = 1;
	if (flag6) {
		printf("\nNawiasy w wyrazeniu zostaly niepoprawnie sparowane!");
	}
	else
		printf("\nNawiasy w wyrazeniu zostaly poprawnie sparowane!");

	char x;
	cin >> x;
	return 0;
}*/