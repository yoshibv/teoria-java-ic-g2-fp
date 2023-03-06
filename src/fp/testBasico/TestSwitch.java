package fp.testBasico;

import fp.punto.Color;

public class TestSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Color c1 = Color.AZUL;
		switch(c1){
		   case ROJO:
		   // sentencias que se ejecutan si c1 es ROJO
			   System.out.println(" Paso por color : "+ c1);
		   break;

		   case AZUL:
		   // sentencias que se ejecutan si c1 es AZUL
			   System.out.println(" Paso por color : "+ c1);
//			  break;

		   case VERDE:
		   // sentencias que se ejecutan si c1 es VERDE
			   System.out.println(" Paso por color : "+ c1);
//			   break;

		   default:
			   System.out.println(" Paso por resto de colores : "+ c1);
		   // sentencias que se ejecutan si c1 es otro color
		   break;
		}

	}

}
