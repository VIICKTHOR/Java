package mainPack;

public class Motor {
	
	private int numCilindro,potencia;

	public Motor() {
		
	}
	public Motor(int numCilindro,int potencia) {
		this.numCilindro=numCilindro;
		this.potencia=potencia;
	}
	
	public void set(int num,int pot) {
		numCilindro=num;
		potencia=pot;	
	}
	
	public void print() {
		System.out.println("Cilindros: "+numCilindro+" Potencia: "+potencia);
	}

}
