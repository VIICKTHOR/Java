package mainPack;

public class Rectangulo extends Forma {
	
	private float lado;
	private float altura;


	public Rectangulo(float lado, float altura) {
		this.lado = lado;
		this.altura = altura;
	}

	
	public float calcularArea() {
		return lado * altura;
	}

	
	public float calcularPerimetro() {
		return 2 * (lado + altura);
	}

	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
}
