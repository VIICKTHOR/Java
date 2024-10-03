package q1;

public class Publicacao {

	protected int numeroCatalogo;
	protected String titulo;

	public Publicacao() {

	}

	public Publicacao(String titulo, int numeroCatalogo) {
		this.titulo = titulo;
		this.numeroCatalogo = numeroCatalogo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumeroCatalogo() {
		return numeroCatalogo;
	}

	public void setNumeroCatalogo(int numeroCatalogo) {
		this.numeroCatalogo = numeroCatalogo;
	}

	public void ler() {
		System.out.println("O leitor está lendo a publicação " + titulo);
	}
}
