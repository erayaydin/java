package io.github.erayaydin.java_design_pattern;

public class Uygulama {

	public static void main(String[] args) {
		Oyuncu oyuncu = new Oyuncu();
		
		new BasarimKontrolcusu(oyuncu);
		new CanKontrolcusu(oyuncu);
		
		for(int i=0; i<=100; i++) {
			oyuncu.saldir();
		}
	}

}
