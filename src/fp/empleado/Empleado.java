package fp.empleado;

import java.util.List;

import fp.personaInterfaz.Persona;

public class Empleado {
	private Persona datosPersonales;
	private Double irpf;
	private List<Double> sueldos;
	public Empleado(Persona datosPersonales, Double irpf, List<Double> sueldos) {
		super();
		this.datosPersonales = datosPersonales;
		this.irpf = irpf;
		this.sueldos = sueldos;
	}
	@Override
	public String toString() {
		return "Empleado [datosPersonales=" + datosPersonales + ", irpf=" + irpf + ", sueldos=" + sueldos + "]";
	}
	public Double getSueldoNeto() {
		Double res = 0.0;
		for(Double sueldo :sueldos) {
			res+=sueldo;
		}
		
		return res-res*irpf/100;
	}
	public String formatoCorto() {
		return this.datosPersonales.getApellidos()+", "+this.datosPersonales.getNombre()+" : "+this.getSueldoNeto();
	}
	
	

}
