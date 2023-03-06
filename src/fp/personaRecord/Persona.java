package fp.personaRecord;

import java.time.LocalDate;

public record Persona(String DNI, String nombre, String apellidos,
		LocalDate fechaNacimiento) implements Comparable<Persona> {
	
	public Persona {
		checkNombre(nombre);
	}

	private void checkNombre(String nombre) {
		if (nombre.equals("")) {
			throw new IllegalArgumentException(
				"El nombre no puede estar vacío");
		}
	}

	@Override
	public int compareTo(Persona p) {
		// TODO Auto-generated method stub
		int r;
		if (p == null) {
			throw new NullPointerException();
		}
		r = apellidos.compareTo(p.apellidos());	
		if (r == 0) {
			r = nombre.compareTo(p.nombre());
			if (r == 0) {
				r = DNI.compareTo(p.DNI());
			}
		}
		return r;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
}
