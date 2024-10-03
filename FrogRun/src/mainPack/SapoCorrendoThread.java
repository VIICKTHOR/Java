package mainPack;

public class SapoCorrendoThread extends Thread {
	String nome;
	int distanciaCorrida = 0;
	int distanciaTotalCorrida;
	int pulo = 0;
	int pulos = 0;
	static int colocacao = 0;
	final static int PULO_MAXIMO = 50;

	public SapoCorrendoThread(String nome, int distanciaTotalCorrida) {
		super(nome);
		this.nome=nome;
		this.distanciaTotalCorrida = distanciaTotalCorrida;
	}

	public void sapoImprimindoSituacao() {
		System.out.println("O " + nome + " pulou " + pulo + "cm\t" + " e já percorreu " + distanciaCorrida + "cm");
	}

	public void sapoPulando() {
		pulos++;
		pulo = (int) (Math.random() * PULO_MAXIMO);
		distanciaCorrida += pulo;

		if (distanciaCorrida > distanciaTotalCorrida) {
			distanciaCorrida = distanciaTotalCorrida;
		}
	}

	public void sapoDescansando() {
		Thread.yield();
	}

	public void colocacaoSapo() {
		colocacao++;
		System.out.println(nome + " foi o " + colocacao + "º colocado com " + pulos + " pulos");
	}
	
	@Override
	public void run() {
		while (distanciaCorrida < distanciaTotalCorrida) {
			sapoPulando();
			sapoImprimindoSituacao();
			sapoDescansando();
		}
		colocacaoSapo();
	}
}
