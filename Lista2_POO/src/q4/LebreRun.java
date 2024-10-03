package q4;

public class LebreRun extends Thread {
	
	boolean running=true;
	String nome;
	int distanciaCorrida;
	int distanciaTotal;
	int distanciaPulo;
	int pulosFeitos;
	
	static int ranking;
	static String[] rankingGeral = new String[10];
	final static int PULO_MAXIMO = 3;

	public LebreRun(String nome, int distanciaTotal) {
		super(nome);
		this.nome = nome;
		this.distanciaTotal = distanciaTotal;

	}

	public void print() {
		System.out.println(
				"A lebre " + nome + " pulou " + distanciaPulo + "m e j� percorreu " + distanciaCorrida + " metros");
	}

	public void pulando() {
		
		pulosFeitos++;
		distanciaPulo = 1 + ((int) (Math.random() * PULO_MAXIMO));
		if(distanciaPulo>3)distanciaPulo=3;
		distanciaCorrida += distanciaPulo;
	
		if(distanciaCorrida>distanciaTotal) {
			distanciaCorrida=distanciaTotal;
			running = false;
		}
	}
	
	public void dormindo() {
		Thread.yield();
	}
	
	public void rank() {
		rankingGeral[ranking]= nome;
		ranking++;
		System.out.println("-----------------------------------------------\n"
				+ "A lebre "+nome+" ficou em "+ranking+"� colocado com "+pulosFeitos+" pulos!"
						+ "\n-----------------------------------------------");
		
	}
	public static void printRank(){
		System.out.println("1� lugar: "+rankingGeral[0]);
		System.out.println("2� lugar: "+rankingGeral[1]);
		System.out.println("3� lugar: "+rankingGeral[2]);
		System.out.println("4� lugar: "+rankingGeral[3]);
		System.out.println("5� lugar: "+rankingGeral[4]);
	}
	
	@Override
	public void run() {
		while(running) {
			pulando();
			print();
			dormindo();
		}
		rank();
	}
}
