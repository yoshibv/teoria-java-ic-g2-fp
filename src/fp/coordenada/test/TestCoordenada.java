package fp.coordenada.test;

import java.util.Random;

import fp.coordenada.Coordenada;
import fp.coordenada.Hemisferio;

public class TestCoordenada {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Coordenada c1 = new Coordenada(randLat(),randLon(),randHem());
		Coordenada c2 = new Coordenada(randLat(),randLon(),randHem());
		Coordenada c3 = new Coordenada(64.23199457821596,-7.303642207997996,Hemisferio.NORTE);
		Coordenada c4 = new Coordenada(64.23199457821596,-7.303642207997996,Hemisferio.SUR);
		System.out.println("PRUEBA DE LOS CONSTRUCTORES");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(new Coordenada());
		System.out.println(new Coordenada("(64.23199457821596,-7.303642207997996)"));
		System.out.println();
		System.out.println("PRUEBA DE EQUALS");
		System.out.println("Con c1 y c2: " + c1.equals(c2));
		System.out.println("Con c3 y c4: " + c3.equals(c4));
		System.out.println();
		System.out.println("PRUEBA DE COMPARETO");
		System.out.println("Con c1 y c2: " + c1.compareTo(c2));
		System.out.println("Con c3 y c4: " + c3.compareTo(c4));
	}
	
	public static Hemisferio randHem() {
		int randNum = new Random().nextInt(Hemisferio.values().length);
		Hemisferio randHem = Hemisferio.values()[randNum];
		return randHem;
	}
	
	public static Double randLat() {
		Random r = new Random();
		final double MIN_LAT = -90.0;
	    final double MAX_LAT = 90.0;
	    double lat = MIN_LAT + (MAX_LAT - MIN_LAT) * r.nextDouble();
	    return lat;
	}
	
	public static Double randLon() {
		Random r = new Random();
		final double MIN_LON = -180.0;
	    final double MAX_LON = 180.0;
	    double lon = MIN_LON + (MAX_LON - MIN_LON) * r.nextDouble();
	    return lon;
	}
}
