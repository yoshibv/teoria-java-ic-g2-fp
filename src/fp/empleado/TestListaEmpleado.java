package fp.empleado;

import java.util.List;

public class TestListaEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Empleado> le = FactoriaEmpleados.leerFicheroEmpleados("./data/empleados.txt");
		System.out.println(le);
		for (Empleado e:le) {
			System.out.println(e.formatoCorto());
		}
	}

}
