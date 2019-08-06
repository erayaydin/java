package io.github.erayaydin.java_design_pattern;

public class Emir {
	
	public final String emir;
	public boolean yapildi = false;
	
	public Emir(String emir) {
		this.emir = emir;
	}
	
	@Override
	public String toString() {
		String bilgi = this.emir;
		
		if(this.yapildi)
			bilgi += " (Yapıldı)";
		else
			bilgi += " (Yapılmadı)";
		
		return bilgi;
	}
}
