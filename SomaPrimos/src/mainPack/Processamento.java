package mainPack;

public class Processamento {

	int ni, nf, soma;

	public Processamento(int numi, int numf) {

		ni = numi;
		nf = numf;
	}

	public void mat() {

		soma = 0;
		for (int i = ni; i <= nf; i++) {

			if (primo(i))
				soma = soma + i;

		}
	}

	private boolean primo(int n) {

		if (n <= 1)
			return false;

		for (int i = 2; i <= Math.sqrt(n); i++) {

			if (n % i == 0)
				return false;
		}

		return true;
	}
}
