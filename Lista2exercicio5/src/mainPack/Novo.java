package mainPack;

public class Novo extends Imovel{
	private int adicional;
	
	public Novo() {
		
	}
	public Novo(int pre�o,String endere�o,int adicional) {
		super(pre�o,endere�o);
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
		pre�o+=adicional;
		System.out.println("Im�vel Novo");
		super.imprime();
	}
}
