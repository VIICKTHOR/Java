package q1;

public class ContaCorrente implements Conta {
	private double total = 0;

	public ContaCorrente() {
	}

	public ContaCorrente(double total) {
		this.total = total;
	}

	@Override
	public void depositar(double valor) {
		total = total + (valor - (valor * 0.0045));

	}

	@Override
	public void sacar(double valor) {
		total = total - ((valor + (valor * 0.0045)));

	}

	@Override
	public double getSaldo() {
		// TODO Auto-generated method stub
		return total;
	}

}
