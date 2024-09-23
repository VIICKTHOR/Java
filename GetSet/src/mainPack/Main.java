package mainPack;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		String h,m,s,d;
		h = JOptionPane.showInputDialog(null, "Defina a(s) Hora(s)");
		m = JOptionPane.showInputDialog(null, "Defina o(s) Minuto(s)");
		s = JOptionPane.showInputDialog(null, "Defina os Segundo(s)");
		d = JOptionPane.showInputDialog(null,"Defina a data(dd/mm/aa)");
		
		int hInt,mInt,sInt;
		
		hInt = Integer.parseInt(h);
		mInt = Integer.parseInt(m);
		sInt = Integer.parseInt(s);
		
		Time t = new Time();
		
		t.setTime(hInt, mInt, sInt);
		t.setDate(d);
		
		
		JOptionPane.showMessageDialog(null,"Horário atual = "+t.getTime()+"\nData: "+t.getDate());
		
		

	}

}
