package mainPack;

public class CPU {
	
	String marca;
	int nucleos;
	
	public CPU(String marca, int nucleos) {
		this.marca=marca;
		this.nucleos=nucleos;
		
		System.out.println("Processador da "+marca+" de "+nucleos+" núcleos");
	}

}
