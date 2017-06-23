#include <algorithm>
#include <iostream>
#include <fstream>
#include <string>
#include <vector>
#include <iterator>
#include <functional>
#include <stdio.h>
#include <conio.h>
#include <ctime>
#include <cstdlib>
using namespace std;

long MierzCzas()
  {
   static clock_t start=0;
   clock_t teraz=clock();
   long wynik=((1000*(teraz-start)+(CLOCKS_PER_SEC>>1))/CLOCKS_PER_SEC);
   start=teraz;
   return wynik;
  }

void merge(vector<int>& a, int m, vector<int>& b, int n, vector<int>& c){ //merge and sort numbers
	int pa = 0, pb = 0, pc = 0;
	while(pa < m && pb < n){
		if(a[pa] < b[pb])
			c.push_back(a[pa++]);
		else
			c.push_back(b[pb++]);
	}
	if(pa == m)
		while(pb < n)	//Array A exhausted
			c.push_back(b[pb++]);
	else
		while(pa < m)	//Array B exhausted
			c.push_back(a[pa++]);
}

// klasa wezla B-drzewa udostepniajacy swoje prywatne wartosci klasie Btree
class BTreeNode
{
    int *keys;  // An array of keys
    int t;      // Minimum degree (defines the range for number of keys)
    BTreeNode **C; // An array of child pointers
    int n;     // Current number of keys
    bool leaf; // Is true when node is leaf. Otherwise false
public:
    BTreeNode(int _t, bool _leaf);   // Constructor

    // A utility function to insert a new key in the subtree rooted with
    // this node. The assumption is, the node must be non-full when this
    // function is called
    void insertNonFull(int k);

    // A utility function to split the child y of this node. i is index of y in
    // child array C[].  The Child y must be full when this function is called
    void splitChild(int i, BTreeNode *y);

// A function to search a key in subtree rooted with this node.
    BTreeNode *search(int k);   // returns NULL if k is not present.

// Make BTree friend of this so that we can access private members of this
// class in BTree functions
friend class BTree;
};

// A BTree
class BTree
{
    BTreeNode *root; // Pointer to root node
    int t;  // Minimum degree
public:
    // Constructor (Initializes tree as empty)
    BTree(int _t)
    {  root = NULL;  t = _t; }// function to search a key in this tree
    BTreeNode* search(int k)
    //jezeli korzen nie jest pusty to uruchamia sie funkcja search
    //zaglebiajaca sie w drzewo. zwraca NULL gdy lisc nie zostal znaleziony w
    // oczekiwanym miejscu
    {  return (root == NULL)? NULL : root->search(k); }

    // The main function that inserts a new key in this B-Tree
    void insert(int k);
};

// Constructor for BTreeNode class
BTreeNode::BTreeNode(int t1, bool leaf1)
{
    // Copy the given minimum degree and leaf property
    t = t1;
    leaf = leaf1;

    // Allocate memory for maximum number of possible keys
    // and child pointers
    keys = new int[2*t-1];
    C = new BTreeNode *[2*t];

    // Initialize the number of keys as 0
    n = 0;
}

// Function to search key k in subtree rooted with this node
BTreeNode *BTreeNode::search(int k)
{
    // Find the first key greater than or equal to k
    int i = 0;
    while (i < n && k > keys[i])
        i++;

    // If the found key is equal to k, return this node
    if (keys[i] == k)
        return this;

    // If key is not found here and this is a leaf node
    if (leaf == true)
        return NULL;

    // Go to the appropriate child
    return C[i]->search(k);
}

// The main function that inserts a new key in this B-Tree
void BTree::insert(int k)
{
    // If tree is empty
    if (root == NULL)
    {
        // Allocate memory for root
        root = new BTreeNode(t, true);
        root->keys[0] = k;  // Insert key
        root->n = 1;  // Update number of keys in root
    }
    else // If tree is not empty
    {
        // If root is full, then tree grows in height
        if (root->n == 2*t-1)
        {
            // Allocate memory for new root
            BTreeNode *s = new BTreeNode(t, false);

            // Make old root as child of new root
            s->C[0] = root;

            // Split the old root and move 1 key to the new root
            s->splitChild(0, root);

            // New root has two children now.  Decide which of the
            // two children is going to have new key
            int i = 0;
            if (s->keys[0] < k)
                i++;
            s->C[i]->insertNonFull(k);

            // Change root
            root = s;
        }
        else  // If root is not full, call insertNonFull for root
            root->insertNonFull(k);
    }
}

// A utility function to insert a new key in this node
// The assumption is, the node must be non-full when this
// function is called
void BTreeNode::insertNonFull(int k)
{
    // Initialize index as index of rightmost element
    int i = n-1;

    // If this is a leaf node
    if (leaf == true)
    {
        // The following loop does two things
        // a) Finds the location of new key to be inserted
        // b) Moves all greater keys to one place ahead
        while (i >= 0 && keys[i] > k)
        {
            keys[i+1] = keys[i];
            i--;
        }

        // Insert the new key at found location
        keys[i+1] = k;
        n = n+1;
    }
    else // If this node is not leaf
    {
        // Find the child which is going to have the new key
        while (i >= 0 && keys[i] > k)
            i--;

        // See if the found child is full
        if (C[i+1]->n == 2*t-1)
        {
            // If the child is full, then split it
            splitChild(i+1, C[i+1]);

            // After split, the middle key of C[i] goes up and
            // C[i] is splitted into two.  See which of the two
            // is going to have the new key
            if (keys[i+1] < k)
                i++;
        }
        C[i+1]->insertNonFull(k);
    }
}

