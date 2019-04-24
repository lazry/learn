package wyjatki;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5; //jaka to ma byc silnia
		Factorial silnia = new Factorial();
		
		try {
		
	         silnia.factorialWithMyException(n);
	      } catch(MyException ex1) {
	         System.out.println(ex1);
	      }
	}

}
