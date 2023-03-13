package fp.testBasico;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestMap {
	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<String, Integer>();
		m.put("uno", 1); m.put("dos", 2); m.put("tres", 3);
		m.put("cuatro", 4); m.put("cinco", 5); m.put("5", 5);
		m.put("3", 3);
		System.out.println("m = " + m);
		
		Set<String> claves = m.keySet();
		claves.remove("dos");
		System.out.println("m después de eliminar la clave 2: " + m);
		
		Collection<Integer> valores = m.values();
		valores.remove(3);
		System.out.println("m tras eliminar el valor 3 = " + m);
		
		System.out.println("\nEntrySet");
		Set<Map.Entry<String,Integer>> entradas = m.entrySet();
		System.out.println(entradas);
		for(Map.Entry<String,Integer> par:entradas) {
			System.out.println(par.getKey()+" -> "+par.getValue());
		}
		
		System.out.println("\ncontadorCarac");
		System.out.println(contadorCarac("Supercalifragilísticoespialidoso"));
		
		System.out.println("\nindicePal");
		String frase = "la palabra que más aparece en este texto es la palabra palabra";
		String[] tabla = frase.split(" ");
		List<String> lista = Arrays.asList(tabla);
		Map<String,List<Integer>> ind = indicePal(lista);
		System.out.println(ind);
	}
	
	public static Map<Character, Integer> contadorCarac(String frase) {
	      Map<Character, Integer> contador = new HashMap<Character, Integer>();

	      frase = frase.toUpperCase(); // todos los caracteres en mayúsculas

	      for (int i = 0; i < frase.length(); i++) {
	         Character caracter = frase.charAt(i);
	         if (contador.containsKey(caracter)) {
	            Integer valor = contador.get(caracter); 
	            valor++;
	            contador.put(caracter, valor);
	         } else {
	            contador.put(caracter, 1);
	         }
	      }
	      return contador;
	   }
	
	public static Map<String, List<Integer>> indicePal(List<String> palabras) {
	      Map<String,List<Integer>> indice = new HashMap<String,List<Integer>>();
	      int pos = 0;

	      for (String palabra: palabras) {		
	         if (indice.containsKey(palabra)) {
	            indice.get(palabra).add(pos);
	         } else {
	            List<Integer> lista = new ArrayList<Integer>();
	            lista.add(pos);
	            indice.put(palabra, lista);
	         }
	         pos++;
	      }
	      return indice;
	   }
}
