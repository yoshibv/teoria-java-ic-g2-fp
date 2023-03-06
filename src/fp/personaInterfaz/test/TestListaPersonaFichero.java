package fp.personaInterfaz.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import fp.personaInterfaz.Persona;
import fp.personaInterfaz.PersonaImpl;

public class TestListaPersonaFichero {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Persona p;
		List<Persona> lp = new ArrayList<Persona>();
		List<String> ls ;
		ls = Files.lines(Path.of("./data/personas.txt")).skip(1).toList();
		System.out.println(ls);
		for (String s : ls) {
			lp.add(new PersonaImpl(s));
		}
		System.out.println(lp);

	}

}
