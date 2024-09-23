package mainPack;

public class CarroPasseio extends Veiculo {

	private String cor, modelo;
	private Motor motor = new Motor();

	public CarroPasseio() {

	}
	public CarroPasseio(int peso,int velocMax,float preço, String cor,String modelo,Motor motor) {
		super(peso,velocMax,preço);
		this.cor=cor;
		this.modelo=modelo;
		this.motor=motor;
	}
	
	public void set(String cor,String modelo,Motor motor) {
		this.cor=cor;
		this.modelo=modelo;
		this.motor=motor;
	}
	public void print() {
		System.out.println("Cor: "+cor+" Modelo: "+modelo);
	}

}

