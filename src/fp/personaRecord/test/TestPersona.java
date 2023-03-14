package fp.personaRecord.test;

import java.time.LocalDate;

import fp.personaRecord.Persona;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p = new Persona("11111111A", "Jane", "Doe", LocalDate.of(2001,5,17));	
		System.out.println("Nombre completo: " + p.nombre() + " " + p.apellidos());
		Persona p1 = new Persona("11111111A", "Jane", "Doe", LocalDate.of(2001,6,17));	
		System.out.println(p1);
		Persona p3 = p1;
		System.out.println(p);
		System.out.println(p==p1);
		System.out.println(p3==p1);
		System.out.println(p.equals(p1));
		System.out.println(p.compareTo(p1));
	}

}
