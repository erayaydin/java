package io.github.erayaydin.java_design_pattern;

public class Uygulama {

	public static void main(String[] args) {
		Kral kral = new Kral("Fatih Sultan Mehmet");
		
		Emir emirSavun  = new Emir("SAVUN");
		Emir emirVergi  = new Emir("VERGİ TOPLA");
		Emir emirSaldir = new Emir("SALDIR");
		Emir emirCeza   = new Emir("CEZALANDIR");
		
		kral.emir(emirSavun);
		kral.emir(emirVergi);
		kral.emir(emirSaldir);
		kral.emir(emirCeza);
		
		if(!emirCeza.yapildi)
			System.out.println("Cezalandır emri yapılamadı!");
	}

}
