package mainPack;

public class CamaroteInferior extends VIP{
	private String localizacao="Area B - Parque de Exposi��es X, XXXXXX-XX";
	
	public String getLocalizacao(){
		return localizacao;
	}
	private void imprimeLoc() {
		System.out.println("A localiza��o do seu Ingresso �: "+localizacao);
	}
	@Override
	public void imprimeValor() {
		System.out.println("Ingresso VIP - Camarote Inferior");
		imprimeLoc();
		super.imprimeValor();
	}

}
