package biznesowe1;

import java.util.*;

public class KolekcjaKlient {
	private List<Klient> klienci = new ArrayList<Klient>();
	private List<Integer> wylosowani = new ArrayList<Integer>();
	private int range = 10;
	private int liczbaKlientow = klienci.size();

	// generate random numbers within 1 to 10
	private int rand;

	public void dodajKlienta(Klient k) {
		klienci.add(k);
	}

	public void usunKlienta(Klient k) {
		klienci.remove(klienci.indexOf(k));
	}

	public Klient wyszukajKlienta(String imie, String nazwisko) {
		/*
		 * System.out.println("Index of element"+ " not present : " +
		 * l.indexOf("Hello")); get(3)
		 */// element o tym indeksie
		for (Klient k : klienci) {
			if (k.getImie().equals(imie) && k.getNazwisko().equals(nazwisko)) {
				System.out.println("Klienta znaleziony");
				return k;
			}
		}
		System.out.println("Nie znaleziono klienta " + imie + " " + nazwisko);
		return null;
	}

	public void losuj() {
		rand = (int) (Math.random() * range) + 1;
		int liczbaLosowan = liczbaKlientow * rand; // ilosc ktora ma byc wylosowana
		int indeksKlienta;// indeks klienta wylosowanego
		for (int i = 0; i < liczbaLosowan; i++) {
			indeksKlienta = (int) (Math.random() * liczbaKlientow) + 0;
			System.out.println(klienci.get(indeksKlienta));
		}
	}

	public void losuj2() {
		rand = (int)(Math.random() * range) + 1;
		int liczbaLosowan = liczbaKlientow * rand; //ilosc ktora ma byc wylosowana
		int indeksKlienta;//indeks klienta wylosowanego
		int liczbaKlientow = klienci.size();
		boolean czyWylosowany; //czy typek juz byl
		for (int i = 0; i<liczbaLosowan; i++) {
			czyWylosowany = true;
			do{
				indeksKlienta = (int)(Math.random() * liczbaKlientow);
				//jesli nie byl juz wylosowany to wychodzimy z petli
				if(!(wylosowani.contains(indeksKlienta))) {
					czyWylosowany = false;
				}
			}while(czyWylosowany);
			wylosowani.add(indeksKlienta);
			System.out.println(klienci.get(indeksKlienta));
		}
	}
}
