package com.onest.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class BtnListener implements ActionListener {
	LoginFrame loginFrame;
	public BtnListener(LoginFrame loginFrame){
		this.loginFrame=loginFrame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("登录")){
			loginFrame.login();
		}else if(e.getActionCommand().equals("取消")){
			loginFrame.exit();
		}

	}

}
