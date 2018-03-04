package cn;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MyMouse2 implements MouseMotionListener {
	MyFrame myFrame = null;
	public MyMouse2(MyFrame myFrame){
		this.myFrame = myFrame;
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		myFrame.drawLine(myFrame.x, myFrame.y,e.getX(), e.getY());
		myFrame.x = e.getX();
		myFrame.y = e.getY();

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
	}

}
