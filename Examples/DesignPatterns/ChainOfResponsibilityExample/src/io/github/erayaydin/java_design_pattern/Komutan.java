package io.github.erayaydin.java_design_pattern;

public class Komutan extends EmirEr {

	public Komutan(EmirEr altRutbe) {
		super(altRutbe);
	}
	
	@Override
	public void emirAl(Emir emir) {
		if(emir.emir == "SALDIR") {
			System.out.println("--> " + this + " saldırıyor...");
		} else {
			super.emirAl(emir);
		}
	}
	
	@Override
	public String toString() {
		return "Komutan";
	}
	
}
