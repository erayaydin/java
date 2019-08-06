package io.github.erayaydin.java_design_pattern;

public abstract class GrupUyesi {
	
	protected Grup grup = null;
	
	public void grubaKatil(Grup grup) {
		this.grup = grup;
	}
	
	public void grupIslemi(Islem islem) {
		System.out.println("[" + this + "] " + islem);
	}
	
	public void islemYap(Islem islem) {
		if(grup != null)
			grup.islem(this, islem);
	}
	
}
