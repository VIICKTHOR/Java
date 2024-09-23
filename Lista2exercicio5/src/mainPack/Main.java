package mainPack;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// COMO A 5 ERA INSTANCIAR OBJETOS DOS EXERC�CIOS ANTERIORES APENAS CRIEI ESSE
		// MAIN PARA TAL E COPIEI AS CLASSES PRA C�

		Administrativo adm = new Administrativo("Victor", 6196, 'N');
		adm.setbonusNoturno(350);
		Tecnico tec = new Tecnico("Pedro", 2524, 100);

		System.out.println("Quest�o A:");
		System.out.println("");
		adm.exibeDados();
		System.out.println("-------------------------------");
		tec.exibeDados();
		System.out.println("");

		System.out.println("Quest�o B:");
		System.out.println("");
		Cachorro dog = new Cachorro("Bobby");
		dog.caminha();
		dog.late();
		Gato cat = new Gato("Nyx");
		cat.caminha();
		cat.mia();
		System.out.println("");

		System.out.println("Quest�o C:");
		System.out.println("");
		Rica ric = new Rica();
		Pobre pob = new Pobre();
		Miseravel mis = new Miseravel();
		ric.setNomeIdade("Karen", 45);
		pob.setNomeIdade("Jo�o", 27);
		mis.setNomeIdade("Ciclano", 59);
		ric.fazCompras();
		pob.trabalha();
		mis.mendiga();
		System.out.println("");

		System.out.println("Quest�o D:");
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
				System.out.println("Op��o Inv�lida");
				return;
			}
			break;
		case 2:
			ing = new Normal();
			break;
		default:
			System.out.println("Op��o inv�lida.");
			return;
		}
		ing.imprimeValor();
		System.out.println("");

		System.out.println("Quest�o E:");
		Imovel imovel = null;
		System.out.println("Escolha o Im�vel:");
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
			System.out.println("Op��o Inv�lida");
			return;
		}
		imovel.setEndere�o("Rua X, 0001, Parque das Arueiras, P�lis - XX");
		imovel.setPre�o(250000);
		imovel.imprime();
		System.out.println("");

	}

}
