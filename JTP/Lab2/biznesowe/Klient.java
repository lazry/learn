package biznesowe1;

public class Klient {
	private String imie;
	private String nazwisko;
	
	public Klient(String i,String n) {
		imie = i;
		nazwisko = n;
	}
	
	public String getNazwisko() {
		return nazwisko;
	}
	public String getImie() {
		return imie;
	}
}
