package mainPack;

public class Produtor extends Thread {

	@Override
	public void run() {

		try {
			
			for (int i = 0; i < 30; i++) {
				Memoria.produzir(i);
				Thread.sleep(600);
			}
		} catch (InterruptedException e) {
			
			Thread.currentThread().interrupt();
		}
	}
}
