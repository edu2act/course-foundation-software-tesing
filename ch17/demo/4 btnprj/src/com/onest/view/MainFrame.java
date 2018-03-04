package com.onest.view;

import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
	JPanel panel=new JPanel();
	JButton btn=new JButton("改变颜色");
	Color colors[]=new Color[]{Color.red,Color.black,Color.blue,Color.yellow,Color.white};
	
	public MainFrame(){
		this.getContentPane().add(panel);
		panel.add(btn);
		btn.addActionListener(new BtnListener(this));
		
		this.setSize(300,300);
		this.setVisible(true);
	}
	
	public void changeColor(){
		panel.setBackground(colors[new Random().nextInt(5)]);
	}

	/**
	 * @desc
	 * @author wangwei
	 * @createDate 2013-7-23
	 * @param args
	 */
	public static void main(String[] args) {
		MainFrame mainFrame=new MainFrame();

	}

}
