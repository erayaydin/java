package io.github.erayaydin.java_design_pattern;

public class RomaOlusturucu implements UlkeOlusturucu {

	public Ordu createArmy() {
		return new Lejyon();
	}
	
	public Kral createKing() {
		return new Konstantin();
	}
	
}
