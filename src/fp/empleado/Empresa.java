package fp.empleado;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private String nombre;
	private List<Empleado> trabajadores;
	
	public Empresa(String nombre) {
		super();
		this.nombre = nombre;
		this.trabajadores = new ArrayList<Empleado>(trabajadores);
	}

	public Empresa(String nombre, List<Empleado> trabajadores) {
		super();
		this.nombre = nombre;
		this.trabajadores = trabajadores;
	}

	public String getNombre() {
		return nombre;
	}

	public List<Empleado> getTrabajadores() {
		return new ArrayList<Empleado>(trabajadores);
	}

	@Override
	public String toString() {
		return "Empresa [nombre=" + nombre + "]" + trabajadores.size();
	}
	
	public Double sueldoMedio() {
		Double suma = 0.0;
		for(Empleado e:trabajadores) {
			suma+=e.getSueldoNeto();
		}
		return suma/trabajadores.size();
	}
	
	public Boolean hayEmpleadosConSueldoMenor(Double minimo) {
		Boolean res = false;
		for(Empleado e:trabajadores) {
			if(e.getSueldoNeto()<minimo) {
				res = true;
				break;
			}
		}
		return res;
	}
	
	public List<Empleado> empleadosEdadMenorDe(Integer minimo) {
		List<Empleado> res = new ArrayList<Empleado>();
		for(Empleado e:trabajadores) {
			if(e.getDatosPersonales().getEdad()<minimo) {
				res.add(e);
			}
		}
		return res;
	}
	
}
