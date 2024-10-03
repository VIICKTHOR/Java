package q4;

import static q4.LebreRun.printRank;

public class Main {

	final static int NUM_LEBRE = 5;
	final static int DISTANCIA = 20;

	public static void main(String[] args) {
		
		LebreRun[] x = new LebreRun[NUM_LEBRE];
		
		for(int i=0;i<NUM_LEBRE;i++) {
			
			x[i] = new LebreRun(""+(i+1),DISTANCIA);
			x[i].start();
		}
		try {
			x[0].join();
			x[1].join();
			x[2].join();
			x[3].join();
			x[4].join();
		}
		catch(InterruptedException e) {
			
		}
		
		printRank();
	}
	
}
