package main_Pack;

public class Main {

	public static void main(String[] args) {
		
		Departamento dp_Vic = new Departamento();
		
		dp_Vic.nome="Instituto de Biotecnologia";
		dp_Vic.sigla="IBiotec";
		
		dp_Vic.curso.nome="Ciência da Computação";
		dp_Vic.curso.sigla="CC";
		dp_Vic.curso.periodos= 8;
		
		dp_Vic.curso.aluno.nome="Victor Costa Ribeiro";
		dp_Vic.curso.aluno.matricula=202301146;
		dp_Vic.curso.aluno.anoIngresso=2023;
	}

}
