package io.github.erayaydin.java_design_pattern;

public class TurkOlusturucu implements UlkeOlusturucu {

	public Ordu createArmy() {
		return new Sipahi();
	}
	
	public Kral createKing() {
		return new FatihSultanMehmet();
	}
	
}
