package com.onest.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrame extends JFrame {
	
	public LoginFrame(){
		super("登录");
		
		//添加面板
		JPanel loginPanel=new JPanel();
//		loginPanel.setBackground(Color.BLUE);
		//流水布局
//		loginPanel.setLayout(new FlowLayout(FlowLayout.RIGHT, 20, 20));
		//边框布局
//		loginPanel.setLayout(new BorderLayout());
		//表格布局
//		loginPanel.setLayout(new GridLayout(3, 2));
		loginPanel.setLayout(null);
		this.getContentPane().add(loginPanel);
		
		//添加Label、text、button
		JLabel lblName=new JLabel("用户名：");
		lblName.setBounds(10, 10, 120, 25);
		JLabel lblPwd=new JLabel("密码：");
		lblPwd.setBounds(10, 40, 120, 25);
		
		JTextField txtName=new JTextField();
		txtName.setBounds(140, 10, 120, 25);
		JPasswordField txtPwd=new JPasswordField("123");
		txtPwd.setBounds(140, 40 ,120, 25);
		
		JButton btnLogin=new JButton("登录");
		btnLogin.setBounds(20,80,120,25);
		JButton btnCancle=new JButton("取消");
		btnCancle.setBounds(150, 80, 120, 25);
		//将组件添加到面板
		loginPanel.add(lblName);
		loginPanel.add(lblPwd);
		loginPanel.add(txtName);
		loginPanel.add(txtPwd);
		loginPanel.add(btnLogin);
		loginPanel.add(btnCancle);
		
		this.setSize(300, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	/**
	 * @desc
	 * @author wangwei
	 * @createDate 2013-7-23
	 * @param args
	 */
	public static void main(String[] args) {
		LoginFrame loginFrame=new LoginFrame();
		

	}

}
