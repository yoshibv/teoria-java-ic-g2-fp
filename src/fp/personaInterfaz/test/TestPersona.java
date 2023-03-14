package fp.personaInterfaz.test;

import java.time.LocalDate;

import fp.personaInterfaz.Persona;
import fp.personaInterfaz.PersonaImpl;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p = new PersonaImpl("11111111A", "Jane", "Doe", LocalDate.of(2001,5,17));	
		Persona p1 = new PersonaImpl("11111111A", "Jane", "Doe", LocalDate.of(2001,5,17));	
		System.out.println("Nombre completo: " + p.getNombre() + " " + p.getApellidos());
		System.out.println(p);
		System.out.println(p==p1);
		System.out.println(p.equals(p1));
		System.out.println(p.compareTo(p1));
		
	}

}
