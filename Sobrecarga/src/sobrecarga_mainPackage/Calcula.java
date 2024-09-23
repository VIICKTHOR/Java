package sobrecarga_mainPackage;

public class Calcula {

	int num1, num2;

	public Calcula() {
	}

	public Calcula(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public int calcular(int a, int b) {
		int soma = a + b;
		return soma;
	}

	public double calcular(double a, double b) {
		double soma = a + b;
		return soma;
	}

	public String calcular(String a, String b) {
		String palavra = a + b;
		return palavra;
	}

}
