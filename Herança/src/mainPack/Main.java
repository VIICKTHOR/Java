package mainPack;

public class Main {

	public static void main(String[] args) {
		
		Rectangulo r = new Rectangulo(5.3f, 3.2f);
        System.out.println("�rea do Ret�ngulo: " + r.calcularArea());
        System.out.println("Per�metro do Ret�ngulo: " + r.calcularPerimetro());


        Circulo c = new Circulo(4.5f);
        System.out.println("�rea do C�rculo: " + c.calcularArea());
        System.out.println("Per�metro do C�rculo: " + c.calcularPerimetro());


        Quadrado q = new Quadrado(4.0f);
        System.out.println("�rea do Quadrado: " + q.calcularArea());
        System.out.println("Per�metro do Quadrado: " + q.calcularPerimetro());

	}

}
