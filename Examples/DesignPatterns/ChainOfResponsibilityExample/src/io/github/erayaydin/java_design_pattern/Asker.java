package io.github.erayaydin.java_design_pattern;

public class Asker extends EmirEr {
	
	public Asker(EmirEr altRutbe) {
		super(altRutbe);
	}
	
	@Override
	public void emirAl(Emir emir) {
		if(emir.emir == "SAVUN") {
			System.out.println("---> " + this + " ülkeyi savunuyor...");
		} else {
			super.emirAl(emir);
		}
	}
	
	@Override
	public String toString() {
		return "Asker";
	}
	
}
