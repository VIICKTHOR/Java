package q8;

public class Main {

	public static void main(String[] args) {
		Entrada e = new Entrada();
		CPU c = new CPU();
		
		System.out.println("Informe o Sal�rio");
		double sal= e.entrada();
		
		System.out.println("Isso corresponde a "+c.calcula(sal)+" sal�rios m�nimos");
		
	}
}
