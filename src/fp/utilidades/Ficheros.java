package fp.utilidades;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Ficheros {
	public static List<String> leerFichero(String nomfich){
		List<String> l=null;
		try {
			l = Files.lines(Paths.get(nomfich),StandardCharsets.UTF_8).toList();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		l.remove((int) 0);
		return l;
	}
	public static List<String> leerFichero(String nomfich, Boolean quitarCabecera){
		List<String> l=null;
			try {
				l = Files.readAllLines(Paths.get(nomfich),StandardCharsets.UTF_8);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		if(quitarCabecera) {
			l.remove((int) 0);
		}
		return l;
	}

}
