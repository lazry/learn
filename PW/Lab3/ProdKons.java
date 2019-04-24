package producKons;

import java.util.Random;

public class ProdKons extends Thread {

	/*
	 * Wywołanie metody synchronizowanej powoduje zajęcie blokady/monitora obiektu
	 * przez wątek i wstrzymanie innych wywołań metod/bloków synchronizowanych tego
	 * obiektu przez inne wątki do czasu zwolnienia blokady;
	 */

	private Random rand = new Random();
	private String dana;
	String[] bufor = new String[y];
	private int id_p;
	private int id_k;
	private int nr_p = 0;

	public ProdKons(int a, boolean wybor) {
		if (wybor) {
			id_p = a;
		} else {
			id_k = a;
		}
	}

	public void powtorzenie() {
		synchronized (this) {
			nr_p++;
		}
	}

	public void komunikat() throws InterruptedException {
		for (;nr_p<100;nr_p++) {
			synchronized (this) {
				int x = (3 + rand.nextInt(10));
				wait(x);
				System.out.println("[K-" + id_k + ", " + nr_p + "] >> Dana= " + dana);
			}
		}
	}

	public void produce() throws InterruptedException{
		for (;nr_p<100;nr_p++) {
			synchronized (this) {
				while(bufor)
				int x = 1 + rand.nextInt(10);
				wait(x);
				int losowa = rand.nextInt(100);
				dana = ("[P-" + id_p + ", " + nr_p + ", " + losowa + "]");
			}
		}
	}
}
