package fp.personaClase.test;

import java.time.LocalDate;

import fp.personaClase.Persona;



public class TestPersona {
	public static void main(String[] argv) {
	Persona p = new Persona("11111111A", "Jane", "Doe", LocalDate.of(2001,5,17));	
	Persona p1 = new Persona("11111111A", "Jane", "Doe", LocalDate.of(2001,5,17));	
	System.out.println("Nombre completo: " + p.getNombre() + " " + p.getApellidos());
	Persona p3 = p1;
	System.out.println(p);
	System.out.println(p==p1);
	System.out.println(p.equals(p1));
	System.out.println(p.compareTo(p1));
	}
}
