package q1;

public class ContaPoupanca implements Conta {
	private double total = 0;

	public ContaPoupanca() {
	}

	public ContaPoupanca(double total) {
		this.total = total;
	}

	@Override
	public void depositar(double valor) {
		total = total + valor;

	}

	@Override
	public void sacar(double valor) {
		total = total - valor;

	}

	@Override
	public double getSaldo() {
		return total;
	}

}
