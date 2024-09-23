package mainPack;

public class Funcionario {
	
	public String nome;
	
	Funcionario(){
		
	}
	Funcionario(String nome){
		this.nome=nome;
	}
	
	void exibeDados(){
		System.out.println("Nome: "+nome);
	}
}
