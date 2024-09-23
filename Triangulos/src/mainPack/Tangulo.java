package mainPack;

public class Tangulo {

	int l1, l2, l3;
	String tipo;

	public Tangulo() {

	}

	public Tangulo(int l1, int l2, int l3) {

		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
	}

	public void calcTipo() {
		
		if(l1==l2 || l1 == l3 || l2==l3)
			tipo="Isósceles";
		if(l1 == l2 && l2 == l3)
			tipo="Equilátero";
		if(l1 != l2 && l2 != l3 )
			tipo="Escaleno";
		
	}
}
