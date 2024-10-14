package mainPack;

public class Main { 
	public static void main(String[] args) {
		
		Produtor p = new Produtor();
		Consumidor c = new Consumidor();
		//Consumidor c2 = new Consumidor();
		
		p.start();
		c.start();
		//c2.start();
		
		try {
			p.join();
			System.out.println("Produtor finalizado!!!");
			c.join();
			System.out.println("Consumidor 1 finalizado!!!");
			//c2.join();
			//System.out.println("Consumidor 2 finalizado!!!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
