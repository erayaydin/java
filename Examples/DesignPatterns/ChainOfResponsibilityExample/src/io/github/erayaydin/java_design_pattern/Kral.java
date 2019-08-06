package io.github.erayaydin.java_design_pattern;

public class Kral {
	
	public String isim;
	EmirEr er;
	
	public Kral(String isim) {
		this.isim = isim;
		
		er = new Vezir(new Komutan(new Asker(null)));
	}
	
	public void emir(Emir emir) {
		System.out.println(emir.emir +  " emri " + this.isim + " tarafından veriliyor!");
		er.emirAl(emir);
	}
	
}
