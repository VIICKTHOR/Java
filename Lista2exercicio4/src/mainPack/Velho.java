package mainPack;

public class Velho extends Imovel{
	private int desconto;
	
	public Velho() {
		
	}
	public Velho(int pre�o,String endere�o,int desconto) {
		super(pre�o,endere�o);
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
		pre�o-=desconto;
		System.out.println("Im�vel Velho");
		super.imprime();
	}
}
