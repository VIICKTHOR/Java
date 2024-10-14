package mainPack;

public class Memoria {

	private static final int[] memoria = new int[10];
	private static int itensMemoria = 0;
	private static int posEntrada = 0;
	private static int posSaida = 0;

	public static synchronized void produzir(int dado) throws InterruptedException {

		while (itensMemoria == memoria.length) {

			System.out.println("Memória cheia! Produtor ocioso...z...z...z...");
			Memoria.class.wait(); // para ate tiver espaço
		}

		memoria[posEntrada] = dado;
		System.out.println("Produtor produziu: " + dado);

		posEntrada = (posEntrada + 1) % memoria.length; // divide a posição da memoria pelo tamanho max pegando o resto,
														// ou seja quando chegar no maximo o resto assume 0 e a memoria
														// reinicia
		itensMemoria++;

		Memoria.class.notifyAll(); // acorda os consumidores
	}

	public static synchronized int consumir() throws InterruptedException {

		while (itensMemoria == 0) {

			System.out.println("Memória Vazia! Consumidor ocioso...z...z...z...");
			Memoria.class.wait();
		}

		int dadoRemovido = memoria[posSaida];
		System.out.println("Consumidor consumiu: " + dadoRemovido);

		posSaida = (posSaida + 1) % memoria.length; // o mesmo que acontece em cima
		
		itensMemoria--;
		
		Memoria.class.notifyAll(); //acorda os produtores;
		return dadoRemovido;
	}
}
