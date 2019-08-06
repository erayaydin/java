package io.github.erayaydin.java_design_pattern;

public class Kisla extends Havuz<Asker> {
	
	@Override
	protected Asker olustur() {
		return new Asker();
	}
	
}
