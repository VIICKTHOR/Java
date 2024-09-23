package mainPack;

public class Tecnico extends Assistente{
	
	private int bonus;
	
	public Tecnico() {
		// TODO Auto-generated constructor stub
	}
	public Tecnico(String nome,int matricula, int bonus) {
		super(nome,matricula);
		this.bonus=bonus;
	}
	
	public void setBonus(int bonus) {
		this.bonus=bonus;
	}
	
	public int getBonus() {
		return bonus;
	}
	@Override
	void exibeDados() {
		// TODO Auto-generated method stub
		System.out.println("Técnico");
		super.exibeDados();
		System.out.println("Bonus: "+bonus);
	}
}
