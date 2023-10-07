package comunicacion;

public class Tesis extends Escrito {
	private String idea;
	private String[] argumentos = new String[] {};
	private String conclusion;
	private String referencias;
	private String interpretacion;
	
	public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos, 
			String conclusion, String referencias, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.idea = idea;
		this.argumentos = (argumentos != null) ? argumentos : this.argumentos;
		this.conclusion = conclusion;
		this.referencias = referencias;
		this.interpretacion = interpretacion;
	}

	@Override
	public int palabrasTotales(int factor) {
		return this.getPaginas() * factor * 5;
	}

	@Override
	public String interpretacion() {
		return this.interpretacion;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s\n%s\n%d\n%s\n%s", this.resumen(), this.idea, this.argumentos.length,
				this.conclusion, this.referencias);
	}

	public String getIdea() {
		return idea;
	}

	public void setIdea(String idea) {
		this.idea = idea;
	}

	public String[] getArgumentos() {
		return argumentos;
	}

	public void setArgumentos(String[] argumentos) {
		this.argumentos = argumentos;
	}

	public String getConclusion() {
		return conclusion;
	}

	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}

	public String getReferencias() {
		return referencias;
	}

	public void setReferencias(String referencias) {
		this.referencias = referencias;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	public static void main(String[] args) {
		Tesis tesis = new Tesis("Pensamiento expansivo", "Recomendador", "Alejandro", 20, "Recomendar asignaturas", new String [] {"Primero", "Segundo"},
				"Se hace trabajo futuro", "[1] Maquinaria",  "Escrito investigativo");
		String  comp = "Pensamiento expansivo\n" + 
				"Recomendador\n" + 
				"Alejandro\n" + 
				"20\n" + 
				"Recomendar asignaturas\n" + 
				"2\n" + 
				"Se hace trabajo futuro\n" + 
				"[1] Maquinaria";
		System.out.println(tesis instanceof Escrito);
		System.out.println(tesis instanceof Pictograma);
	}
}
