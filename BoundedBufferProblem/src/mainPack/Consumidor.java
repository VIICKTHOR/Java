package mainPack;

public class Consumidor extends Thread {

	@Override
	public void run() {

		try {
			
			for (int i = 0; i < 30; i++) {
				Memoria.consumir();
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			
			Thread.currentThread().interrupt();
		}

	}
}
