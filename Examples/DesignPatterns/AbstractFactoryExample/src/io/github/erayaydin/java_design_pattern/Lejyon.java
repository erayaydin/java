package io.github.erayaydin.java_design_pattern;

public class Lejyon implements Ordu {
	
	protected int speed    = 3;
	protected int strength = 4;

	@Override
	public int power() {
		return speed * strength;
	}
	
}
