package mainPack;

public class PlacaMae {
	
	String modelo;
	CPU cpu;
	RAM ram;
	
	public PlacaMae(String modelo,CPU cpu,RAM ram) {
		this.modelo=modelo;
		this.cpu=cpu;
		this.ram=ram;
		
		System.out.println("Placa Mãe "+modelo);
	}

}
