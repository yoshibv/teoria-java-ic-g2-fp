package fp.avistamientos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import fp.coordenadas.Coordenadas;
import fp.utilidades.Ficheros;

public class FactoriaAvistamientos {
	public static Avistamiento parseaAvistamiento(String lineaCSV) {
		String[] sp = lineaCSV.split(";");
		LocalDate fecha = LocalDate.parse(sp[0].trim(),
				DateTimeFormatter.ofPattern("d/M/y"));
		String lugar = sp[1].trim();
		Integer duracion = Integer.valueOf(sp[2].trim());
		Forma forma = Forma.valueOf(sp[3].trim());
		Coordenadas ubicacion = new Coordenadas(sp[4].trim());
		
		return new Avistamiento(fecha,lugar,duracion,forma,ubicacion);
	}
	
	public static Avistamientos leerAvistamientos(String rutaFichero) {
		Avistamientos res = null;
		List<String> lista = Ficheros.leerFichero(rutaFichero, true);
		Set<Avistamiento> aux = new HashSet<Avistamiento>();
		for(String s:lista) {
			aux.add(parseaAvistamiento(s));
		}
		return new Avistamientos(aux);
	}
}
