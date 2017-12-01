#include <iostream> 
#include <conio.h>
using namespace std;

#define size 5
class stack {
	int stck[size];
	int ses;
	
public:
	stack();			// konstruktor tworzący stos pusty
	bool isFull();		// sprawdzenie czy stos jest pełny
	bool isEmpty();		// sprawdzenie czy stos jest pusty
	void clear();  		// wyczyszczenie stosu
	void push(char el); // włożenie na stos elementu el typu int
	void pop();     	// zdjęcie ze stosu szczytowego elementu
	char top(); 		// odczytanie (bez zdejmowania) szczytowego elementu
};  

stack::stack() { 
 ses = -1;
}

bool stack::isFull() {   
	if( ses == (size-1))
		return 1;
	else
		return 0;
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

void stack::push(char el){
	if( ses != size-1){
        ses++;
	    stck[ses] = el;
     }
     //else 
     //cout<< endl << "Stos jest juz pelny"<<endl;
}
void stack::pop() {     
	 if( ses != -1)
         ses--;
     //else
         //cout<< endl << "Stos jest juz pusty"<<endl;
}

char stack::top() {    
	return stck[ses];
}

int main(){
 char elm, plc;
 char zap;
 int size3 = size;
 int size2 = size;
 stack s, ds, s2;
 
	for(int i = 0; i < size; i++){
                   cout << endl << "Wprowadz element stosu" << endl;
	               elm=getche();
                   s.push(elm);
                   size3++;
                   }
                   cout << endl << "Zawartosc stosu 1 (szczyt stosu u gory)" << endl;
                     ds=s;
                     while(!ds.isEmpty()){
					 	cout << ds.top() << endl;
					 	ds.pop();
                    }
                    
        for(int j = 0; j < size2; j++ ){
                size3-= 1;
            for(int i = 0; i<size3; i++){
                s2.push(s.top()); 
                s.pop();
            }
            zap = s2.top();
            for(int i = 0; i<size3; i++){
                s.push(s2.top()); 
                s2.pop();
            }
            s2.push(zap);
            cout << endl << "Zawartosc stosu 2 (szczyt stosu u gory)" << endl;
                     ds=s2;
                     while(!ds.isEmpty()){
					 	cout << ds.top() << endl;
					 	ds.pop();
                    }
        }
        s.clear();
        cout << endl << "Zawartosc stosu 2 (szczyt stosu u gory)" << endl;
                     ds=s2;
                     while(!ds.isEmpty()){
					 	cout << ds.top() << endl;
					 	ds.pop();
                    }
        
        
     
getche();     
return 0;	
}     
