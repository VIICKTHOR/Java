package mainPack;

public class Veiculo {
	
	private int peso,velocMax;
	private float pre�o;
	
	public Veiculo() {
		
	}
	public Veiculo(int peso,int velocMax, float pre�o) {
		this.peso=peso;
		this.velocMax=velocMax;
		this.pre�o=pre�o;
	}
	
	public void set(int peso,int velocMax, float pre�o) {
		this.peso=peso;
		this.velocMax=velocMax;
		this.pre�o=pre�o;
		
	}
	
	public void print() {
		System.out.println("Peso: "+peso+"Kg Velocidade M�xima: "+velocMax+"Km/h Pre�o: "+pre�o+"R$");
	}

}
