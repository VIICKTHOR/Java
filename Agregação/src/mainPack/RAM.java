package mainPack;

public class RAM {
	
	String tipo;
	int quantidade;
	
	public RAM(String tipo, int quantidade) {
		this.tipo=tipo;
		this.quantidade=quantidade;
		
		System.out.println("M�moria RAM Tipo: "+tipo+" Quantidade: "+quantidade+" GB");
	}

}
