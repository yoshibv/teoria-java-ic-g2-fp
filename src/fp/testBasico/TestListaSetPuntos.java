package fp.testBasico;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import fp.punto.Punto;
import fp.punto.PuntoImpl;

public final class TestListaSetPuntos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Punto> lp = new ArrayList<Punto>();
		Punto p1 = new PuntoImpl();
		Punto p2 = new PuntoImpl();
		Punto p3 = p1;
		lp.add(p1);
		lp.add(p2);
		lp.add(p3);
		p3.setX(3.0);
		System.out.println(lp);
		Set<Punto> sp = new HashSet<Punto>();
		System.out.println(sp);
		sp.add(p1);
		sp.add(p2);
		sp.add(p3);
		System.out.println(sp);
		

	}

}
