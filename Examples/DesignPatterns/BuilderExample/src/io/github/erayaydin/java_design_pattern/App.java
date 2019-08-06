package io.github.erayaydin.java_design_pattern;

public class App {

	public static void main(String[] args) {
		
		Silah mizrak    = new Silah("Mızrak");
		Silah kilic     = new Silah("Kılıç");
		Zirh  deriZirh  = new Zirh("Deri Zırh");
		Zirh  demirZirh = new Zirh("Demir Zırh");
		Binek at        = new Binek("At");
		
		Asker sipahi = new Asker.Olusturucu("Sipahi Asker").kusan(mizrak).giy(deriZirh).sur(at).olustur();
		Asker lejyon = new Asker.Olusturucu("Lejyon").kusan(kilic).giy(demirZirh).olustur();
		
		sipahi.bilgi();
		lejyon.bilgi();
	}

}
