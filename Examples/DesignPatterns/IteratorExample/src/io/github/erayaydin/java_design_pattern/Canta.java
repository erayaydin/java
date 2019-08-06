package io.github.erayaydin.java_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class Canta {
	
	private List<Esya> esyalar;
	
	public Canta() {
		esyalar = new ArrayList<>();
		esyalar.add(new Esya("Tahta Kılıç"));
		esyalar.add(new Esya("Can İksiri"));
		esyalar.add(new Esya("Büyü İksiri"));
		esyalar.add(new Esya("Demir Zırh"));
		esyalar.add(new Esya("Yüzük"));
	}
	
	EsyaIterator iterator() {
		return new CantaIterator(this);
	}
	
	public List<Esya> tumEsyalar() {
		return esyalar;
	}
	
	
	
}
