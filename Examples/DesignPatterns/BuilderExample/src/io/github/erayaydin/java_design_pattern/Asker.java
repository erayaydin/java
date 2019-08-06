package io.github.erayaydin.java_design_pattern;

public class Asker {
	
	public String isim;
	public Zirh   zirh = null;
	public Silah  silah = null;
	public Binek  binek = null;
	
	public Asker(Olusturucu olusturucu) {
		this.isim  = olusturucu.isim;
		this.zirh  = olusturucu.zirh;
		this.silah = olusturucu.silah;
		this.binek = olusturucu.binek;
	}
	
	public void bilgi() {
		System.out.println("=== " + this.isim + " ===");
		if(this.zirh != null)
			System.out.println("Zırh: " + this.zirh);
		if(this.silah != null)
			System.out.println("Silah: " + this.silah);
		if(this.binek != null)
			System.out.println("Binek: " + this.binek);
	}
	
	public static class Olusturucu {
		
		public String isim;
		public Zirh   zirh = null;
		public Silah  silah = null;
		public Binek  binek = null;
		
		public Olusturucu(String isim) {
			this.isim = isim;
		}
		
		public Olusturucu giy(Zirh zirh) {
			this.zirh = zirh;
			return this;
		}
		
		public Olusturucu kusan(Silah silah) {
			this.silah = silah;
			return this;
		}
		
		public Olusturucu sur(Binek binek) {
			this.binek = binek;
			return this;
		}
		
		public Asker olustur() {
			return new Asker(this);
		}
	}
}
