package mainPack;

public class Imovel {
	protected int pre�o;
	private String endere�o;
	
	public Imovel() {
		
	}
	public Imovel(int pre�o, String endere�o) {
		
	}
	
	public int getPre�o() {
		return pre�o;
	}
	public void setPre�o(int pre�o) {
		this.pre�o = pre�o;
	}
	public String getEndere�o() {
		return endere�o;
	}
	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}
	
	public void imprime(){
		System.out.println("Endere�o: "+endere�o+"\nPre�o: "+pre�o);
	}
}
