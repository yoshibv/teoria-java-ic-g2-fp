package fp.personaInterfaz;

import java.time.LocalDate;

public interface Persona extends Comparable<Persona> {
	String getDNI();
	String getNombre();
	String getApellidos();
	LocalDate getFechaNacimiento();
	Integer getEdad();
}
