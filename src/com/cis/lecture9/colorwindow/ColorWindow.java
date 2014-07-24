package com.cis.lecture9.colorwindow;

import java.awt.Color;
import java.awt.event.*;

import javax.swing.*;

public class ColorWindow extends JFrame {
	JPanel panel;
	JLabel messageLabel;
	JButton redButton, blueButton, yellowButton;
	
	final int WINDOW_WIDTH = 300;
	final int WINDOW_HEIGHT = 100;
	
	public ColorWindow() {
		setTitle("Colors");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		messageLabel = new JLabel("Click on a button to select a color");
		redButton = new JButton("Red");
		blueButton = new JButton("Blue");
		yellowButton = new JButton("Yellow");
		
		redButton.addActionListener(new RedButtonListener());
		blueButton.addActionListener(new BlueButtonListener());
		yellowButton.addActionListener(new YellowButtonListener());
		
		panel = new JPanel();
		panel.add(messageLabel);
		panel.add(redButton);
		panel.add(blueButton);
		panel.add(yellowButton);
		
		add(panel);
		
		setVisible(true);
		
		
	}
	
	private class RedButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			panel.setBackground(Color.RED);
			messageLabel.setForeground(Color.WHITE);
		}
		
	}
	
	private class BlueButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			panel.setBackground(Color.BLUE);
			messageLabel.setForeground(Color.WHITE);
		}
		
	}
	
	private class YellowButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			panel.setBackground(Color.YELLOW);
			messageLabel.setForeground(Color.BLUE);
		}
		
	}
	
	public static void main(String[] args) {
		new ColorWindow();
	}
}
