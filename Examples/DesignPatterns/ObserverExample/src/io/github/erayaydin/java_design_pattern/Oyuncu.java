package io.github.erayaydin.java_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class Oyuncu {

	private List<Kontrolcu> kontrolculer = new ArrayList<>();
	public int can     = 101;
	public int tecrube = 0;
	
	public void yaralan() {
		can -= 5;
		if(can < 0)
			can = 0;
	}
	
	public void tecrubeKazan() {
		if(can > 0)
			tecrube += 5;
	}
	
	public void saldir() {
		if(can > 0) {
			yaralan();
			tecrubeKazan();
			for(Kontrolcu kontrolcu: kontrolculer)
				kontrolcu.kontrolEt();
		}
	}
	
	public void kontrolEkle(Kontrolcu kontrolcu) {
		kontrolculer.add(kontrolcu);
	}
	
}
