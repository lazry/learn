package biznesowe1;

import java.util.*;

public class Main {
	public String generujNaziwsko(char litera) {
		String nazwisko = Character.toString(litera);
		nazwisko = nazwisko.concat("backi");
		return nazwisko;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100; //ilosc klientow do wygenerowania
		//tworzy liste alfabetu
		List <String> ascii = new ArrayList <String> (26);
		for (char c = 'A'; c <= 'Z'; c++)
		    ascii.add (String.valueOf (c));
		//zlicza ktora litera zostala uzyta w kolejnosci
		int counter = 0;
		
		String[] imiona = {"Jan", "Adam", "Jakub", "Aleksander", "Bartek",
				"Oliwia", "Paula", "Magdalena", "Patrycja", "Micha³", "£ukasz", 
				"Alicja", "Laura", "Antek"};
		
		KolekcjaKlient pierwsza = new KolekcjaKlient();
		for(int i = 0; i<n; i++) {
			
			/*pierwsza.dodajKlienta(Klient  */
			counter = counter++%26;
		}
		
		pierwsza.losuj();

	}

}
