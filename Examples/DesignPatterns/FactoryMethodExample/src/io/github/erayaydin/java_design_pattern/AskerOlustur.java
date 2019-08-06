package io.github.erayaydin.java_design_pattern;

public class AskerOlustur {
	
	public static Asker olustur(String tur) {
		if("atli".equals(tur))
			return new Atli();
		else if("okcu".equals(tur))
			return new Okcu();
		return new Komutan();
	}
	
}
