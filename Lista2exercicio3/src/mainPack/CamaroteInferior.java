package mainPack;

public class CamaroteInferior extends VIP{
	private String localizacao="Area B - Parque de Exposições X, XXXXXX-XX";
	
	public String getLocalizacao(){
		return localizacao;
	}
	private void imprimeLoc() {
		System.out.println("A localização do seu Ingresso é: "+localizacao);
	}
	@Override
	public void imprimeValor() {
		System.out.println("Ingresso VIP - Camarote Inferior");
		imprimeLoc();
		super.imprimeValor();
	}

}
