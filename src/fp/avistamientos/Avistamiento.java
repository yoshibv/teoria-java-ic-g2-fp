package fp.avistamientos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

import fp.coordenada.Coordenada;
import fp.utilidades.Checkers;

public class Avistamiento implements Comparable<Avistamiento> {
	private LocalDate fecha;
	private String lugar;
	private Integer duracion;
	private Forma forma;
	private Coordenada ubicacion;
	private Integer año;
	
	public Avistamiento(
			LocalDate fecha, 
			String lugar,
			Integer duracion, 
			Forma forma,
			Coordenada ubicacion) {
		super();
		Checkers.check("Duración debe ser positiva", duracion>0);
		this.fecha = fecha;
		this.lugar = lugar;
		this.duracion = duracion;
		this.forma = forma;
		this.ubicacion = ubicacion;
		this.año = fecha.getYear();
	}
	
	public Avistamiento(
			String lugar,
			Integer duracion, 
			Forma forma,
			Coordenada ubicacion, 
			Integer año) {
		super();
		Checkers.check("Duración debe ser positiva", duracion>0);
		this.fecha = LocalDate.now();
		this.lugar = lugar;
		this.duracion = duracion;
		this.forma = forma;
		this.ubicacion = ubicacion;
		this.año = this.fecha.getYear();
	}
	
	public Avistamiento(String s) {
		super();
		String[] a = s.split(";");
		this.fecha = LocalDate.parse(a[0].trim(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		this.lugar = a[1].trim();
		this.duracion = Integer.decode(a[2].trim());
		this.forma = Forma.valueOf(a[3].trim());
		this.ubicacion = new Coordenada(a[4].trim());
		this.año = this.fecha.getYear();
	}
	
	public Double getDistancia(Avistamiento a) {
		return this.getUbicacion().getDistancia(a.getUbicacion());
	}
	
	public LocalDate getFecha() {
		return fecha;
	}

	public String getLugar() {
		return lugar;
	}

	public Integer getDuracion() {
		return duracion;
	}

	public Forma getForma() {
		return forma;
	}

	public Coordenada getUbicacion() {
		return ubicacion;
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

	@Override
	public String toString() {
		return "Avistamiento [fecha=" + fecha + ", lugar=" + lugar + ", duracion=" + duracion + ", forma=" + forma
				+ ", ubicacion=" + ubicacion + ", año=" + año + "]";
	}
}