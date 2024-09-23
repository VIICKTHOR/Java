package q5;

public class Main {

	public static void main(String[] args) {
		Entrada e = new Entrada();
		Processamento p = new Processamento();
	
		System.out.println("Escreva dois valores de 0 a 1000");
		System.out.println("Valor 1:");
		int num1 = e.entrada();
		System.out.println("Valor 2:");
		int num2 = e.entrada();
		
		p.calcular(num1, num2);
		
		System.out.println("O maior valor é o "+p.getMaior()+" e o menor valor é o "+p.getMenor()+" e a diferença entre eles é de "+p.getResultado());

	}

}
