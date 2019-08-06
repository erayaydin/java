package io.github.erayaydin.java_design_pattern;

public class Savasci extends GrupUyesi {

	public String isim;
	
	public Savasci(String isim) {
		this.isim = isim;
	}
	
	@Override
	public String toString() {
		return isim;
	}
	
}
