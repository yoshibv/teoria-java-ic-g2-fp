package fp.punto;

public class PuntoImpl implements Punto {
	
	private Double x;
	private Double y;

	
	
	public PuntoImpl() {
		super();
		x=0.0;
		y=0.0;
	}

	public PuntoImpl(Double x, Double y) {
		if (x == null || y == null) {
			throw new  IllegalArgumentException();
		}
		this.x = x;
		this.y = y;
	}
// Formato "(x,y)"
	public PuntoImpl(String s) {
		String s1 = s.replace("(", "").replace(")", "");
		String[] sp = s1.split(",");
		if (sp.length != 2) {
			throw new IllegalArgumentException(
				"Cadena con formato no válido");
		}
		x = Double.valueOf(sp[0].trim());
		y = Double.valueOf(sp[1].trim());
	}
	public Double getX() {
		// TODO Auto-generated method stub
		return x;
	}


	public Double getY() {
		// TODO Auto-generated method stub
		return y;
	}

	
	public void setX(Double nx) {
		// TODO Auto-generated method stub
		if (nx == null) {
			throw new  IllegalArgumentException();
		}
		x=nx;
	}


	public void setY(Double ny) {
		// TODO Auto-generated method stub
		y = ny;
	}


	public Double getDistancia(Punto p) {
		// TODO Auto-generated method stub
		Double dx = this.getX() - p.getX();
		Double dy = this.getY() - p.getY();
		return Math.sqrt(dx * dx + dy * dy);
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((x == null) ? 0 : x.hashCode());
		result = prime * result + ((y == null) ? 0 : y.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof PuntoImpl))
			return false;
		PuntoImpl other = (PuntoImpl) obj;
		if (x == null) {
			if (other.x != null)
				return false;
		} else if (!x.equals(other.x))
			return false;
		if (y == null) {
			if (other.y != null)
				return false;
		} else if (!y.equals(other.y))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PuntoImpl [x=" + x + ", y=" + y + "]";
	}


}
