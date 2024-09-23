package mainPack;

import javax.swing.JOptionPane;

public class Saida {

	private String s;
	int x;

	public Saida(int x) {
		this.x = x;
	}

	public void prt() {
		s = Integer.toString(x);
		JOptionPane.showMessageDialog(null, "A soma dos primos neste intervalo é:\n " + s, null, -1);
	}
}
