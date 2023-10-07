package comunicacion;

public abstract class Pictograma {
	private String origen;
	
	protected Pictograma(String origen) {
		this.origen = origen;
	}
	
	public abstract String interpretacion();
	public abstract String toString();
	
	public String getOrigen() {
		return this.origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}
}