// A utility function to split the child y of this node
// Note that y must be full when this function is called
void BTreeNode::splitChild(int i, BTreeNode *y)
{
    // Create a new node which is going to store (t-1) keys
    // of y
    BTreeNode *z = new BTreeNode(y->t, y->leaf);
    z->n = t - 1;

    // Copy the last (t-1) keys of y to z
    for (int j = 0; j < t-1; j++)
        z->keys[j] = y->keys[j+t];

    // Copy the last t children of y to z
    if (y->leaf == false)
    {
        for (int j = 0; j < t; j++)
            z->C[j] = y->C[j+t];
    }

    // Reduce the number of keys in y
    y->n = t - 1;

    // Since this node is going to have a new child,
    // create space of new child
    for (int j = n; j >= i+1; j--)
        C[j+1] = C[j];

    // Link the new child to this node
    C[i+1] = z;

    // A key of y will move to this node. Find location of
    // new key and move all greater keys one space ahead
    for (int j = n-1; j >= i; j--)
        keys[j+1] = keys[j];

    // Copy the middle key of y to this node
    keys[i] = y->keys[t-1];

    // Increment count of keys in this node
    n = n + 1;
}

int main(){
    vector<int> wejscie1;       //wektor na plik 1
    vector<int> wejscie2;       //wektor na plik 2
    vector<int> zlaczone;       //wektor na plik wyjsciowy
    long czas[6];               //tablica do zebrania czasow wykonywania procedur
    int value = 0;

    MierzCzas();
    ifstream myfile ("sort_1.txt");            //odczytuje plik pierwszy
                // test file open
                if (myfile) {
                // read the elements in the file into a vector
                    while ( myfile >> value )
                        wejscie1.push_back(value);
                    myfile.close();
                }
                    else cout << "Plik sort_1 nie istnieje.";
    value = 0;
    sort (wejscie1.begin(), wejscie1.end());    //sortuje plik pierwszy O nlog(n)
    czas[0] = MierzCzas();
    ifstream myfile2 ("sort_2.txt");            //odczytuje plik drugi
                // test file open
                if (myfile2) {
                // read the elements in the file into a vector
                    while ( myfile2 >> value )
                        wejscie2.push_back(value);
                    myfile2.close();
                }
                    else cout << "Plik sort_2 nie istnieje.";
    sort (wejscie2.begin(), wejscie2.end());    //sortuje plik drugi O nlog(n) -quicsort
    czas[1] = MierzCzas();
    merge(wejscie1, wejscie1.size(), wejscie2, wejscie2.size(), zlaczone); //wywolanie funkcji laczacej i sortujacej metoda scalania
    czas[2] = MierzCzas();

    ofstream outputFile("posort_3.txt");        //wpisuje do pliku posortowane wartosci scalonych i posortowanych dwoch ciagow
        for(int i = 0; i<zlaczone.size(); i++ ){
            outputFile<<zlaczone[i]<<endl;
        }
        outputFile.close();
    czas[3] = MierzCzas();
    BTree t(5);
    for( int i = 0; i < zlaczone.size(); i++)        //kazdy element posortowanego ciagu wklada do B-drzewa
        t.insert(zlaczone[i]);
    czas[4] = MierzCzas();

    //komunikat testowy i diagnostyczny
    cout<<"Plik sort_1:\nCzas potrzebny na wgranie i posortowanie pliku sort_1: "<<czas[0];
    cout<<" ms \nIlosc posortowanych liczb z pliku sort_1:\t"<<wejscie1.size()<<endl;
    cout<<"Plik sort_2:\nCzas potrzebny na wgranie i posortowanie pliku sort_2: "<<czas[1];
    cout<<" ms \nIlosc posortowanych liczb z pliku sort_2:\t"<<wejscie2.size()<<endl;
    cout<<"Plik posort_3:\nCzas potrzebny do posortowania i zapisu scalonych plikow: "<<czas[2];
    cout<<" ms \nIlosc posortowanych liczb do pliku posort_3:\t"<<zlaczone.size()<<endl;
    cout<<"Czas potrzebny do wypełnienia B-drzewa "<<czas[3]<<" ms."<<endl;

    //przeszukuje B-drzewo czy wybrana wartosc istnieje
    int wyjsc = 0;
    while(wyjsc != 1){
        cout<<"Wpisz wartosc, ktora chcesz znalezc w b-drzewie. Nacisnij 1, aby wyjsc z programu."<<endl;
        cin>>wyjsc;
        MierzCzas();
        (t.search(wyjsc) != NULL)? cout << "Jest w b-drzewie.\n" : cout << "Nie ma w b-drzewie.\n";
        czas[5] = MierzCzas();
        cout<<"Czas potrzebny do wyszukania wartosci w b-drzewie: "<<czas[5]<<" ms."<<endl;
    }
}

