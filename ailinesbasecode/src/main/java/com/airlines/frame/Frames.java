package com.airlines.frame;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Frames {
public void show(){
	JFrame frame= new JFrame("Swing Aplication");
	JLabel imageLabel=new JLabel(new ImageIcon(this.getClass().getResource("/images/download1.jpg")));
	imageLabel.setSize(500,150);
	imageLabel.setLocation(0,0);
	JLabel userLabel=new JLabel("Username");
	userLabel.setSize(500,450);
	userLabel.setLocation(100,0);
	JLabel passLabel=new JLabel("Password");
	passLabel.setSize(500,550);
	passLabel.setLocation(100,0);
	frame.setLayout(null);
	frame.setSize(500, 500);
	frame.setLocationRelativeTo(null);
	frame.setResizable(false);
	frame.add(imageLabel);
	frame.add(userLabel);
	frame.add(passLabel);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);	
}


}
