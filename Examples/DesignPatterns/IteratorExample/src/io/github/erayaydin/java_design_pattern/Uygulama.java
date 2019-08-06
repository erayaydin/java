package io.github.erayaydin.java_design_pattern;

public class Uygulama {

	public static void main(String[] args) {
		Canta canta = new Canta();
		
		EsyaIterator gezici = canta.iterator();
		while(gezici.sonrakiVarMi())
			System.out.println(gezici.sonraki());
	}

}
