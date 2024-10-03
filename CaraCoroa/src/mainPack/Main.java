package mainPack;

import java.util.Scanner;

public class Main {
	
	static String ultimoPrint;
	
	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		int palpite;
		boolean v= true;
			
		Thread cara = new Thread(new T("CARA", ultimoPrint));
		Thread coroa = new Thread(new T("COROA", ultimoPrint));
		
		while(v){
			
			try {
			System.out.println("Escolha seu palpite, cara(1) ou coroa(2)");
			palpite=s.nextInt();
			
			if(palpite != 1 && palpite != 2) throw new IllegalArgumentException("O numero escolhido não é 1 nem 2");
			v=false;
			}
			catch(IllegalArgumentException e) {
				System.out.println("O numero escolhido não é 1 nem 2");
			}
			
		}
		
		cara.start();
		coroa.start();
		
		cara.join();
		coroa.join();
		
		s.close();
		
		if(ultimoPrint == "CARA" || palpite == 1) {
			
		}
	}
}

