package mainPack;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// COMO A 5 ERA INSTANCIAR OBJETOS DOS EXERCÍCIOS ANTERIORES APENAS CRIEI ESSE
		// MAIN PARA TAL E COPIEI AS CLASSES PRA CÁ

		Administrativo adm = new Administrativo("Victor", 6196, 'N');
		adm.setbonusNoturno(350);
		Tecnico tec = new Tecnico("Pedro", 2524, 100);

		System.out.println("Questão A:");
		System.out.println("");
		adm.exibeDados();
		System.out.println("-------------------------------");
		tec.exibeDados();
		System.out.println("");

		System.out.println("Questão B:");
		System.out.println("");
		Cachorro dog = new Cachorro("Bobby");
		dog.caminha();
		dog.late();
		Gato cat = new Gato("Nyx");
		cat.caminha();
		cat.mia();
		System.out.println("");

		System.out.println("Questão C:");
		System.out.println("");
		Rica ric = new Rica();
		Pobre pob = new Pobre();
		Miseravel mis = new Miseravel();
		ric.setNomeIdade("Karen", 45);
		pob.setNomeIdade("João", 27);
		mis.setNomeIdade("Ciclano", 59);
		ric.fazCompras();
		pob.trabalha();
		mis.mendiga();
		System.out.println("");

		System.out.println("Questão D:");
		System.out.println("");
		Ingresso ing = null;
		System.out.println("Escolha o tipo de ingresso:");
		System.out.println("1. VIP");
		System.out.println("2. Normal");
		int escolha = s.nextInt();
		switch (escolha) {
		case 1:
			System.out.println("Escolha o Camarote:");
			System.out.println("1. Camarote Superior");
			System.out.println("2. Camarote Inferior");
			int escolha2 = s.nextInt();
			switch (escolha2) {
			case 1:
				ing = new CamaroteSuperior();
				break;
			case 2:
				ing = new CamaroteInferior();
				break;
			default:
				System.out.println("Opção Inválida");
				return;
			}
			break;
		case 2:
			ing = new Normal();
			break;
		default:
			System.out.println("Opção inválida.");
			return;
		}
		ing.imprimeValor();
		System.out.println("");

		System.out.println("Questão E:");
		Imovel imovel = null;
		System.out.println("Escolha o Imóvel:");
		System.out.println("1. Novo");
		System.out.println("2. Velho");
		int escolha3 = s.nextInt();
		switch (escolha3) {
		case 1:
			imovel = new Novo(0, null, 55000);
			break;
		case 2:
			imovel = new Velho(0, null, 100000);
			break;
		default:
			System.out.println("Opção Inválida");
			return;
		}
		imovel.setEndereço("Rua X, 0001, Parque das Arueiras, Pólis - XX");
		imovel.setPreço(250000);
		imovel.imprime();
		System.out.println("");

	}

}
