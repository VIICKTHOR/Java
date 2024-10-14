package main;

public class Funcionario {
	private int matricula;
	private String nome;
	private Departamento dep;
	
	public Funcionario() {
		
	}
	
	public Funcionario(int matricula,String nome) {
		this.setMatricula(matricula);
		this.setNome(nome);
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Departamento getDep() {
		return dep;
	}

	public void setDep(Departamento dep) {
		this.dep = dep;
	}

}
