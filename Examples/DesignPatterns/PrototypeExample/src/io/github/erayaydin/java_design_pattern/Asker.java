package io.github.erayaydin.java_design_pattern;

public abstract class Asker implements Cloneable {
	
	abstract void konus();
	
	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
	
}
