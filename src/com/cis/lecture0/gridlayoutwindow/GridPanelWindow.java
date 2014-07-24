package com.cis.lecture0.gridlayoutwindow;

import javax.swing.*;

import java.awt.event.*;
import java.awt.*;

public class GridPanelWindow extends JFrame {
	private final int WINDOW_WIDTH = 400;
	private final int WINDOW_HEIGHT = 200;
	
	public GridPanelWindow() {
		setTitle("Grid Panel Layout");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(2,3));
		
		JButton button1 = new JButton("Button 1");
		JButton button2 = new JButton("Button 2");
		JButton button3 = new JButton("Button 3");
		JButton button4 = new JButton("Button 4");
		JButton button5 = new JButton("Button 5");
		JButton button6 = new JButton("Button 6");
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		JPanel panel6 = new JPanel();
		
		JLabel label1 = new JLabel("Cell 1");
		JLabel label2 = new JLabel("Cell 2");
		JLabel label3 = new JLabel("Cell 3");
		JLabel label4 = new JLabel("Cell 4");
		JLabel label5 = new JLabel("Cell 5");
		JLabel label6 = new JLabel("Cell 6");
		
		panel1.add(label1);
		panel1.add(button1);
		
		panel2.add(label2);
		panel2.add(button2);
		
		panel3.add(label3);
		panel3.add(button3);
		
		panel4.add(label4);
		panel4.add(button4);
		
		panel5.add(label5);
		panel5.add(button5);
		
		panel6.add(label6);
		panel6.add(button6);
		
		add(panel1);
		add(panel2);
		add(panel3);
		add(panel4);
		add(panel5);
		add(panel6);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new GridPanelWindow();
	}
}
