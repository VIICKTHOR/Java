package um;

public class Main {
	public static void main(String[] args) {
		
		FormaGeometrica c = new Circulo(5.0);
		FormaGeometrica q = new Quadrado(4.0);
		
		c.area();
		c.comprimento();
		System.out.println(" ");
		q.area();
		q.comprimento();
	}
}
