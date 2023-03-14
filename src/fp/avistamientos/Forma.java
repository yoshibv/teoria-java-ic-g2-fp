package fp.avistamientos;

public enum Forma {
	CIRCULAR("CIRCULAR"), TRIANGULAR("TRIANGULAR"), OTRA("OTRA");
	
	private String forma;
	
	Forma(String s){
		this.forma = s;
	}
	
	public String getForma() {
		return forma;
	}
	
}
