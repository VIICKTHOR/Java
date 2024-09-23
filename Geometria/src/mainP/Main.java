package mainP;

public class Main {

	public static void main(String[] args) {

		FiguraGeometrica quadrado = new FiguraGeometrica(5);

		FiguraGeometrica retangulo = new FiguraGeometrica(4, 8);

		FiguraGeometrica triangulo = new FiguraGeometrica(4, 4, 2);

		System.out.println("Per�metro do quadrado �: " + quadrado.calcPerimetro());
		System.out.println("Area do quadrado �: " + quadrado.calcArea());
		System.out.println("");
		System.out.println("Per�metro do ret�ngulo �: " + retangulo.calcPerimetro());
		System.out.println("Area do ret�ngulo �: " + retangulo.calcArea());
		System.out.println("");
		System.out.println("Per�metro do tri�ngulo �: " + triangulo.calcPerimetro());
		System.out.println("Area do tri�ngulo �: " + triangulo.calcArea());
	}
}
