/*	Lab1 - do skonczenia
Napisac program, który umozliwi realizacje podstawowych dzialan (wczytaj, wypisz, wyznacznik, transponuj, 
odwroc) na macierzach dowolnego, okreslonego dyrektywa #define, rzedu. */
/*
#include <iostream>
using namespace std;

#define  Rozmiar  4

class Macierz {
	float Macierz[Rozmiar][Rozmiar],
		MacierzTransponowana[Rozmiar][Rozmiar],
		MacierzOdwrotna[Rozmiar][Rozmiar];
	float Wyznacznik;

public:
	void WczytajMacierz() {
		for (int j = 0; j < Rozmiar; j++) {
			for (int i = 0; i < Rozmiar; i++) {
				printf("Podaj liczbe z wiersza %d i kolumny %d\n", j, i);
				scanf("%f", &Macierz[j][i]);
			}

		}
	}
	void WypiszMacierz() {
		for (int j = 0; j < Rozmiar; j++) {
			for (int i = 0; i < Rozmiar; i++)
				printf("%f ", Macierz[j][i]);
			printf("\n");
		}
	}
	float determ(float a[Rozmiar][Rozmiar], int n) {
		float det = 0, temp[Rozmiar][Rozmiar];
		int p, h, k, i, j;
		if (n == 1) {
			return a[0][0];
		}
		else if (n == 2) {
			det = (a[0][0] * a[1][1] - a[0][1] * a[1][0]);
			return det;
		}
		else {
			for (p = 0; p<n; p++) {
				h = 0;
				k = 0;
				for (i = 1; i<n; i++) {
					for (j = 0; j<n; j++) {
						if (j == p) {
							continue;
						}
						temp[h][k] = a[i][j];
						k++;
						if (k == n - 1) {
							h++;
							k = 0;
						}
					}
				}
				det = det + a[0][p] * pow(-1, p)*determ(temp, n - 1);
			}
			return det;
		}
	}
	void ObliczWyznacznik() {
		float wynik;
		wynik = determ(Macierz, Rozmiar);
		Wyznacznik = wynik;
	}
	void WypiszWyznacznik() {
		printf("Wyznacznik: %f", Wyznacznik);
	}
	void TransponujMacierz() {
		for (int j = 0; j < Rozmiar; j++)
			for (int i = 0; i < Rozmiar; i++)
				MacierzTransponowana[i][j] = Macierz[j][i];
	}
	void WypiszMacierzTransponowana() {
		for (int j = 0; j < Rozmiar; j++) {
			for (int i = 0; i < Rozmiar; i++)
				printf("%f ", MacierzTransponowana[j][i]);
			printf("\n");
		}
	}
	void OdwrocMacierz() {
		if (Wyznacznik != 0) {

		}
		else printf("Wyznacznik jest równy zero!");
	}
	void WypiszMacierzOdwrotna();
};

int main() {
	char dalej;
	Macierz A;

	A.WczytajMacierz();
	A.WypiszMacierz();
	A.ObliczWyznacznik();
	A.WypiszWyznacznik();
	A.TransponujMacierz();
	A.WypiszMacierzTransponowana();
	A.OdwrocMacierz();
	A.WypiszMacierzOdwrotna();

	cin >> dalej;
	return 0;
}*/
