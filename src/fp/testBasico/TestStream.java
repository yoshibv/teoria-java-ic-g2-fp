package fp.testBasico;

import java.util.LinkedList;
import java.util.List;

public class TestStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Double> temperaturas = new LinkedList<>();
		temperaturas.add(27.5);
		temperaturas.add(22.0);
		temperaturas.add(25.3);
		System.out.print(temperaturas);
		Double t = 40.;
		boolean algunaPorEncima = temperaturas.stream().anyMatch(x -> x > t);
		if (algunaPorEncima) {
			System.out.println("Hay al menos una temperatura mayor de "+t);
		} else {
			System.out.println("No Hay al ninguna una temperatura mayor de "+t);

		}
		Double suma = temperaturas.stream().mapToDouble(x -> x).sum();
		System.out.println(suma/temperaturas.size());
	}

}
