package com.java.test;
import java.awt.Color;

import javax.swing.*;
import javax.swing.text.IconView;

public class SimpleGui1 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JButton button = new JButton("Click me.");
		JButton button2 = new JButton("Speak name");
		
		button.setSize(10, 5);
		button.setBackground(Color.CYAN);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(button,0);
		frame.add(button2,1);
		frame.setSize(300, 300);
		frame.setVisible(true);
		
		
	}
}
