package q10;

public class Banco {

	double valorTotal;
	static Conta[] contas = new Conta[10];

	public Banco(double valorTotal) {
		this.valorTotal = valorTotal;
		for (int i = 0; i < 10; i++)
			contas[i] = new Conta(valorTotal / 10);

		showTotal();

		Thread[] t = new Thread[5];
		for (int i = 0; i < 5; i++) {
			t[i] = new Thread(new Correntista(contas));
			t[i].start();
		}
		for (int i = 0; i < 5; i++) {
			try {
				t[i].join();
			} catch (InterruptedException ex) {

			}
		}
		showTotal();
	}

	public void showTotal() {
		double sum = 0;
		for (int i = 0; i < contas.length; i++)
			sum = contas[i].saldo + sum;
		System.out.println(sum);

	}

}
