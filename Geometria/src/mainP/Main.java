package mainP;

public class Main {

	public static void main(String[] args) {

		FiguraGeometrica quadrado = new FiguraGeometrica(5);

		FiguraGeometrica retangulo = new FiguraGeometrica(4, 8);

		FiguraGeometrica triangulo = new FiguraGeometrica(4, 4, 2);

		System.out.println("Perímetro do quadrado é: " + quadrado.calcPerimetro());
		System.out.println("Area do quadrado é: " + quadrado.calcArea());
		System.out.println("");
		System.out.println("Perímetro do retângulo é: " + retangulo.calcPerimetro());
		System.out.println("Area do retângulo é: " + retangulo.calcArea());
		System.out.println("");
		System.out.println("Perímetro do triângulo é: " + triangulo.calcPerimetro());
		System.out.println("Area do triângulo é: " + triangulo.calcArea());
	}
}
