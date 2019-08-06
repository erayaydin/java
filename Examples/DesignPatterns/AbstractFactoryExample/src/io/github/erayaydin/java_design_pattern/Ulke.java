package io.github.erayaydin.java_design_pattern;

public class Ulke {
	
	public String name;
	public Kral king;
	public Ordu army;
	public int hp = 100;
	
	public Ulke(String isim, UlkeOlusturucu ulke) {
		this.name = isim;
		this.king = ulke.createKing();
		this.army = ulke.createArmy();
	}
	
	public int getPower() {
		return this.army.power();
	}
	
	public void attack(Ulke ulke) {
		ulke.hp -= this.getPower();
		if(ulke.hp < 0)
			ulke.hp = 0;
		System.out.println(this.name + "(" + this.king.getName() + "), " + ulke.name + "(" + ulke.king.getName() + ") ülkesine " + this.getPower() + " gücünde saldırdı!");
	}	
	
}
