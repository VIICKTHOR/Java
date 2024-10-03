package q5;

public class Main {
	public static void main(String[] args) {
		
		Pilha p = new Pilha(5);
		
		try {
            System.out.println("Adicionando elementos na pilha:");
            
            p.push(1);
            p.push(2);
            p.push(3);
            p.push(4);
            p.push(5);

            System.out.println("Tentando adicionar mais um elemento...");
            p.push(6);

        } catch (PilhaCheia e) {
            System.out.println(e.getMessage());
        }
		
		try {
            System.out.println("Removendo elementos da pilha:");
            
            System.out.println("Elemento removido: " + p.pop());
            System.out.println("Elemento removido: " + p.pop());
            System.out.println("Elemento removido: " + p.pop());
            System.out.println("Elemento removido: " + p.pop());
            System.out.println("Elemento removido: " + p.pop());


            System.out.println("Tentando remover mais um elemento...");
            p.pop();

        } catch (PilhaVazia e) {
            System.out.println(e.getMessage());
        }
	}
}
