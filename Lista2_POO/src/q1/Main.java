package q1;

public class Main {
	public static void main(String[] args) {

		int x;
		int contLivro = 0;
		int contPeriodico = 0;
		Publicacao[] biblioteca = new Publicacao[1000];

		for (int i = 0; i < 1000; i++) {
			x = ((int) (Math.random() * 100000)) % 2; // gera um numero entre 0 e 1

			if (x == 0) {

				biblioteca[i] = new Livro("Livro " + (contLivro + 1), i);
				contLivro++;
			} else if (x == 1) {

				biblioteca[i] = new Periodico("Periodico " + (contPeriodico + 1), i, (contPeriodico + 1), ((int)(Math.random()*25)));
				contPeriodico++;
			}
		}
		
		for(int i=0;i<biblioteca.length;i++) { //ler todos os catalogados
			
		biblioteca[i].ler();
		}
		System.out.println("");
		
		for(int i=0; i<10;i++) {
			
			if(biblioteca[i] instanceof Livro) { // le e empresta e devolve caso seja livro e le e compra caso seja periodico
				
				((Livro)biblioteca[i]).emprestar();
				((Livro)biblioteca[i]).ler();
				((Livro)biblioteca[i]).devolver();
				((Livro)biblioteca[i]).ler();
				System.out.println("");
				
			}
			else if(biblioteca[i] instanceof Periodico){
				
				((Periodico)biblioteca[i]).ler();
				((Periodico)biblioteca[i]).venda(20);
				System.out.println("");
			}
		}
	}
}
