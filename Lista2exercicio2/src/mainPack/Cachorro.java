package mainPack;

public class Cachorro extends Animal{
	
	public Cachorro(String nome) {
		super(nome);
		ra�a="Cachorro";
	}
	
	public String late() {
		System.out.println("O/A "+nome +" Latiu");
		return null;
	}
}
