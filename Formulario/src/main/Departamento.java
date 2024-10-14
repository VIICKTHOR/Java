package main;

import java.util.ArrayList;

public class Departamento {
	private String nome;
	private int codigo;
	ArrayList<Funcionario> listaFunc;
	
	public Departamento() {
		listaFunc = new ArrayList();
	}
	
	public Departamento(int codigo,String nome) {
		this.setCodigo(codigo);
		this.setNome(nome);
		listaFunc = new ArrayList();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public ArrayList<Funcionario> getListFunc(){
		return listaFunc;
	}
	
	public void setListFunc(ArrayList<Funcionario> listaFunc){
		this.listaFunc=listaFunc;
	}
	
	public void addFunc(Funcionario F) {
		F.setDep(this);
		listaFunc.add(F);
	}
}
