package io.github.erayaydin.java_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class Grup {
	
	private final List<GrupUyesi> uyeler;
	
	public Grup() {
		uyeler = new ArrayList<>();
	}
	
	public void islem(GrupUyesi yapan, Islem islem) {
		for(GrupUyesi uye : uyeler) {
			if(!uye.equals(yapan))
				uye.grupIslemi(islem);
		}
	}
	
	public void uyeEkle(GrupUyesi uye) {
		uyeler.add(uye);
		uye.grubaKatil(this);
	}
	
}
