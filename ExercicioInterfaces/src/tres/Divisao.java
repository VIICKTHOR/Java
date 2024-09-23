package tres;

public class Divisao implements OperacaoMatematica{
	public Divisao() {
		
	}

	@Override
	public int calcula(int a, int b) {
		double r =a/b;
		return (int)r;
	}
}
