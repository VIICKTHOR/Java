package mainPack;

public class Novo extends Imovel{
	private int adicional;
	
	public Novo() {
		
	}
	public Novo(int preço,String endereço,int adicional) {
		super(preço,endereço);
		this.setAdicional(adicional);
		
	}
	public int getAdicional() {
		return adicional;
	}
	public void setAdicional(int adicional) {
		this.adicional = adicional;
	}
	
	@Override
	public void imprime() {
		preço+=adicional;
		System.out.println("Imóvel Novo");
		super.imprime();
	}
}
