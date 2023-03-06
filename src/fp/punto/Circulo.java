package fp.punto;

public class Circulo {
	private Punto centro;
	private Double radio;
	public Circulo(Punto centro, Double radio) {
		super();
		this.centro = centro;
		this.radio = radio;
	}
	public Double getDistancia(Circulo c) {
		return this.centro.getDistancia(c.centro);
	}
	
	public Punto getCentro() {
		return new PuntoImpl(centro.getX(),centro.getY());
	}
	@Override
	public String toString() {
		return "Circulo [centro=" + centro + ", radio=" + radio + "]";
	}
	
	

}
