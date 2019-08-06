package io.github.erayaydin.java_design_pattern;

public class Uygulama {

	public static void main(String[] args) {
		Komut ates = new AtesEt();
		Komut zipla = new Zipla();
		
		Klavye klavye = new Klavye();
		klavye.solTikBelirle(ates);
		klavye.boslukBelirle(zipla);
		
		klavye.solTikBas();
		klavye.boslukBas();
	}

}
