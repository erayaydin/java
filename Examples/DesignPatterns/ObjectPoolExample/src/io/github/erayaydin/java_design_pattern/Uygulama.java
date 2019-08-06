package io.github.erayaydin.java_design_pattern;

public class Uygulama {

	public static void main(String[] args) {
		Kisla kisla = new Kisla();
		System.out.println(kisla);

		Asker asker1 = kisla.al();
		System.out.println(asker1);
		System.out.println(kisla);

		Asker asker2 = kisla.al();
		System.out.println(asker2);
		System.out.println(kisla);

		Asker asker3 = kisla.al();
		System.out.println(asker3);
		System.out.println(kisla);
		
		kisla.ver(asker1);
		System.out.println(kisla);
		
		kisla.ver(asker2);
		System.out.println(kisla);
		
		kisla.ver(asker3);
		System.out.println(kisla);
	}

}
