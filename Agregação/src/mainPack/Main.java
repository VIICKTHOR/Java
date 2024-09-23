package mainPack;

public class Main {

	public static void main(String[] args) {
		
		CPU c = new CPU("Intel",16);
		RAM r = new RAM("DDR5",32);
		
		PlacaMae p = new PlacaMae("Aorus",c,r);
		
		p.cpu.nucleos+=0;
	}

}
