package mainPack;

public class CamaroteSuperior extends VIP{
	private String localizacao="Area A - Parque de Exposi��es X, XXXXXX-XX";
	private int valorX=65;
	
	public CamaroteSuperior() {
		valor+=valorX;
	}
	@Override
	public void imprimeValor() {
		System.out.println("Ingresso VIP - Camarote Superior");
		super.imprimeValor();
	}

}
