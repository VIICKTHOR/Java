package q9;

import static q9.F1.print;

public class Main {
	
	final static int VOLTAS=65;
	static String[] rank;
	
	public static void main(String[] args) {
		
		F1 carro1 = new F1("Felipe Massa",VOLTAS);
		F1 carro2 = new F1("Lewis Hamilton",VOLTAS);
		
		System.out.println("A corrida começou!");
		
		carro1.start();
		carro2.start();
		
		try {
			carro1.join();
			carro2.join();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		print();
	}
}
