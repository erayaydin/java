package io.github.erayaydin.java_design_pattern;

public class BasarimKontrolcusu extends Kontrolcu {

	public BasarimKontrolcusu(Oyuncu oyuncu) {
		this.oyuncu = oyuncu;
		this.oyuncu.kontrolEkle(this);
	}
	
	@Override
	public void kontrolEt() {
		if(this.oyuncu.tecrube % 25 == 0 && this.oyuncu.can != 0) {
			System.out.println("BAŞARI! " + this.oyuncu.tecrube + " tecrübeye ulaştınız!");
		}
	}
	
}
