package io.github.erayaydin.java_design_pattern;

import java.util.HashSet;
import java.util.Set;

public abstract class Havuz<T> {

	private Set<T> uygun      = new HashSet<>();
	private Set<T> kullanimda = new HashSet<>();
	
	protected abstract T olustur();
	
	public T al() {
		if(uygun.isEmpty())
			uygun.add(olustur());
		T nesne = uygun.iterator().next();
		uygun.remove(nesne);
		kullanimda.add(nesne);
		return nesne;
	}
	
	public void ver(T nesne) {
		kullanimda.remove(nesne);
		uygun.add(nesne);
	}
	
	@Override
	public synchronized String toString() {
		return String.format("Uygun=%d Kullanımda=%d", uygun.size(), kullanimda.size());
	}
	
}
