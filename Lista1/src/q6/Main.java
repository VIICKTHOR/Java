package q6;

public class Main {
	public static void main(String[] args) {
		Entrada e = new Entrada();
		CPU p = new CPU();
		
		System.out.println("Iforme o sal�rio");
		double s=e.entrada();//entrada do valor
		
		p.calculo(s); //calculo	
		
		System.out.println("O sal�rio reajustado � de "+p.result()+"R$");
	}
}
