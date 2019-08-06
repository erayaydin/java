package io.github.erayaydin.java_design_pattern;

public class App {

	public static void main(String[] args) {
		Ulke ottoman = new Ulke("Osmanlı", new TurkOlusturucu());
		Ulke roman   = new Ulke("Roma", new RomaOlusturucu());
		
		String sira = "ottoman";
		while(ottoman.hp > 0 && roman.hp > 0) {
			if(sira == "ottoman") {
				ottoman.attack(roman);
				sira = "roman";
				System.out.println(roman.name + " kalan sağlık: " + roman.hp);
			} else {
				roman.attack(ottoman);
				sira = "ottoman";
				System.out.println(ottoman.name + " kalan sağlık: " + ottoman.hp);
			}
		}
	}

}
