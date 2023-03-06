package fp.punto.test;

import fp.punto.Circulo;
import fp.punto.PuntoImpl;

public class TestCirculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circulo c = new Circulo( new PuntoImpl(2.0,3.0),5.0);
		System.out.println(c);
		c.getCentro().setX(22.2);
		System.out.println(c);

	}

}
