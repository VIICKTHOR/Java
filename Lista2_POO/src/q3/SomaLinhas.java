package q3;

public class SomaLinhas implements Runnable{
	int[] linhaMatriz;
	public SomaLinhas(int[] linhaMatriz) {
		this.linhaMatriz=linhaMatriz;
	}

	@Override
	public void run() {
		int soma=0;
		for(int i=0; i<linhaMatriz.length;i++) {
			
			soma+=linhaMatriz[i];
		}
		
		System.out.println(soma);
	}

}
