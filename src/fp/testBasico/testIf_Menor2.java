package fp.testBasico;

import java.util.Scanner;

public class testIf_Menor2 {

	public static void main(String[] args) {
		// Scanner es un tipo objeto que nos permite leer datos 
		// desde el teclado  
		Scanner sc = new Scanner (System.in);

		// M�todo que nos permite escribir texto en la consola
		System.out.println("Introduzca un entero: ");

		// El m�todo "nextInt()" lee un entero desde el teclado y lo devuelve
		Integer a = sc.nextInt();

		System.out.println ("Introduzca otro entero: ");
		Integer b = sc.nextInt();

		Integer menor;
		if(a<=b){
			menor = a;
		}else{
			menor = b;
		}
		System.out.println ("El menor es :  "  +  menor);
		sc.close();
	}

}
