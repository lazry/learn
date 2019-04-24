package lab3;

import pl.labs.lab1.Point;

public class Produkt {
	private String nazwa;
	private float cena;
	private int marza;

	public Produkt(String n, float c, int m) { // a constructor
		nazwa = n;
		cena = c;
		marza = m;
	}
	public void setNazwa(String n) {
		nazwa = n;
	}
	public void getCena(float c) {
		cena = c;
	}
	public void getMarza(int m) {
		marza = m;
	}
	public String getNazwa() {
		return nazwa;
	}
	public float getCena() {
		return cena;
	}
	public int getMarza() {
		return marza;
	}
}
