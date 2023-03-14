package fp.avistamientos;

import java.time.LocalDate;
import java.util.Objects;

import fp.coordenada.Coordenadas;
import fp.utilidades.Checkers;

public class Avistamiento implements Comparable<Avistamiento> {
	private LocalDate fecha;
	private String lugar;
	private Integer duracion;
	private Forma forma;
	private Coordenadas ubicacion;
	private Integer año;
	
	public Avistamiento(
			LocalDate fecha, 
			String lugar,
			Integer duracion, 
			Forma forma,
			Coordenadas ubicacion, 
			Integer año) {
		super();
		Checkers.check("Duración debe ser positiva", duracion>0);
		this.fecha = fecha;
		this.lugar = lugar;
		this.duracion = duracion;
		this.forma = forma;
		this.ubicacion = ubicacion;
		this.año = año;
	}
	
	public Avistamiento(
			String lugar,
			Integer duracion, 
			Forma forma,
			Coordenadas ubicacion, 
			Integer año) {
		super();
		Checkers.check("Duración debe ser positiva", duracion>0);
		this.fecha = LocalDate.now();
		this.lugar = lugar;
		this.duracion = duracion;
		this.forma = forma;
		this.ubicacion = ubicacion;
		this.año = año;
	}

	@Override
	public int hashCode() {
		return Objects.hash(fecha, lugar);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Avistamiento other = (Avistamiento) obj;
		return Objects.equals(fecha, other.fecha) && Objects.equals(lugar, other.lugar);
	}
	
	@Override
	public int compareTo(Avistamiento a) {
		int res = this.lugar.compareTo(a.lugar);
		if (res==0) {
			res = this.fecha.compareTo(a.fecha);
		}
		return res;
	}
}
