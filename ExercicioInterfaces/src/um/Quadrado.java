package um;

public class Quadrado implements FormaGeometrica{
	private double lado=0;
	
	public Quadrado(double lado) {
		this.lado=lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	@Override
	public void area() {
		
		System.out.println("A �rea do quadrado � "+(lado*lado)+" metros quadrados");
	}

	@Override
	public void comprimento() {

		System.out.println("O comprimento do quadrado � "+(lado*4)+" metros");
	}
}
