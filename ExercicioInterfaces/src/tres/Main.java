package tres;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		OperacaoMatematica x = null;
		
		System.out.println("Opera��es Matem�ticas!");
		System.out.println("DIgite a opera��o desejada:");
		System.out.println("(1) Soma");
		System.out.println("(2) Subtra��o");
		System.out.println("(3) Multiplica��o");
		System.out.println("(4) Divis�o");
		
		int escolha = s.nextInt();
		switch(escolha) {
		
		case 1:
			x = new Soma();
			break;
		case 2:
			x = new Subtracao();
			break;
		case 3:
			x = new Multiplicacao();
			break;
		case 4:
			x = new Divisao();
			break;
		default:
			System.out.println("Op��o Inv�lida, Fim.");
			System.exit(0);
		}
		System.out.println("Informe o valor A:");
		int x0 = s.nextInt();
		System.out.println("Informe o valor B: ");
		int x1 = s.nextInt();
		
		System.out.println("O resultado � "+x.calcula(x0, x1));
		
		s.close();
	}
}
