package wyjatki;

public class Factorial {
//dla x<0 wyjatek niesprawdzalny
	
	public int licz(int n) throws IllegalArgumentException{
		if(n < 0) {
			throw new IllegalArgumentException();
		}
		
		int najnizsza = 2;
		if(n<najnizsza) {
			return n;
		}
		return n*licz(n-1);
	}
	
	public int factorialWithMyException(int n) throws MyException{
		if(n < 0) {
			throw new MyException(n);
		}
		
		int najnizsza = 2;
		if(n<najnizsza) {
			return n;
		}
		return n*licz(n-1);
	}
}
