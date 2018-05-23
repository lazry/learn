/* program wczytuje tekst i pozwala wyszukac uzytkownikowi wszystkie wiersze,
	w ktorych znajduje sie jego wybrane slowo/zdanie */
#include<iostream>
#include<string>
#include <fstream>

using namespace std;
class Teksty {
	string tekst[100];
	int ilosc = 0;

public:
	void wczytaj(); //wstawianie
	void wyszukaj(string x);
};

void Teksty::wczytaj() {
	ifstream infile("Tekst.txt");
	string line;
	int i = 0;
	if (infile.is_open()) {
		while (getline(infile, line)) {
			tekst[i] = line;
			i++;
		}
		ilosc = i;
		infile.close();
	}
}
void Teksty::wyszukaj(string x) {
	for (int i = 0; i < ilosc; i++) {
		if (tekst[i].find(x) != std::string::npos) {
			cout << "Fragment znaleziony w wierszu numer " << i + 1 << endl;
			cout << tekst[i] << endl;
		}
	}
}

int main()
{
	Teksty t;
	t.wczytaj();

	string wyszukaj;
	while (1) {
		cout << "Po jakim slowie wyszkiwac?" << endl;
		cin >> wyszukaj;
		t.wyszukaj(wyszukaj);
	}
}
