package fp.avistamientos.test;

import fp.avistamientos.Avistamiento;

public class TestAvistamientos {
	public static void main(String[] args) {
		Avistamiento a = new Avistamiento("21/01/2019;Sevilla;30;CIRCULAR;(37.38,-5.97)");
		System.out.println(a);
	}
}
