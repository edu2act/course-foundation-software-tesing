package cn;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyMouse1 implements MouseListener {

	MyFrame myFrame = null;
	public MyMouse1(MyFrame myFrame){
		this.myFrame = myFrame;
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		myFrame.x = e.getX();
		myFrame.y = e.getY();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
