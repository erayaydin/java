package io.github.erayaydin.java_design_pattern;

public class Okcu extends GrupUyesi {

	public String isim;
	
	public Okcu(String isim) {
		this.isim = isim;
	}
	
	@Override
	public String toString() {
		return isim;
	}
	
}
