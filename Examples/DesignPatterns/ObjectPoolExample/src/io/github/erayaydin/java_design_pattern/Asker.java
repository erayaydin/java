package io.github.erayaydin.java_design_pattern;

public class Asker {

	private static int toplam = 1;
	private final int id;
	
	public Asker() {
		id = toplam++;
	}
	
	@Override
	public String toString() {
		return String.format("Asker ID=%d", id);
	}
	
}
