package q9;

import javax.swing.JOptionPane;

public class Entrada {
	private int n;
	private String s;
	
	
	public int entrada(String s) {
		s = JOptionPane.showInputDialog(s);
		n = Integer.parseInt(s); 
		return n;
	}
}
