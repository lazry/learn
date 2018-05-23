/* Lab8 

Napisać program realizujący obiektową implementację znakowego drzewa typu BST, z operacjami Dodaj(), Usun(), Szukaj().
Zilustrować działanie programu w bloku main(), adaptując odpowiednio funkcję print_tree().

Program tworzy i wyświetla liczbowe drzewo typu BST
*/
#include <stdlib.h>
#include <stdio.h>
/*
//POPRAWIONA BUDOWA KLASY B-TREE
class Node {
public:
	int key;
	int *up;
	int *left;
	int *right;
public:
	Node(int k, int *father) {
		key = k;
		up = father;
	}
	int Value() {
		return key;
	}
};
class Btree {
private:
	char kolejka[RozmiarTablicy];
	char kolejkaPOM[RozmiarTablicy];
	int head;
	int tail;
public:
	Btree();
	void Add();
	void Delete();
	bool Search();
	void print_tree(); //rysuje B drzewo
}
*/
/* Z ZAJEC
typedef int BOOLEAN;
typedef int ETYPE;

typedef struct NODE *TREE;
struct NODE {
ETYPE element;
TREE left, right;
} *root;

// funkcja print_tree(T,l) wyświetla drzewo T poczynając od korzenia
void print_tree(TREE T, int l);

// funkcja insert (x, T) dodaje wartosc x do drzewa T
TREE insert(ETYPE x, TREE T);


int main(){
char s[80];
root = NULL;  // inicjacja korzenia 
do {
	printf("Wpisz liczbe i nacisnij Enter (sam Enter konczy tworzenie drzewa): ");
	gets(s);
	if (*s) root = insert(atoi(s), root); //Znak ENTER nie wchodzi do drzewa
} while (*s);
printf("\n\nWyswietlanie drzewa z lewa na prawo (zamiast z gory w dol)");
printf("\n\n");
print_tree(root, 0);
printf("\n\n");
printf("Nacisnij Enter aby zakonczyc program");
gets(s);
return 0;
}

TREE insert(ETYPE x, TREE T) {
	if (T == NULL) {
		T = (TREE)malloc(sizeof(struct NODE));
		T->element = x;
		T->left = NULL;
		T->right = NULL;
	}
	else if (x < T->element)
		T->left = insert(x, T->left);
	else if (x > T->element)
		T->right = insert(x, T->right);
	return T;
}


void print_tree(TREE T, int l) {
	int i;
	if (!T) return;
	print_tree(T->right, l + 1);
	for (i = 0; i<l; ++i) printf("   ");
	printf("%i\n", T->element);
	print_tree(T->left, l + 1);
}*/


/* Z INTERNETU
class NODE {
	int data;
	NODE *left;
	NODE *right;
	NODE *up;

public:
	NODE(int insert);
	}

	NODE::NODE(int insert) {
		data = insert; 
		left = NULL;
		right = NULL;
	}

	////////////////////DRZEWO
	class BSTree {
		NODE root;
	public:
		BSTree();
		void Add(int value);
		void Delete();
		bool Search();
		void PrintTree(NODE n);
	}
		BSTree::BSTree() {
			root = NULL;
		}
		void BSTree::Add(int value) {
			if (root == null)
				root = new Node(value);
			else
				add(root, value);
		}
		void BSTree::Delete(){
		}
		bool BSTree::Search() {
		}
		void BSTree::PrintTree(NODE n) {
			if (n.left != null)
				print(n.left);
			System.out.println(n.data);
			if (n.right != null)
				print(n.right);
		}
	/**
	* Tree method to add new element
	*
	* @param data is a new data we want to add to a tree
	*//*
	public void addToTree(int data) {
		if (root == null)
			root = new Node(data);
		else
			add(root, data);
	}

	// Private method that add new element
	private void add(Node target, Comparable data) {
		if (data.compareTo(target.data)<0) {
			if (target.left == null)
				target.left = new Node(data);
			else
				add(target.left, data);
		}
		else {
			if (target.right == null)
				target.right = new Node(data);
			else
				add(target.right, data);
		}

	}

	
	

	public static void main(String[] args) {
		Node tree = new Node();
		tree.addToTree(1);
		tree.addToTree(7);
		tree.addToTree(3);
		tree.addToTree(4);
		tree.addToTree(2);
		tree.printTree();
	}
}
*/

