package questao4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
	  Scanner s = new Scanner(System.in);
	  boolean valido = false;
	  int n=0;
	  
	  String[] meses = {"Janeiro","Fevereiro","Mar�o","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};	 
	  System.out.println("Escreva um n�mero de 1 a 12 para escolher o m�s do ano:");
	  
	  while(!valido) {
		  try {
			  n = s.nextInt();
			  n=n-1;
			  
			  System.out.println("O m�s correspondente a esse n�mero("+(n+1)+") � "+meses[n]);
			  valido=true;
		  }
		  catch(InputMismatchException e) {
			  System.out.println("Entrada Inv�lida, por favor insira um valor do tipo Inteiro\\nInsira novamente: ");
			  s.next();
		  }
		  catch (ArrayIndexOutOfBoundsException e) {
			  System.out.println("Entrada Inv�lida, note que o valor deve estar contido de 1 a 12\nInsira novamente: ");
		  }
	  }
	  
	  s.close();
	}
}
