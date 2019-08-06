package io.github.erayaydin.java_design_pattern;

import java.util.Hashtable;

public class Kisla {
	
	private static Hashtable<String, Asker> askerler = new Hashtable<String, Asker>();
	
	public static Asker askerAl(String tur) {
		Asker asker = askerler.get(tur);
		return (Asker) asker.clone();
	}
	
	public static void yukle() {
		Savasci savasci = new Savasci();
		askerler.put("savasci", savasci);
		
		Okcu okcu = new Okcu();
		askerler.put("okcu", okcu);
	}
	
}
