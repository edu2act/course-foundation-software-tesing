package com.onest.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BtnListener implements ActionListener {
	MainFrame frame=null;
	public BtnListener(MainFrame frame){
		this.frame=frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame.changeColor();

	}

}
