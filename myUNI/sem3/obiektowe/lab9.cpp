/*1.	Napisać program realizujący obiektową implementację generowania wszystkich 
anagramów słowa wczytanego z klawiatury, przy czym anagram jest wyrazem utworzonym przez dowolne przestawienie 
liter w wyrazie wejściowym. Zadanie rozwiązać bez wykorzystywania biblioteki STL (chyba, że do implementacji stosu). 
Zilustrować działanie programu w bloku main(). 

#include <string>
#include <iostream>
#include <algorithm>

using namespace std;

class ANAGRAM {
	string word;
	string perm;
	string tablica[1000];
	int i = 0;
public:
	void Permute(string word, string perm);
	void Print();
};

void ANAGRAM::Print() {
	int j;
	sort(tablica->begin(), tablica.end());
	for (j = 0; j <= i; j++) {
		if (tablica[j] == tablica[j + 1])
			j++;
		else
			cout << tablica[j] << ", ";
	}
}

void ANAGRAM::Permute(string word, string perm) {
	if (word.empty())
	{
		tablica[i] = perm;
		i++;
		return;
	}

	for (int i = 0; i<word.size(); ++i)
	{
		string word2 = word;

		word2.erase(i, 1);

		string perm2 = perm;

		perm2 += word.at(i);

		Permute(word2, perm2);
	}
}


int main()
{
	string orig;
		cout << "Wprowadz ciag znakow do utworzenia anagramu" << endl;
		cin >> orig;
	string perm;
	ANAGRAM anagramek;
	anagramek.Permute(orig, perm);
	anagramek.Print();

	system("pause");

	return 0;
}*/