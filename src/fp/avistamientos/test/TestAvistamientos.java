package fp.avistamientos.test;

import java.time.LocalDate;
import java.util.Set;

import fp.avistamientos.Avistamiento;
import fp.avistamientos.FactoriaAvistamientos;
import fp.avistamientos.Forma;
import fp.coordenada.Coordenada;
import fp.coordenada.Hemisferio;

public class TestAvistamientos {
	public static void main(String[] args) {
		Avistamiento a = new Avistamiento("21/01/2019;París;20;TRIANGULAR;(48.85835157657936, 2.294437402026038)");
		System.out.println(a);
		Avistamiento a2 = new Avistamiento(LocalDate.of(2023, 2, 14),"Sevilla",30,Forma.CIRCULAR,new Coordenada(37.326370056238225, -5.965940505633718,Hemisferio.NORTE));
		System.out.println(a2);
		System.out.println("Distancia entre los dos avistamientos: \n"+a.getDistancia(a2)+" km");
		Set<Avistamiento> setAv = FactoriaAvistamientos.leerAvistamientos("./data/ovnis.csv");
		for(Avistamiento av:setAv) {
			System.out.println(av);
		}
	}
}
