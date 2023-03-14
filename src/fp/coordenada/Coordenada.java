package fp.coordenada;

import java.util.Objects;

import fp.utilidades.Checkers;

public class Coordenada implements Comparable<Coordenada> {
	private Double latitud;
	private Double longitud;
	private Hemisferio hemisferio;
	
	public Coordenada(Double latitud, Double longitud, Hemisferio hemisferio) {
		super();
		Checkers.check("La latitud debe estar entre -90º y +90º", -90 <= latitud && latitud <= 90);
		Checkers.check("La longitud debe estar entre -180º y +180º", -180 <= longitud && longitud <= 180);
		this.latitud = latitud;
		this.longitud = longitud;
		this.hemisferio = hemisferio;
	}
	
	public Coordenada() {
		this.latitud = 0.0;
		this.longitud = 0.0;
	}
	
	public Coordenada(String s) {
	    String[] coordenadas = s
	        .replace("(", "")
	        .replace(")", "")
	        .split(",");
	    this.latitud = Double.parseDouble(coordenadas[0].trim());
	    this.longitud = Double.parseDouble(coordenadas[1].trim());
	}
	
	public Double getLatitud() {
		return latitud;
	}

	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}

	public Double getLongitud() {
		return longitud;
	}

	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}

	public Double getDistancia(Coordenada c) {
		final double R = 6371; // Radio de la Tierra en km
	    double dLat = Math.toRadians(c.getLatitud() - this.getLatitud());
	    double dLon = Math.toRadians(c.getLongitud() - this.getLongitud());
	    double a = Math.sin(dLat / 2) * Math.sin(dLat / 2)
	            + Math.cos(Math.toRadians(this.getLatitud())) * Math.cos(Math.toRadians(c.getLatitud()))
	            * Math.sin(dLon / 2) * Math.sin(dLon / 2);
	    double coord = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
	    double distance = R * coord;
	    return distance;
	}
	
	@Override
	public String toString() {
		return "Coordenada [latitud=" + latitud + ", longitud=" + longitud + ", hemisferio=" + hemisferio + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(latitud, longitud);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coordenada other = (Coordenada) obj;
		return Objects.equals(latitud, other.latitud) && Objects.equals(longitud, other.longitud);
	}
	
	@Override
	public int compareTo(Coordenada c) {
		int res = this.latitud.compareTo(c.latitud);
		if (res==0) {
			res = this.longitud.compareTo(c.longitud);
		}
		return res;
	}
	
	
}
