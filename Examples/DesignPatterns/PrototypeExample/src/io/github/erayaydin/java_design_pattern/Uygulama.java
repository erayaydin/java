package io.github.erayaydin.java_design_pattern;

public class Uygulama {

	public static void main(String[] args) {
		Kisla.yukle();
		
		Asker savasci = (Asker) Kisla.askerAl("savasci");
		savasci.konus();
		
		Asker okcu = (Asker) Kisla.askerAl("okcu");
		okcu.konus();
	}

}
