package q9;

public class Main {

	public static void main(String[] args) {
	Entrada e = new Entrada();
	CPU c = new CPU();
	
	int num = e.entrada("Insira um valor para descobrir seu antecessor e sucessor");
	
	c.calcula(num);	
	
	}
}
