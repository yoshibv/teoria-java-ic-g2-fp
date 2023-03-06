package fp.empleado;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
	
	public Persona getDatosPersonales() {
		return datosPersonales;
	}
	
	public Double getIrpf() {
		return irpf;
	}
	
	public List<Double> getSueldos() {
		return new ArrayList<Double>(sueldos);
	}
	
	public String formatoCorto() {
		return this.datosPersonales.getApellidos()+", "+this.datosPersonales.getNombre()+" : "+this.getSueldoNeto();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(datosPersonales);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return Objects.equals(datosPersonales, other.datosPersonales);
	}
	
	

}
