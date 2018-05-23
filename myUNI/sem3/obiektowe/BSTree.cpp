/*#include<iostream>
#include<conio.h>
#include<queue>

using namespace std;

class Element{
   friend class BST;
   int data;
   Element *left;
   Element *right;
};

class BST{
   friend class Element;
   
   private:
   Element* root; //korzen
   Element* insert(int x, Element* t); //wstawianie
   Element* findMin(Element* t); //funkcja pomocnicza dla remove()
   Element* findMax(Element* t); //funkcja pomocnicza dla remove()
   Element* remove(int x, Element *t); //usuwanie
   Element* find(Element *t, int x); //wyszukiwanie
   void printtree(Element *t, int l); //wyswietlanie graficzne drzewa
   void inorder(Element *t); //wyswietlanie w porzadku inorder
   Element* makeEmpty(Element* t); //funkcja pomocnicza dla destruktora
   Element* findParent(Element* t, int x);
   Element* rightRotate(int x);
   Element* leftRotate(int x);
   void printlevels(Element *t);
   
   public:
   BST();
   ~BST();
   void insert(int x); //wstawianie
   void remove(int x); //usuwanie
   void search(int x); //wyszukiwanie
   void printtree(); //wyswietlanie graficzne drzewa
   void inorder(); //inorder
   void rightR(int x);
   void leftR(int x);
   void findParent(int x);
   void printlevels();
};

void BST::printlevels(Element *t){
   if (!t) return;
   queue<Element*> Kolejka;
   Kolejka.push(root);
   while (!Kolejka.empty()) {
      Element *tmp = Kolejka.front();
      Kolejka.pop();
      if (tmp) {
         cout << tmp->data << " ";
         Kolejka.push(tmp->left);
         Kolejka.push(tmp->right);
      }
   }
}

void BST::printlevels(){
   cout << endl << "Przejscie wzdluzne drzewa:" << endl;
   printlevels(root);
   cout << endl;
}

Element* BST::findParent(Element *t, int x){
   if(t->right!=NULL && t->right->data== x) return t;
   if(t->left!=NULL && t->left->data== x) return t;
   if(t== NULL) return NULL;
   if(t->left==NULL && t->right==NULL) return NULL;
   else if(t->right!=NULL && t->data < x) return findParent(t->right,x);
   else if(t->left!=NULL && t->data > x) return findParent(t->left,x);
}

void BST::findParent(int x){
   Element *tmp = new Element;
   tmp = findParent(root, x);
   if(tmp!=NULL) cout << "Rodzic: " << tmp->data << endl;
   else cout << "Brak rodzica!" << endl;
}

Element* BST::leftRotate(int x){
   Element *tmp = find(root, x);
   if(tmp==NULL) return NULL;
   else{
      Element *parent=findParent(root, x);
      Element *temp;
      temp = parent->right;
      parent->right = temp->left;
      temp->left = parent;
      return tmp;
   }
}

Element* BST::rightRotate(int x){
   Element *tmp = find(root, x);
   if(tmp==NULL) return NULL;
   else{
      Element *parent=findParent(root, x);
      Element *temp;
      temp = parent->left;
      parent->left = temp->right;
      temp->right = parent;
      return tmp;
   }
}
       
Element* BST::makeEmpty(Element* t){
   if(t == NULL)
      return NULL;
      {
         makeEmpty(t->left);
         makeEmpty(t->right);
         delete t;
      }
   return NULL;
}

Element* BST::insert(int x, Element* t){
   if(t == NULL){
      t = new Element;
      t->data = x;
      t->left = t->right = NULL;
   }
   else if(x < t->data)
      t->left = insert(x, t->left);
   else if(x >= t->data)
      t->right = insert(x, t->right);
   return t;
}

Element* BST::findMin(Element* t){
   if(t == NULL) return NULL;
   else if(t->left == NULL) return t;
   else return findMin(t->left);
}

Element* BST::findMax(Element* t){
if(t == NULL) return NULL;
else if(t->right == NULL) return t;
else return findMax(t->right);
}

Element* BST::remove(int x, Element* t){
   Element* temp;
      if(t == NULL) return NULL;
      else if(x < t->data) t->left = remove(x, t->left);
      else if(x > t->data) t->right = remove(x, t->right);
      else if(t->left && t->right){
         temp = findMin(t->right);
         t->data = temp->data;
         t->right = remove(t->data, t->right);
      }
      else{
         temp = t;
         if(t->left == NULL) t = t->right;
         else if(t->right == NULL) t = t->left;
         delete temp;
      }

   return t;
}

void BST::inorder(Element* t){
   if(t == NULL) return;
   inorder(t->left);
   cout << t->data << " ";
   inorder(t->right);
}
    
void BST::printtree(Element *t, int l){
   int i;
   if(!t) return;
   printtree(t->right, l+1);
   for(i=0; i<l; ++i) printf("   ");
   printf("%i\n", t->data);
   printtree(t->left, l+1);
}

Element* BST::find(Element* t, int x){
   if(t == NULL){
      cout << "Element nie znajduje sie w drzewie!" << endl;
      return NULL;
   }
   else if(x < t->data)
      return find(t->left, x);
   else if(x > t->data)
      return find(t->right, x);
   else{
      cout << "Element znajduje sie w drzewie!" << endl;
      return t;
   }
}

BST::BST(){
   root = NULL;
}

BST::~BST(){
   root = makeEmpty(root);
}

void BST::insert(int x){
   root = insert(x, root);
}

void BST::remove(int x){
   root = remove(x, root);
}

void BST::inorder(){
   inorder(root);
   cout << endl;
}

void BST::printtree(){
   printtree(root,0);
}
    
void BST::search(int x){
   Element *tmp;
   tmp = find(root, x);
}

void BST::leftR(int x){
   Element *tmp2;
   Element *tmp=findParent(root,x);
   tmp2 = leftRotate(x);
   if(tmp2==NULL) cout << "Element nie znajduje sie w drzewie, nie udalo sie obrocic" << endl;
   else{
      if(root->data == tmp->data) this->root = tmp2;
      else tmp=tmp2;
      cout << "Rotacja zakonczona powodzeniem" << endl;
   }
}

void BST::rightR(int x){
   Element *tmp=findParent(root,x);
   Element *tmp2;
   tmp2 = rightRotate(x);
   if(tmp2==NULL) cout << "Element nie znajduje sie w drzewie, nie udalo sie obrocic" << endl;
   else{
      cout << "Rotacja zakonczona powodzeniem" << endl;
      if(root->data == tmp->data) this->root = tmp2;
      else tmp=tmp2;
   }
}

int main(){
   BST t;
   char mode;
   cout << endl << "[1] - dodanie elementu do drzewa BST" << endl;
   cout << "[2] - usuniecie elementu z drzewa" << endl;
   cout << "[3] - sprawdzenie czy element znajduje sie w drzewie" << endl;
   cout << "[4] - graficzne wyswietlenie zawartosci drzewa" << endl;
   cout << "[5] - wyswietlenie zawartosci drzewa w porzadku inorder" << endl;
   cout << "[7] - wyswietlenie zawartosci drzewa po poziomach" << endl;
   cout << "[8] - obrocenie wybranego elementu w prawo" << endl;
   cout << "[9] - obrocenie wybranego elementu w lewo" << endl;
   cout << "[q] - koniec programu" << endl;
   cin>>mode;
   while(mode != 'q'){
   if(mode == '1'){
      int elem;
      cout << endl << "Podaj element, ktory chcesz dodac do drzewa: ";
      cin >> elem;
      t.insert(elem);
	  cout << endl << "[1] - dodanie elementu do drzewa BST" << endl;
	  cout << "[2] - usuniecie elementu z drzewa" << endl;
	  cout << "[3] - sprawdzenie czy element znajduje sie w drzewie" << endl;
	  cout << "[4] - graficzne wyswietlenie zawartosci drzewa" << endl;
	  cout << "[5] - wyswietlenie zawartosci drzewa w porzadku inorder" << endl;
	  cout << "[7] - wyswietlenie zawartosci drzewa po poziomach" << endl;
	  cout << "[8] - obrocenie wybranego elementu w prawo" << endl;
	  cout << "[9] - obrocenie wybranego elementu w lewo" << endl;
	  cout << "[q] - koniec programu" << endl;
	  cin >> mode;
   }
   else if(mode == '2'){
      int elem;
      cout << endl << "Podaj element, ktory chcesz usunac: ";
      cin >> elem;
      t.remove(elem);
	  cout << endl << "[1] - dodanie elementu do drzewa BST" << endl;
	  cout << "[2] - usuniecie elementu z drzewa" << endl;
	  cout << "[3] - sprawdzenie czy element znajduje sie w drzewie" << endl;
	  cout << "[4] - graficzne wyswietlenie zawartosci drzewa" << endl;
	  cout << "[5] - wyswietlenie zawartosci drzewa w porzadku inorder" << endl;
	  cout << "[7] - wyswietlenie zawartosci drzewa po poziomach" << endl;
	  cout << "[8] - obrocenie wybranego elementu w prawo" << endl;
	  cout << "[9] - obrocenie wybranego elementu w lewo" << endl;
	  cout << "[q] - koniec programu" << endl;
	  cin >> mode;
   }
   else if(mode == '3'){
      int elem;
      cout << endl << "Podaj element, ktory chcesz wyszukac: ";
      cin >> elem;
      t.search(elem);
	  cout << endl << "[1] - dodanie elementu do drzewa BST" << endl;
	  cout << "[2] - usuniecie elementu z drzewa" << endl;
	  cout << "[3] - sprawdzenie czy element znajduje sie w drzewie" << endl;
	  cout << "[4] - graficzne wyswietlenie zawartosci drzewa" << endl;
	  cout << "[5] - wyswietlenie zawartosci drzewa w porzadku inorder" << endl;
	  cout << "[7] - wyswietlenie zawartosci drzewa po poziomach" << endl;
	  cout << "[8] - obrocenie wybranego elementu w prawo" << endl;
	  cout << "[9] - obrocenie wybranego elementu w lewo" << endl;
	  cout << "[q] - koniec programu" << endl;
	  cin >> mode;
   }
   else if(mode == '4'){
      cout << endl << "Zawartosc drzewa: "<< endl << endl;
      t.printtree();
	  cout << endl << "[1] - dodanie elementu do drzewa BST" << endl;
	  cout << "[2] - usuniecie elementu z drzewa" << endl;
	  cout << "[3] - sprawdzenie czy element znajduje sie w drzewie" << endl;
	  cout << "[4] - graficzne wyswietlenie zawartosci drzewa" << endl;
	  cout << "[5] - wyswietlenie zawartosci drzewa w porzadku inorder" << endl;
	  cout << "[7] - wyswietlenie zawartosci drzewa po poziomach" << endl;
	  cout << "[8] - obrocenie wybranego elementu w prawo" << endl;
	  cout << "[9] - obrocenie wybranego elementu w lewo" << endl;
	  cout << "[q] - koniec programu" << endl;
	  cin >> mode;
   }
   else if(mode == '5'){
      cout << endl << "Zawartosc drzewa w porzadku inorder: "<< endl << endl;
      t.inorder();
      cout << endl << "[1] - dodanie elementu do drzewa BST" << endl;
      cout << "[2] - usuniecie elementu z drzewa" << endl;
      cout << "[3] - sprawdzenie czy element znajduje sie w drzewie" << endl;
      cout << "[4] - graficzne wyswietlenie zawartosci drzewa" << endl;
      cout << "[5] - wyswietlenie zawartosci drzewa w porzadku inorder" << endl;
	  cout << "[7] - wyswietlenie zawartosci drzewa po poziomach" << endl;
	  cout << "[8] - obrocenie wybranego elementu w prawo" << endl;
	  cout << "[9] - obrocenie wybranego elementu w lewo" << endl;
      cout << "[q] - koniec programu" << endl;
	  cin >> mode;
   }
   else if(mode == '6'){
      int elem;
      cout << endl << "Podaj element, ktory chcesz wyszukac: ";
      cin >> elem;
      t.findParent(elem);
	  cin >> mode;
   }
   else if(mode == '7'){
      t.printlevels();
	  cout << endl << "[1] - dodanie elementu do drzewa BST" << endl;
	  cout << "[2] - usuniecie elementu z drzewa" << endl;
	  cout << "[3] - sprawdzenie czy element znajduje sie w drzewie" << endl;
	  cout << "[4] - graficzne wyswietlenie zawartosci drzewa" << endl;
	  cout << "[5] - wyswietlenie zawartosci drzewa w porzadku inorder" << endl;
	  cout << "[7] - wyswietlenie zawartosci drzewa po poziomach" << endl;
	  cout << "[8] - obrocenie wybranego elementu w prawo" << endl;
	  cout << "[9] - obrocenie wybranego elementu w lewo" << endl;
	  cout << "[q] - koniec programu" << endl;
	  cin >> mode;
   }
   else if(mode == '8'){
      int elem;
      cout << endl << "Podaj element, ktory chcesz obrocic w prawo: ";
      cin >> elem;
      t.rightR(elem);
	  cout << endl << "[1] - dodanie elementu do drzewa BST" << endl;
	  cout << "[2] - usuniecie elementu z drzewa" << endl;
	  cout << "[3] - sprawdzenie czy element znajduje sie w drzewie" << endl;
	  cout << "[4] - graficzne wyswietlenie zawartosci drzewa" << endl;
	  cout << "[5] - wyswietlenie zawartosci drzewa w porzadku inorder" << endl;
	  cout << "[7] - wyswietlenie zawartosci drzewa po poziomach" << endl;
	  cout << "[8] - obrocenie wybranego elementu w prawo" << endl;
	  cout << "[9] - obrocenie wybranego elementu w lewo" << endl;
	  cout << "[q] - koniec programu" << endl;
	  cin >> mode;
   }
   else if(mode == '9'){
      int elem;
      cout << endl << "Podaj element, ktory chcesz obrocic w lewo: ";
      cin >> elem;
      t.leftR(elem);
	  cout << endl << "[1] - dodanie elementu do drzewa BST" << endl;
	  cout << "[2] - usuniecie elementu z drzewa" << endl;
	  cout << "[3] - sprawdzenie czy element znajduje sie w drzewie" << endl;
	  cout << "[4] - graficzne wyswietlenie zawartosci drzewa" << endl;
	  cout << "[5] - wyswietlenie zawartosci drzewa w porzadku inorder" << endl;
	  cout << "[7] - wyswietlenie zawartosci drzewa po poziomach" << endl;
	  cout << "[8] - obrocenie wybranego elementu w prawo" << endl;
	  cout << "[9] - obrocenie wybranego elementu w lewo" << endl;
	  cout << "[q] - koniec programu" << endl;
	  cin >> mode;
   }
   else{
      cout << endl << "Podaj poprawna wartosc parametru!" << endl;
	  cin >> mode;
   }
   }
   return 0;
}
*/
