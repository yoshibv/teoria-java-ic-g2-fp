package fp.testBasico;

import fp.punto.Punto;
import fp.punto.PuntoImpl;

public class TestOperaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto p1 = new PuntoImpl(2.0,3.8);
		Integer x = (int) ( p1.getX()+p1.getY());
		System.out.print(x);
	}

}
