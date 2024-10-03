package q9;

public class F1 extends Thread {

	private String nome;
	private int voltas;
	public static int colocacao;
	public static String[] rank = new String[2];

	public F1(String nome, final int voltas) {
		super(nome);
		this.nome = nome;
		this.voltas = voltas;
	}

	@Override
	public void run() {

		for (int i = 0; i < voltas; i++) {
			
			try {
				Thread.sleep((int)(Math.random()*1000));
				System.out.println(nome+" finalizou a volta "+(i+1));
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		rank[colocacao]= nome;
		colocacao++;

	}
	
	public static void print(){
		System.out.println("\nA corrida acabou!\n1º - "+rank[0]+"\n2º - "+rank[1]);
	}
}
