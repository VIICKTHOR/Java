package mainPack;

public class Main {

	public static void main(String[] args) {
			
		Tangulo tEscaleno = new Tangulo(1,2,3);
		Tangulo tIsosceles = new Tangulo(2,2,3);
		Tangulo tEquilatero = new Tangulo(3,3,3);
		
		tEscaleno.calcTipo();
		tIsosceles.calcTipo();
		tEquilatero.calcTipo();
		
		System.out.println("O primeiro triângulo é "+tEscaleno.tipo);
		System.out.println("O segundo triângulo é "+tIsosceles.tipo);
		System.out.println("O terceiro triângulo é "+tEquilatero.tipo);
		

	}

}
