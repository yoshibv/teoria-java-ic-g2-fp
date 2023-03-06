package fp.personaInterfaz;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PersonaImpl implements Persona {
	private String dni,nombre,apellidos;
	private LocalDate fechaNacimiento;
	@Override
	
	
	public int compareTo(Persona p) {
		// TODO Auto-generated method stub
		int r;
		if (p == null) {
			throw new NullPointerException();
		}
		r = apellidos.compareTo(p.getApellidos());	
		if (r == 0) {
			r = nombre.compareTo(p.getNombre());
			if (r == 0) {
				r = dni.compareTo(p.getDNI());
			}
		}
		return r;	
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof PersonaImpl))
			return false;
		PersonaImpl other = (PersonaImpl) obj;
		if (apellidos == null) {
			if (other.apellidos != null)
				return false;
		} else if (!apellidos.equals(other.apellidos))
			return false;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	public PersonaImpl(String dni, String nombre, String apellidos, LocalDate fechaNacimiento) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
	}
	public PersonaImpl(String s) {
		String[] sp = s.split(",");
		if (sp.length != 4) {
			throw new IllegalArgumentException(
				"Cadena con formato no válido");
		}
		String nombre = sp[1].trim();
//		checkNombre(nombre);
		this.dni = sp[0].trim();
		this.nombre = nombre;
		this.apellidos = sp[2].trim();
		this.fechaNacimiento = LocalDate.parse(sp[3].trim(), 
			DateTimeFormatter.ofPattern("d/M/y"));
	}
	
	@Override
	public String getDNI() {
		// TODO Auto-generated method stub
		return dni;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}

	@Override
	public String getApellidos() {
		// TODO Auto-generated method stub
		return apellidos;
	}

	@Override
	public LocalDate getFechaNacimiento() {
		// TODO Auto-generated method stub
		return fechaNacimiento;
	}

	@Override
	public Integer getEdad() {
		// TODO Auto-generated method stub
		return fechaNacimiento.until(LocalDate.now()).getYears();
	}

	@Override
	public String toString() {
		return "PersonaImpl [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNacimiento="
				+ fechaNacimiento + "]";
	}

}
