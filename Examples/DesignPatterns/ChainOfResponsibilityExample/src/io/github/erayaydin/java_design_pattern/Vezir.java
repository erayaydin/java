package io.github.erayaydin.java_design_pattern;

public class Vezir extends EmirEr {
	
	public Vezir(EmirEr altRutbe) {
		super(altRutbe);
	}
	
	@Override
	public void emirAl(Emir emir) {
		if(emir.emir == "VERGİ TOPLA") {
			System.out.println("-> " + this + " vergileri topluyor...");
		} else {
			super.emirAl(emir);
		}
	}
	
	@Override
	public String toString() {
		return "Vezir";
	}
	
}
