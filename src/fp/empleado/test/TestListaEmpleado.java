package fp.empleado.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import fp.empleado.Empleado;
import fp.empleado.FactoriaEmpleados;

public class TestListaEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Empleado> le = FactoriaEmpleados.leerFicheroEmpleados("./data/empleados.txt","./data/erroresEmpleados.txt");
		System.out.println("lista");
		System.out.println(le);
		for (Empleado e:le) {
			System.out.println(e.formatoCorto());
		}
		System.out.println("\nSet");
		Set<Empleado> se = new HashSet<Empleado>(le);
		for(Empleado e:se) {
			System.out.println(e.formatoCorto());
		}
		System.out.println("\nSortedSet");
		SortedSet<Empleado> sse = new TreeSet<Empleado>(le);
		for(Empleado e:sse) {
			System.out.println(e.formatoCorto());
		}
	}

}
