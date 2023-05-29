package gui;
import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.ImageIcon;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame();	//creates a frame
		frame.setTitle("The Best");// set the title
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//allows the jframe to close
		frame.setResizable(false);// prevent resizing
		frame.setSize(420,420);// sets the x and y dimensions
		frame.setVisible(true);//makes it visible
		
		
		ImageIcon image = new ImageIcon("boy_down_1.png");// creates icon
		frame.setIconImage(image.getImage());//change icon of frame
		frame.getContentPane().setBackground(new Color(0x123456));
		
	}

}
