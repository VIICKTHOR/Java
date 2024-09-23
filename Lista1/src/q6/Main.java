package q6;

public class Main {
	public static void main(String[] args) {
		Entrada e = new Entrada();
		CPU p = new CPU();
		
		System.out.println("Iforme o salário");
		double s=e.entrada();//entrada do valor
		
		p.calculo(s); //calculo	
		
		System.out.println("O salário reajustado é de "+p.result()+"R$");
	}
}
