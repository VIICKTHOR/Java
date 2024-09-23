package q2;

public class TesteException {

	public static void main(String[] args) {
		System.out.println("In�cio do main");
		metodo1();
		System.out.println("Fim do main");
	}

	static void metodo1() {
		System.out.println("In�cio do m�todo1");
		metodo2();
		System.out.println("Fim do m�todo1");
	}

	static void metodo2() {
		System.out.println("In�cio do m�todo2");
		try{
			int[] array = new int[10];
			for(int i=0;i<15;i++) {
				array[i]=i;
				System.out.println(i+1);
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Vetor j� completo!!!");
		}
		
		System.out.println("Fim do m�todo2");
	}
}
