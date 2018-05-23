/*	LAB 4-5 - oddany
Dokończyć program ListaN.cpp, tworzący nieuporządkowaną listę jednokierunkową, zawierającą wprowadzane 
z klawiatury znaki(wartości typu char).Końcem tworzenia listy jest znak ’ / ’.
Zilustrować działanie poszczególnych metod w bloku main() programu(np.zgodnie z podanym przykładem).
*//*

#include <iostream> 
#include <conio.h>
#include <algorithm>
using namespace std;

class Node {
public:
	char dane;
	Node *next;
	Node(char znak, Node *ptr = NULL) {
		dane = znak;
		next = ptr;
	}
};
class List {
private:
	Node *head;  // wskaŸnik na pierwszy element listy
	Node *current;	//wkaznik na terazniejszy element list
	Node *previous; //wskaznik na poprzedni element listy do usuwania nodow
public:
	List() {
		head = NULL;
	}
	bool isEmpty() {	//sprawdza, czy lista jest pusta
		if (head == NULL)
			return 1;
		else return 0;
	}
	void addToHead(char WstZnak) {  		//dodaje element na pocz¹tek listy
		if (isEmpty()) { 	
			head = new Node(WstZnak, NULL);
		}
		else {
			current = new Node(WstZnak, NULL);
			current->next = head;
			head = current;
		}
	}
	void addToTail(char WstZnak){  		// dodaje element na koniec listy
		if (isEmpty()) {
			head = new Node(WstZnak, NULL);
		}
		else {
			previous = head;
			while (previous->next != NULL) {
				previous = previous->next;
			}
			current = new Node(WstZnak, NULL);
			previous->next = current;
		}
	}
	void deleteNode(char UsuwanyZnak) { 	// usuwa wszystkie wêz³y zawieraj¹ce podan¹ wartoœæ
		current = head;
		previous = head;
		while (current) {
			if (UsuwanyZnak == head->dane) {
				head = head->next;
				current = head;
			}
			else if (UsuwanyZnak == current->dane) {
				previous->next = current->next;
				current = previous;
			}
			previous = current;
			current = current->next;
		}
	}
	bool isInList(char SzukanyZnak){  	// sprawdza, czy element jest na liœcie
		current = head;
		while (current) {
			if (current->dane == SzukanyZnak)
				return 1;
			current = current->next;
		}
		return 0;
	}
	int countList() {					// okreœla liczbê elementów listy	
		current = head;
		int counter = 0;
		while (current) {
			counter++;
			current = current->next;
		}
		return counter;
	}
	void printAll() {     				// wyœwietla wszystkie elementy listy
		current = head;
		while (current) {
			printf("%c ", current->dane);
			current = current->next;
		}
		cout << endl;
	}
	void sortList() {					// porz¹dkuje listê niemalej¹co
		int ilosc = countList();
		char *li = new char[ilosc];
		current = head;
		int i = 0;
		while (current) {
			li[i] = current->dane;
			current = current->next;
			i++;
		}
		sort(li, li + ilosc);
		head->dane = li[0];
		current = head->next;
		i = 1;
		while (current) {
			current->dane = li[i];
			current = current->next;
			i++;
		}
	}
};


int main() {
	List MojaLista;
	char Znak, koniec;
	char wybor;
	do {
		printf("Wybierz funkcje e-isEmpty, h-addToHead, t-addToTail, d-deleteNode,\n"); 
		printf(" i-isInList, c-countList, p-printList, s-sortList. \"/\"to exit\n");
		cin >> wybor;
		switch (wybor) {
		case 'e':
			if (MojaLista.isEmpty()) {
				printf("Lista jest pusta\n");
			}
			else
				printf("Lista nie jest pusta\n");
			break;
		case 'h':
			printf("Wprowadz znak do dodania na head:\n");
			cin >> Znak;
			cout << endl;
			MojaLista.addToHead(Znak);
			break;
		case 't':
			printf("Wprowadz znak do dodania na tail:\n");
			cin >> Znak;
			cout << endl;
			MojaLista.addToTail(Znak);
			break;
		case 'd':
			printf("Wprowadz znak do usuniecia z listy:\n");
			cin >> Znak;
			cout << endl;
			MojaLista.deleteNode(Znak);
			break;
		case 'i':
			printf("Wprowadz znak do sprawdzenia jego obecnosci w liscie:\n");
			cin >> Znak;
			cout << endl;
			if (MojaLista.isInList(Znak))
				printf("Znak %c jest w liscie\n", Znak);
			else
			{
				printf("Znaku %c nie ma w liscie\n", Znak);
			}
			break;
		case 'c':
			cout << "W liscie jest " << MojaLista.countList() << " elementów" << endl;
			break;
		case 'p':
			MojaLista.printAll();
			break;
		case 's':
			MojaLista.sortList();
			break;
		default:
			printf("Wprowadzono bledny znak lub znak wyjscia\n");
		}
	} while (wybor != '/');

	cin >> koniec;
	return 0;
}*/

