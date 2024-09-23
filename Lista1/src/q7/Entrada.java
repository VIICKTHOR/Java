package q7;

import javax.swing.JOptionPane;

public class Entrada {
	private double n;
	private String s;

	public double entrada(String s) {
		s = JOptionPane.showInputDialog(s);
		n = Double.parseDouble(s);
		return n;
	}

	public void saida(double x) {
		JOptionPane.showMessageDialog(null, "Total a ser pago: " + x + "R$", "Imposto calculado", -1);
	}
}
