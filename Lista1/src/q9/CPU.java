package q9;

import javax.swing.JOptionPane;

public class CPU {
	private int a,s;
	
	public void calcula(int n) {
		
		a=n-1;
		s=n+1;
		
		JOptionPane.showMessageDialog(null, "Antecessor de "+n+" � igual a "+a+" e o seu sucessor � "+s, "Antecessor e Sucessor", -1);

	}
}
