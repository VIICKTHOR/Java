package main;

import javax.swing.JFrame;

public class MyFrame extends JFrame {

	MyFrame() {

		// this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setFocusable(true);
		this.pack();

		this.setVisible(true);
		this.setBounds((int) (Math.random() * 1000000) % 1400, (int) (Math.random() * 1000000) % 700, 500, 500);

	}

}
