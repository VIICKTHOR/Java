package um;

public class Circulo implements FormaGeometrica{
	private double raio=0;
	
	public Circulo(double raio) {
		this.raio=raio;
	}
	
	@Override
	public void area() {
		
		System.out.println("O �rea do c�rculo � "+((raio*raio)*Math.PI)+" metros quadrados");
	}

	@Override
	public void comprimento() {
		
		System.out.println("O comprimento do c�rculo � "+(2*(raio*Math.PI))+" metros");
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
}
