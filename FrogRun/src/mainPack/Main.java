package mainPack;

public class Main {

	final static int NUM_SAPO = 5;
	final static int DISTANCIA = 500;

	public static void main(String[] args) {
		
		SapoCorrendoThread sapo_1 = new SapoCorrendoThread("SAPO DAVI", DISTANCIA);
		SapoCorrendoThread sapo_2 = new SapoCorrendoThread("SAPO VICTOR", DISTANCIA);
		SapoCorrendoThread sapo_3 = new SapoCorrendoThread("SAPO PEDRO", DISTANCIA);
		SapoCorrendoThread sapo_4 = new SapoCorrendoThread("SAPO TRINDADE", DISTANCIA);
		SapoCorrendoThread sapo_5 = new SapoCorrendoThread("SAPO CAUÃ", DISTANCIA);
		
		sapo_1.setPriority(Thread.MIN_PRIORITY);
		sapo_2.setPriority(Thread.MIN_PRIORITY);
		sapo_3.setPriority(Thread.NORM_PRIORITY);
		sapo_4.setPriority(Thread.MAX_PRIORITY);
		sapo_5.setPriority(Thread.MAX_PRIORITY);
		
		sapo_1.start();
		sapo_2.start();
		sapo_3.start();
		sapo_4.start();
		sapo_5.start();
	}
}
