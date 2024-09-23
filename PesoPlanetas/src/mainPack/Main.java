package mainPack;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		CalculaPeso cp = new CalculaPeso();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira o seu peso:");
		cp.peso= scan.nextFloat();
		
		System.out.println("Escolha o planeta (número) para saber seu peso nele: \n(1= Mercúrio | 2= Venus | 3= Marte | 4= Jupiter | 5= Saturno | 6= Urano)");
		cp.planeta= scan.nextInt();
		
		cp.calcPlaneta();
		
		System.out.println("Seu peso em "+cp.pNome+" é "+cp.calcPlaneta()+" kg");		
		
		scan.close();
	}

}
