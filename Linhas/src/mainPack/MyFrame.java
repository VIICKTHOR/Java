package mainPack;

import javax.swing.JFrame;

public class MyFrame extends JFrame {

	MyPanel panel = new MyPanel();

	public MyFrame() {

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(panel);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);

	}
}
