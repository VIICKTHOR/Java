package q1;

public class Periodico extends Publicacao {
	private int numVolume, preco;
	
	public Periodico() {
		
	}
	public Periodico(String titulo, int numeroCatalogo, int numVolume, int preco) {
		super(titulo, numeroCatalogo);
		this.numVolume=numVolume;
		this.preco=preco;	
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	public int getNumVolume() {
		return numVolume;
	}

	public void setNumVolume(int numVolume) {
		this.numVolume = numVolume;
	}

	@Override
	public void ler() {
		System.out.println("O leitor est� lendo o peri�dico " + titulo);
	}

	public int venda(int pagamento) {
		int troco=0;
		if(pagamento>=preco) {
			troco = pagamento - preco;
			System.out.println("Obrigado pela compra!, seu troco � "+troco);
		}else {
			System.out.println("O dinheiro nao � o suficiente para comprar o peri�dico");
			return -1;
		}
		return troco;
	}
}
