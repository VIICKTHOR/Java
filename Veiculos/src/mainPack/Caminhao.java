package mainPack;

public class Caminhao extends Veiculo{
	
	private int cargaMax,alturaMax,comprimento;
	private Motor motor = new Motor();

	public Caminhao() {

	}
	public Caminhao(int peso,int velocMax,float preço, int cargaMax,int alturaMax,int comprimento) {
		super(peso,velocMax,preço);
		this.cargaMax=cargaMax;
		this.alturaMax=alturaMax;
		this.comprimento=comprimento;
	}
	
	public void set(int cargaMax,int alturaMax,int comprimento) {
		this.cargaMax=cargaMax;
		this.alturaMax=alturaMax;
		this.comprimento=comprimento;
	}
	public void print() {
		System.out.println("Carga Máxima: "+cargaMax+"Kg Altura Máxima: "+alturaMax+"m Comprimento: "+comprimento+"m");
	}

}
