package fp.punto;

public class PixelImpl extends PuntoImpl implements Pixel {
	private Color color;
	
	public PixelImpl() {
		super();
		color = Color.VERDE;
	}	
	public PixelImpl(Color color) {
		super();
		this.color = color;
	}
	public PixelImpl(Double x, Double y,Color color) {
		super(x,y);
		this.color = color;
	}
	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setColor(Color c) {
		// TODO Auto-generated method stub
		color = c;
	}

	@Override
	public String toString() {
		return super.toString()+"PixelImpl [color=" + color + "]";
	}

}
