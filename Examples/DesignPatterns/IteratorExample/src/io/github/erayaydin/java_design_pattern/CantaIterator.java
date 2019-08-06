package io.github.erayaydin.java_design_pattern;

import java.util.List;

public class CantaIterator implements EsyaIterator {
	
	private Canta canta;
	private int index;
	
	public CantaIterator(Canta canta) {
		this.canta = canta;
		this.index = -1;
	}
	
	@Override
	public boolean sonrakiVarMi() {
		return sonrakiIndex() != -1;
	}
	
	@Override
	public Esya sonraki() {
		this.index = sonrakiIndex();
		if(this.index != -1)
			return canta.tumEsyalar().get(this.index);
		return null;
	}
	
	private int sonrakiIndex() {
		List<Esya> esyalar = canta.tumEsyalar();
		int index = this.index + 1;
		
		if(index >= esyalar.size())
			return -1;
		
		return index;
	}
	
}
