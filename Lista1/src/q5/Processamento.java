package q5;

public class Processamento {
	private int a,b,aux,r;
	
	public void calcular(int a,int b) {
		this.a=a;
		this.b=b;

		if(b>a) {
			aux=a;
			a=b;
			b=aux;
		}
		r=a-b;
			
	}
	public int getResultado() {
		return r;
	}
	public int getMaior() {
		return a;
	}
	public int getMenor() {
		return b;
	}
}
