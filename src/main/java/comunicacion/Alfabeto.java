package comunicacion;

public class Alfabeto extends Pictograma {
	private String[] letras = new String[] {};
	private String interpretacion;
	
	
	public Alfabeto(String origen, String interpretacion) {
		super(origen);
		this.interpretacion = interpretacion;
	}

	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		this.letras = (letras != null) ? letras : this.letras;
		this.interpretacion = interpretacion;
	}

	public String[] getLetras() {
		return letras;
	}

	public void setLetras(String[] letras) {
		this.letras = letras;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	public int cantidadLetras() {
		return letras.length;
	}
	
	@Override
	public String interpretacion() {
		return this.interpretacion;
	}

	@Override
	public String toString() {
		return String.join(", ", letras);
	}
}
