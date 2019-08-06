package io.github.erayaydin.java_design_pattern;

public class Klavye {
	
	Komut solTik;
	Komut bosluk;
	
	public void solTikBelirle(Komut komut) {
		this.solTik = komut;
	}
	
	public void boslukBelirle(Komut komut) {
		this.bosluk = komut;
	}
	
	public void solTikBas() {
		this.solTik.calistir();
	}
	
	public void boslukBas() {
		this.bosluk.calistir();
	}
	
}
