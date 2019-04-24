package producKons;

public class Main {
	
	public static void main(String[] args) {
		
		int m = 4; //ilosc producentow
		int n = 5; //ilosc konsumentow
		int y = 10; // rozmiar bufora
		boolean wybor;
		
		Thread[] w = new Thread[m+n];
        for (int i = 0; i < m; i++) {
        	wybor = true;
            w[i] = new ProdKons(i, wybor);
        }
        for (int i = 0; i < n; i++) {
        	wybor = false;
            w[i+m] = new ProdKons(i, wybor);
        }
        for (int i = 0; i < m+n; i++) {
            w[i].start();
        }
	}
}
