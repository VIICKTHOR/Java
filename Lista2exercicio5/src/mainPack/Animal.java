package mainPack;

public class Animal {
	String nome,raça;
	
	public Animal() {
		
	}
	public Animal(String nome) {
		this.nome=nome;
		
	}
	public String caminha() {
		System.out.println("O/A "+nome+"("+raça+") está caminhando");
		return null;
	}

}
