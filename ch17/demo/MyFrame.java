package cn;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame{
	int x,y;
	JPanel panel = null;
	public MyFrame(){
		panel = new JPanel();
		panel.addMouseListener(new MyMouse1(this));
		panel.addMouseMotionListener(new MyMouse2(this));
		this.getContentPane().add(panel);
		
		this.setSize(500, 500);
		this.setVisible(true);
	}
	
	public void drawLine(int x1,int y1,int x2,int y2) {
		Graphics g = panel.getGraphics();
		g.drawLine(x1, y1, x2, y2);
	}
}
