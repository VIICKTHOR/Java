package mainPack;

import javax.swing.JOptionPane;

public class Entrada {

	String iNt;
	int numIni = 0;
	int numFinal = 0;

	public void in() {

		iNt = JOptionPane.showInputDialog(null, "Qual o valor inteiro m�nimo", ":D", 3);

		numIni = Integer.parseInt(iNt);

		iNt = JOptionPane.showInputDialog(null, "Qual o valor inteiro m�ximo", ":D", 3);

		numFinal = Integer.parseInt(iNt);
	}

}