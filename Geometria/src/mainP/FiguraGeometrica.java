package mainP;

import static java.lang.Math.sqrt;

public class FiguraGeometrica {
	int lado, lado2, altura, base;

	public FiguraGeometrica() {

	}

	public FiguraGeometrica(int lado) {
		this.lado = lado;
	}

	public FiguraGeometrica(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}

	public FiguraGeometrica(int base, int lado, int lado2) {
		this.base = base;
		this.lado = lado;
		this.lado2 = lado2;
	}

	public int calcPerimetro() {

		if (lado2 == 0 && altura == 0 && base == 0) {
			return lado * 4;
		} else if (lado == 0 && lado2 == 0) {
			return (base + altura) * 2;
		}
		return base + lado + lado2;

	}

	public double calcArea() {

		if (lado2 == 0 && altura == 0 && base == 0) {
			return lado * lado;
		} else if (lado == 0 && lado2 == 0) {
			return base * altura;
		}

		double p, area;
		p = (base + lado + lado2) / 2;
		area = sqrt(p * (p - base) * (p - lado) * (p - lado2));
		return area;

	}
}
