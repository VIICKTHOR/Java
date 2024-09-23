package mainPack;

public class Main {

	public static void main(String[] args) {
		
		Rectangulo r = new Rectangulo(5.3f, 3.2f);
        System.out.println("Área do Retângulo: " + r.calcularArea());
        System.out.println("Perímetro do Retângulo: " + r.calcularPerimetro());


        Circulo c = new Circulo(4.5f);
        System.out.println("Área do Círculo: " + c.calcularArea());
        System.out.println("Perímetro do Círculo: " + c.calcularPerimetro());


        Quadrado q = new Quadrado(4.0f);
        System.out.println("Área do Quadrado: " + q.calcularArea());
        System.out.println("Perímetro do Quadrado: " + q.calcularPerimetro());

	}

}
