package fp.punto.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import fp.punto.Punto;
import fp.punto.PuntoImpl;

public class TestPuntoListaFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lsp = null;
		Punto p;
		try {
			lsp = Files.readAllLines(Path.of("./data/puntos2.csv"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(lsp);
		lsp.remove(0);
		List<Punto> lp = new ArrayList<Punto>();
		for(String s : lsp) {
			lp.add(new PuntoImpl(s));
		}
		System.out.println(lp);
		
		

	}

}
