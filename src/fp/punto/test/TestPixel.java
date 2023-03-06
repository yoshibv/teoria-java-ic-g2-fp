package fp.punto.test;

import fp.punto.Color;
import fp.punto.Pixel;
import fp.punto.PixelImpl;

public class TestPixel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pixel pi = new PixelImpl();
		System.out.println(pi);
		Pixel pi2 = new PixelImpl(Color.AMARILLO);
		Pixel pi3 = new PixelImpl(2.0,3.0,Color.AMARILLO);
		pi.setX(2.0);
		pi.setColor(Color.AZUL);
		System.out.println(pi);
		System.out.println(pi2);
		System.out.println(pi3);

	}

}
