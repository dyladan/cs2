package com.cis.lecture9.kiloconvert;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class KiloConverter extends JFrame {
	JPanel panel;
	JLabel messageLabel;
	JLabel mileLabel;
	JTextField kiloTextField;
	JTextField mileTextField;
	JButton calcButton;
	final int WINDOW_HEIGHT = 100;
	final int WINDOW_WIDTH = 310;
	
	public KiloConverter() {
		setTitle("Kilo Converter");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		buildPanel();
		
		add(panel);
		
		setVisible(true);
		
	}
	
	public void buildPanel() {
		messageLabel = new JLabel("Enter a distance in km");
		kiloTextField = new JTextField(10);
		calcButton = new JButton("Calculate");
		mileLabel = new JLabel("Miles");
		mileTextField = new JTextField(10);
		
		calcButton.addActionListener(new CalcButtonListener());
		
		panel = new JPanel();
		panel.add(messageLabel);
		panel.add(kiloTextField);
		panel.add(calcButton);
		panel.add(mileLabel);
		panel.add(mileTextField);
	}
	
	private class CalcButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			final double CONVERSION = 0.6214;
			
			String input;
			double miles;
			
			input = kiloTextField.getText();
			
			miles = Double.parseDouble(input) * CONVERSION;
						
			mileTextField.setText(String.format("%.2f", miles));
			
		}
		
	}
	
	public static void main(String[] args) {
		new KiloConverter();
	}
}
