package mainPack;

public class Gato extends Animal{
	
	public Gato(String nome) {
		super(nome);
		ra�a="Gato";
	}
	
	public String mia() {
		System.out.println("O/A "+nome +" Miou");
		return null;
	}
}
