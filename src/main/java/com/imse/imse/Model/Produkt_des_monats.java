package com.imse.imse.Model;

public class Produkt_des_monats {

	String spezifikation;
	String bewertung;
	
	public Produkt_des_monats() {}
	public Produkt_des_monats(String s, String b) {
		
		this.spezifikation = s;
		this.bewertung = b;
	}
	public String getSpezifikation() {
		return spezifikation;
	}
	public void setSpezifikation(String spezifikation) {
		this.spezifikation = spezifikation;
	}
	public String getBewertung() {
		return bewertung;
	}
	public void setBewertung(String bewertung) {
		this.bewertung = bewertung;
	}
	
	
}
