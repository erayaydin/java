package io.github.erayaydin.java_design_pattern;

public class CanKontrolcusu extends Kontrolcu {

	public CanKontrolcusu(Oyuncu oyuncu) {
		this.oyuncu = oyuncu;
		this.oyuncu.kontrolEkle(this);
	}
	
	@Override
	public void kontrolEt() {
		if(this.oyuncu.can <= 0) {
			System.out.println("Oyuncu Öldü");
		}
	}
	
}
