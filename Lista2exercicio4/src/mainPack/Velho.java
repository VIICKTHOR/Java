package mainPack;

public class Velho extends Imovel{
	private int desconto;
	
	public Velho() {
		
	}
	public Velho(int preço,String endereço,int desconto) {
		super(preço,endereço);
		this.setDesconto(desconto);
		
	}
	public int getDesconto() {
		return desconto;
	}
	public void setDesconto(int desconto) {
		this.desconto = desconto;
	}
	
	@Override
	public void imprime() {
		preço-=desconto;
		System.out.println("Imóvel Velho");
		super.imprime();
	}
}
