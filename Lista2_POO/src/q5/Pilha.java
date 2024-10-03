package q5;

public class Pilha {
	private int[] elements;
	private int topo;

	public Pilha(int capacidade) {
		this.elements = new int[capacidade];
		this.topo = -1;
	}

	public void push(int elementoAdd) throws PilhaCheia {
		if (topo == elements.length - 1) {
			throw new PilhaCheia();
		}

		elements[++topo] = elementoAdd;
	}

	public int pop() throws PilhaVazia {
		if (topo == -1) {
			throw new PilhaVazia();
		}
		return elements[topo--];
	}

	public boolean isEmpty() {
		return topo == -1;
	}

	public boolean isFull() {
		return topo==elements.length-1;
	}
}
