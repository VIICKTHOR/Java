package mainPack;

public class Assistente extends Funcionario{
	private int matricula;
	
	public Assistente(String nome,int matricula) {
		super(nome);
		this.matricula=matricula;
		
	}
	public Assistente() {
		
	}
	 
	public void setMatricula(int matricula){
		this.matricula=matricula;
	}
	 
	public int getMatricula(){
		return matricula;
	}
	 
	 @Override
	void exibeDados() {
		System.out.println("Assistente");
		super.exibeDados();
		System.out.println("Matrícula: "+matricula);
		
	}
}
