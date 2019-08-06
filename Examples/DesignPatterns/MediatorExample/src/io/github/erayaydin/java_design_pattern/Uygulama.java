package io.github.erayaydin.java_design_pattern;

public class Uygulama {

	public static void main(String[] args) {
		
		Grup grup = new Grup();
		
		Okcu okcu1 = new Okcu("Okçu 1");
		Okcu okcu2 = new Okcu("Okçu 2");
		Savasci savasci1 = new Savasci("Savaşçı 1");
		Savasci savasci2 = new Savasci("Savaşçı 2");

		grup.uyeEkle(okcu1);
		grup.uyeEkle(okcu2);
		grup.uyeEkle(savasci1);
		grup.uyeEkle(savasci2);
		
		okcu1.islemYap(new Islem("okçu1 grubu oluşturdu"));
		System.out.println("---");
		okcu2.islemYap(new Islem("okçu2 yer değiştirdi"));
		System.out.println("---");
		savasci1.islemYap(new Islem("savasci1 grup sohbetine mesaj yazdı"));
		System.out.println("---");
		
	}

}
