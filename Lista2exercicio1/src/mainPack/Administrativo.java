package mainPack;

public class Administrativo extends Assistente{
	private char turno;
	private int bonusNoturno;
	
	public Administrativo() {
		// TODO Auto-generated constructor stub
	}
	public Administrativo(String nome,int matricula, char turno) {
		super(nome,matricula);
		this.turno=turno;
	}
	
	public void setTurno(char turno) {
		this.turno=turno;
	}
	public void setbonusNoturno(int bonusNoturno) {
		this.bonusNoturno=bonusNoturno;
	}
	
	public char getTurno() {
		return turno;
	}
	public int getbonusNoturno() {
		return bonusNoturno;
	}
	@Override
	void exibeDados() {
		// TODO Auto-generated method stub
		System.out.println("Administrativo");
		super.exibeDados();
		if(turno=='N'||turno=='n') {
			System.out.println("Turno Noturno, Bonus: "+bonusNoturno);
		}else if(turno=='D'||turno=='d') {
			System.out.println("Turno Diurno, sem Bonus");
		}else{
			System.out.println("Turno informado incorreto (D para diurno e N para noturno)");
		}
		
	}
}
