package fp.testBasico;

import java.util.Arrays;

import fp.punto.Punto;
import fp.punto.PuntoImpl;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre = "Amaia";
		Integer lon = nombre.length(); // El valor de lon será 5
		char inicial = nombre.charAt(0); // El valor de inicial será 'A'
		Character ultima = nombre.charAt(lon - 1); // El valor de ultima será 'a'
		System.out.println(nombre);
		System.out.println(lon);
		System.out.println(inicial);
		String cadena = "(2.0, 3.0 )";
		String[] trozos = cadena.split(",");
		System.out.println(Arrays.toString(trozos));
		Double x = Double.valueOf(trozos[0].replace("(",""));
		Double y = Double.valueOf(trozos[1].replace(")",""));
		Punto p = new PuntoImpl(x,y);
		System.out.println(p);
		for (int i=0;i < cadena.length();i++) {
			System.out.println(cadena.charAt(i));
			
		}
		
		
	}

}
