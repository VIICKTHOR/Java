package q10;

public class Correntista implements Runnable {

	static Conta[] contas;

	public Correntista(Conta[] contas) {
		this.contas = contas;
	}

	@Override
	public void run() {

		delay();

		// fazer 100 movimentaçoes
		for (int i = 0; i < 100; i++) {

			transisao();

		}

	}

	public synchronized void transisao() {

		contas[(int) (Math.random() * 10)].trasferir(contas[(int) (Math.random() * 10)], (int) (Math.random() * 1000));

	}

	public synchronized void delay() {
		try {
			wait(1000);
		} catch (InterruptedException ex) {

		}
	}
}
