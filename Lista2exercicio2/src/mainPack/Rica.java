package mainPack;

public class Rica extends Pessoa{
	private double dinheiro;
		
	public Rica(){
		
	}
	
	public void fazCompras() {
		dinheiro*=0.7;
		System.out.println(nome+" est� gastando seu dinheiro fazendo compras");
	}
}
