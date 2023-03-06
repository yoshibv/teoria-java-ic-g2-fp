package fp.empleado;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import fp.personaInterfaz.Persona;
import fp.personaInterfaz.PersonaImpl;
import fp.utilidades.Ficheros;

public class FactoriaEmpleados {
	// formato dni,nombre,apellidos,fecha nacimiento,irpf,sueldos
	//         222222222R,John,Doe,12/10/2000,18.0,1200,200,125,100
	public static Empleado parseaEmpleado(String s) {
		String [] trozos = s.split(",");
		String nombre = trozos[1].trim();
		String dni = trozos[0].trim();
		String apellidos = trozos[2].trim();
		LocalDate fechaNacimiento = LocalDate.parse(trozos[3].trim(),DateTimeFormatter.ofPattern("d/M/y"));
		Persona p = new PersonaImpl(dni,nombre,apellidos,fechaNacimiento);
		Double irpf = Double.parseDouble(trozos[4]);
		List<Double> sueldos = new ArrayList<Double>();
		for(int i=5;i<trozos.length;i++) {
			sueldos.add(Double.parseDouble(trozos[i]));
		}
		
		return new Empleado(p,irpf,sueldos);	
	}
	public static List<Empleado> leerFicheroEmpleados(String nombre, String ficheroErrores) {
		List<String> aux = Ficheros.leerFichero(nombre, true);
		List<Empleado> res = new ArrayList<Empleado>();
		List<String> errores = new ArrayList<String>();
		for (String s : aux) {
			Empleado empleado = null;
			try {
				empleado = parseaEmpleado(s);
				res.add(empleado);
			} catch(Exception e) {
				e.printStackTrace();
				errores.add(s);
			}
		}
		Ficheros.escribeFichero(errores, ficheroErrores);
		return res;
	}
	

}
