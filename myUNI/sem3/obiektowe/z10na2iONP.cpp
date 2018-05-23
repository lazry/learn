/*	 pierwsza czesc zamienia liczbe dziesietna na binarna, a druga oblicza dzialanie zapisane 
	 w Odwrtonej Notacji Polskiej */
#include <string>
#include <iostream>
#include <algorithm>
#include <stack>
#include <queue>

using namespace std;
#define SIZE 100

int main()
{
	int x, y;
	stack <int> binar;
	printf("podaj liczbe dziesietna by otrzymac binarna.\n");
	cin >> x;
	while (x >= 1) {
		y = x % 2;
		binar.push(y);
		x /= 2;
	}
	while (!(binar.empty())) {
		printf("%d", binar.top());
		binar.pop();
	}/*
	stack <int> s;
	int a, b, wynik;		//zmienne do wykonywania dzialan
							// *, /, +, -. to ma dzialac

	printf("Wprowadz swoje wyraznie: ");
	//w wyrazenie wszystko ma byc oddzielone spacja oproc minusow od liczb ujemnych
	//wyrazenie zakanczane jest znakiem =
	char wyrazenie[SIZE - 10];
	int i = -1;

	cin.getline(wyrazenie, SIZE - 10);

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
	cin >> x;
}*/
