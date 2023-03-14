package fp.avistamientos;

import java.util.Set;

public class Avistamientos implements Comparable<Avistamientos> {
	private Set<Avistamiento> avistamientos;
	

	public Avistamientos(Set<Avistamiento> avistamientos) {
		super();
		this.avistamientos = avistamientos;
	}
	
	public Set<Avistamiento> getAvistamientos() {
		return this.avistamientos;
	}

	@Override
	public int compareTo(Avistamientos o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
