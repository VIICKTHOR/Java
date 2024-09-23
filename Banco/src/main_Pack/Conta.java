package main_Pack;

public class Conta {

	String numero, nome, tipo;
	Double saldo, limite;

	void sacar(double valor) {

		if (this.saldo > valor) {

			saldo = saldo - valor;

		} else {
			System.out.println("\nOperação inválida, falta de Saldo");
		}

	}

	void depositar(double valor) {

		saldo = saldo + valor;
	}

	void tranferir(double valor, Conta c2) {

		if (this.saldo > valor) {

			saldo = saldo - valor;

			c2.saldo = c2.saldo + valor;

		} else {
			System.out.println("Operação inválida, falta de Saldo");
		}

	}

}
