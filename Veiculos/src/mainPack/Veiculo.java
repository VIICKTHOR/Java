package mainPack;

public class Veiculo {
	
	private int peso,velocMax;
	private float preço;
	
	public Veiculo() {
		
	}
	public Veiculo(int peso,int velocMax, float preço) {
		this.peso=peso;
		this.velocMax=velocMax;
		this.preço=preço;
	}
	
	public void set(int peso,int velocMax, float preço) {
		this.peso=peso;
		this.velocMax=velocMax;
		this.preço=preço;
		
	}
	
	public void print() {
		System.out.println("Peso: "+peso+"Kg Velocidade Máxima: "+velocMax+"Km/h Preço: "+preço+"R$");
	}

}
