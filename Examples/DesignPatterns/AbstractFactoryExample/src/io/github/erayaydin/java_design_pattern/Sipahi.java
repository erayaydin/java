package io.github.erayaydin.java_design_pattern;

public class Sipahi implements Ordu {
	
	protected int speed    = 5;
	protected int strength = 3;
	
	@Override
	public int power() {
		return speed * strength;
	}
	
}
