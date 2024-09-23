package q3;

import java.util.Scanner;

public class EntradaSaida {
	
	private int resultado;
	Scanner s = new Scanner(System.in);
	
	public int entrada() {
		System.out.println("Escreva a sua idade: ");
		System.out.println("Anos: ");
		int a = s.nextInt();
		
		System.out.println("Meses: ");		
		int m = s.nextInt();
		
		System.out.println("Dias: ");
		int d = s.nextInt();

		return resultado = (a*365)+(m*30)+d;
			
	}
	public void saida(int x) {
		System.out.println("Você tem "+x+" anos de idade");
	}
	
	
	

	

}
