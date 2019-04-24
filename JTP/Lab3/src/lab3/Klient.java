package lab3;

public class Klient extends Thread {
	// dane do losowania
	private int rand;
	// zakres przerw od zakupow w milisekundach
	private int range = 2000; // 2 sekundy
	// minimum przerw od zakupow w milisekundach
	private int min = 9000;// 9 sekund

	// decyduje o tym czy sklep jest otwarty
	private boolean otwarty = true;

	public void kupuj() {
		while (otwarty) {
			rand = (int) (Math.random() * range) + min;
			Thread.sleep(rand); // brak klientow

			// jesli budzet obiektu sklep wynosi zero zamykamy sklep
			if (sklep.getBudzet == 0) {
				otwarty = false;
			}
		}
	}
}
