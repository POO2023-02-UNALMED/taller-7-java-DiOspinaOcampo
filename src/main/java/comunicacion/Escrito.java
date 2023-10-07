package comunicacion;

public abstract class Escrito extends Pictograma {
	private String titulo;
	private String autor;
	private int paginas;
	
	protected Escrito(String origen, String titulo, String autor, int paginas) {
		super(origen);
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
	}

	public String resumen() {
		String str = this.getOrigen();
		str = String.join("\n", new String[]{str, titulo, autor, Integer.toString(paginas)});
		return str;
	}
	
	public abstract int palabrasTotales(int factor);

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	};	

}
