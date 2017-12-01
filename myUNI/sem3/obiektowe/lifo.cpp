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
	for(int i = ses; i > -1; i--)
		stck[i] = 0;
	ses = -1;
}

void stack::push(char el){
	ses++;
	stck[ses] = el;
}
void stack::pop() {     
	 stck[ses]
}

char stack::top() {    
	return ses;
}

int main(){
 char elm, plc;
 stack s, ds;

	cout << "Wprowadz znak polecenia (c, p, o, t, e, f, w)" << endl;
	plc=getche();
	while (plc!='/'){
       switch(plc){
              case 'c': 
                   s.clear(); 
                   cout << endl << "Wprowadz znak polecenia (c, p, o, t, e, f, w)" << endl;
	               plc=getche();
                   break;
              case 'p': 
                   cout << endl << "Wprowadz element stosu" << endl;
	               elm=getche();
                   s.push(elm);
                   cout << endl << "Wprowadz znak polecenia (c, p, o, t, e, f, w)" << endl;
	               plc=getche();
                   break;
              case 'o': 
                   s.pop();
                   cout << endl << "Wprowadz znak polecenia (c, p, o, t, e, f, w)" << endl;
	               plc=getche();
                   break;
              case 't':
                   if (!s.isEmpty()) cout << endl << "Szczytowy element stosu: " << s.top();
                   else cout << endl << "Nie mozna odczytac wartosci elementu szczytowego. Stos jest pusty!";
                   cout << endl << "Wprowadz znak polecenia (c, p, o, t, e, f, w)" << endl;
	               plc=getche();
                   break;
              case 'e':
                   if(s.isEmpty()) cout << endl << "Stos jest pusty!";
                   else cout << endl << "Stos nie jest pusty!";
                   cout << endl << "Wprowadz znak polecenia (c, p, o, t, e, f, w)" << endl;
                   plc=getche();
                   break;
              case 'f':
                   if(s.isFull()) cout << endl << "Stos jest pelny!";
                   else cout << endl << "Stos nie jest pelny!";
                   cout << endl << "Wprowadz znak polecenia (c, p, o, t, e, f, w)" << endl;
                   plc=getche();
                   break;
              case 'w':
                   if(!s.isEmpty()){
                     cout << endl << "Zawartosc stosu (szczyt stosu u gory)" << endl;
                     ds=s;
					 while(!ds.isEmpty()){
					 	cout << ds.top() << endl;
					 	ds.pop();
					 }
					}
					else 
                      cout << endl << "Stos jest pusty!\n";
					cout << "Wprowadz znak polecenia (c, p, o, t, e, f, w)" << endl;
                    plc=getche(); 
                    break;
              default:
                   cout << endl << "Wprowadz wlasciwe polecenie (c, p, o, t, e, f, w)" << endl;
                   plc=getche();      
                   break;                
        }    
     }
getche();     
return 0;	
}     
