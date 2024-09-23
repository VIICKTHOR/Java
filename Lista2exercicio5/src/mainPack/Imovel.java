package mainPack;

public class Imovel {
	protected int preço;
	private String endereço;
	
	public Imovel() {
		
	}
	public Imovel(int preço, String endereço) {
		
	}
	
	public int getPreço() {
		return preço;
	}
	public void setPreço(int preço) {
		this.preço = preço;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	
	public void imprime(){
		System.out.println("Endereço: "+endereço+"\nPreço: "+preço);
	}
}
