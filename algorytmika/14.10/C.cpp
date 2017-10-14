#include <cstdio>
#include <algorithm>
using namespace std;

int main(){
	// ilosc odcinkow
	int n = 0; 
	int indeks = 0, next = 0;
	int f1 = 0, f2 = 0;

	scanf ("%d", &n);
	int trasa[n];
	for(int i = 0; i<n; i++)
		scanf ("%d", &trasa[n]);
	indeks = max_element(trasa, trasa + n); 
	next = indeks;
	for(int i = 0; i<n; i++){
		if (trasa[next] < trasa[next++]) f1 = 1;	
		if (next == (n-1)) next = 0;
		else next++;
	}
	next = indeks;
	for(int i = 0; i<n; i++){
		if (trasa[next] < trasa[next--]) f2 = 1;	
		if (next == 0) next = n-1;
		else next--;
	}

	if(f1 && f2) printf("%s", "NIE");
	else printf("%s", "TAK");
	
}
