package main_Pack;

public class Main {

	public static void main(String[] args) {

		Conta minha_conta = new Conta();
		Conta conta_pedro = new Conta();

		minha_conta.saldo = 5000.0;
		minha_conta.nome = "Victor";

		conta_pedro.nome = "Pedro";
		conta_pedro.saldo = 1.0;

		System.out.println("A conta no nome de " + minha_conta.nome + " possui um saldo de: " + minha_conta.saldo);

		System.out.println("A conta no nome de " + conta_pedro.nome + " possui um saldo de: " + conta_pedro.saldo);

		minha_conta.tranferir(9000.9, conta_pedro);
		System.out.println("\napós operação\n");

		System.out.println("A conta no nome de " + minha_conta.nome + " possui um saldo de: " + minha_conta.saldo);

		System.out.println("A conta no nome de " + conta_pedro.nome + " possui um saldo de: " + conta_pedro.saldo);

	}

}
