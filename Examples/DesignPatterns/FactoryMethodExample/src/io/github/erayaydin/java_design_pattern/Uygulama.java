package io.github.erayaydin.java_design_pattern;

public class Uygulama {

	public static void main(String[] args) {
		Asker komutan = AskerOlustur.olustur("komutan");
		Asker atli    = AskerOlustur.olustur("atli");
		Asker okcu    = AskerOlustur.olustur("okcu");
		
		komutan.saldir();
		atli.saldir();
		okcu.saldir();
	}

}
