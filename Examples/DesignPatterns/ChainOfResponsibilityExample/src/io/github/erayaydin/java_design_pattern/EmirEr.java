package io.github.erayaydin.java_design_pattern;

public abstract class EmirEr {
	
	private EmirEr er;
	
	public EmirEr(EmirEr altRutbe) {
		this.er = altRutbe;
	}
	
	public void emirAl(Emir emir) {
		if(er != null) {
			System.out.println("[" + this + " emri gerçekleştiremedi. Emir " + er + " rütbesine iletiliyor.]");
			er.emirAl(emir);
		} else {
			System.out.println("[" + this + " emri gerçekleştiremedi. Başka emir verecek kimse yok]");
		}
	}
	
	@Override
	public abstract String toString();
	
}
