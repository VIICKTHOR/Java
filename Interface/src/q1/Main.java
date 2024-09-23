package q1;

public class Main {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(1000);
		ContaPoupanca cp = new ContaPoupanca(1000);
		
		System.out.println("\nConta Corrente: "+cc.getSaldo()+"R$\nConta Poupan�a: "+cp.getSaldo()+"R$");
		
		cc.depositar(100);
		cp.sacar(200);
		
		System.out.println("\nConta Corrente: "+cc.getSaldo()+"R$\nConta Poupan�a: "+cp.getSaldo()+"R$");
		
		cc.sacar(500);
		cp.depositar(600);
		
		System.out.println("\nConta Corrente: "+cc.getSaldo()+"R$\nConta Poupan�a: "+cp.getSaldo()+"R$");
	}
}
