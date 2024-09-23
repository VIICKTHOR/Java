package mainPack;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyPanel extends JPanel implements ActionListener {


	final int largura = 1000;
	final int altura = 750;
	final int meiox = largura / 2;
	final int meioy = altura / 2;
	
	Point[] p= new Point[4];
	
	int xv = 2;
	int yv = 2;

	public MyPanel() {
		
		p[0]=new Point(meiox-30,meioy-30);
		p[1]=new Point(meiox-30,meioy+30);
		p[2]=new Point(meiox+30,meioy-30);
		p[0]=new Point(meiox+30,meioy+30);

		Timer temp = new Timer(1000 / 144, this);
		temp.start();

		this.setPreferredSize(new Dimension(largura, altura));

	}
	public void line(Graphics2D d, Point a,Point b) {
		d.drawLine(a.x, a.y, b.x, b.y);
	}

	public void paint(Graphics g) {
		super.paint(g);

		Graphics2D g2d = (Graphics2D) g;

		g2d.setStroke(new BasicStroke(5));

		line(g2d,p[0],p[1]);
		line(g2d,p[1],p[2]);
		line(g2d,p[2],p[3]);
		line(g2d,p[3],p[0]);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		/*if(p[3].x<0) xv*=-1; if(p[3].x>largura) xv*=-1;
		if(p[1].x<0) xv*=-1; if(p[1].x>largura-20) xv*=-1;
		
		if(p[0].y<0) yv*=-1; if(p[0].y>altura) yv*=-1;
		if(p[1].y<0) xv*=-1; if(p[1].y>altura-20) xv*=-1;
		
		p[0].x=p[0].x-xv;
		p[1].x=p[1].x+xv;
		p[0].y=p[0].y-yv;
		p[1].y=p[1].y+yv;*/

		repaint();
	}
}
