package q1;

public class Livro extends Publicacao{
	private boolean disponivel=true;
	
	public Livro() {
		
	}
	
	public Livro(String titulo, int numeroCatalogo) {
		super(titulo, numeroCatalogo);
	}
	

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	@Override
	public void ler() {
		if(isDisponivel()) {
		System.out.println("O leitor está lendo o livro "+titulo);
		}else {
			System.out.println("O livro "+titulo+" esta emprestado no momento");
		}
	}
	
	public void emprestar() {
		disponivel=false;
	}
	public void devolver() {;
		disponivel=true;
	}
}
