package fp.punto.test;

import fp.punto.Punto;
import fp.punto.PuntoImpl;

public class TestPunto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto p = new PuntoImpl(2.0,3.0);
		System.out.println(p);
		p.setX(null);
		System.out.println(p.getX());
		Punto p1 = new PuntoImpl("(2.2,3.2)");
		System.out.println(p1);
				

	}

}
