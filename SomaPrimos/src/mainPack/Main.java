package mainPack;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "somará se todos os primos dentro do intervalo escolhidos",
				"Somador Primos", -1);

		Entrada e = new Entrada();

		e.in();

		Processamento p = new Processamento(e.numIni, e.numFinal);

		p.mat();

		Saida s = new Saida(p.soma);

		s.prt();

	}

}
