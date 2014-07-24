package com.cis.project3;

/**
 * @author Daniel Dyla
 * CIS 2151 - Prof. John P. Baugh
 * Summer 2014
 * Programming Assignment 3
 *
 * Implements a simple postfix calculator
 */

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.EmptyStackException;
import java.util.Stack;

public class Calculator extends JFrame {
	private JPanel panel;
	private JTextField screen;
	private final int WIDTH = 400;
	private final int HEIGHT = 500;
	
	public Calculator() {
		setTitle("Postfix Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		buildPanel();
		add(panel);
		setSize(WIDTH, HEIGHT);
		setVisible(true);
	}
	
	private void buildPanel() {
		JButton button;
		GridBagConstraints c;
		
		c = new GridBagConstraints();
		
		panel = new JPanel();
		panel.setLayout(new GridBagLayout());
		
		// Calculator "Screen"
		screen = new JTextField();
		screen.setEditable(false);
		Font font1 = new Font("SansSerif", Font.PLAIN, 20);
		screen.setFont(font1);
		screen.setHorizontalAlignment(JTextField.RIGHT);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 5;
		c.weightx = 0.0;
		panel.add(screen, c);
		
		// Constants for all buttons except enter
		c.fill = GridBagConstraints.BOTH;
		c.gridwidth = 1;
		c.weightx = 0.5;
		c.weighty = 0.5;
		
		// Row 1
		c.gridy = 1;
		
		// Col 1
		c.gridx = 1;
		button = new JButton("1");
		button.addActionListener(new ButtonListener());
		panel.add(button, c);
		
		// Col 2
		c.gridx = 2;
		button = new JButton("2");
		button.addActionListener(new ButtonListener());
		panel.add(button, c);
		
		// Col 3
		c.gridx = 3;
		button = new JButton("3");
		button.addActionListener(new ButtonListener());
		panel.add(button, c);
		
		// Col 4
		c.gridx = 4;
		button = new JButton("+");
		button.addActionListener(new ButtonListener());
		panel.add(button, c);
		
		// Row 2
		c.gridy = 2;
		// Col 1
		c.gridx = 1;
		button = new JButton("4");
		button.addActionListener(new ButtonListener());
		panel.add(button, c);
		
		// Col 2
		c.gridx = 2;
		button = new JButton("5");
		button.addActionListener(new ButtonListener());
		panel.add(button, c);
		
		// Col 3
		c.gridx = 3;
		button = new JButton("6");
		button.addActionListener(new ButtonListener());
		panel.add(button, c);
		
		// Col 4
		c.gridx = 4;
		button = new JButton("-");
		button.addActionListener(new ButtonListener());
		panel.add(button, c);
		
		// Row 3
		c.gridy = 3;
		// Col 1
		c.gridx = 1;
		button = new JButton("7");
		button.addActionListener(new ButtonListener());
		panel.add(button, c);
		
		// Col 2
		c.gridx = 2;
		button = new JButton("8");
		button.addActionListener(new ButtonListener());
		panel.add(button, c);
		
		// Col 3
		c.gridx = 3;
		button = new JButton("9");
		button.addActionListener(new ButtonListener());
		panel.add(button, c);
		
		// Col 4
		c.gridx = 4;
		button = new JButton("*");
		button.addActionListener(new ButtonListener());
		panel.add(button, c);
		
		// Row 4
		c.gridy = 4;
		// Col 2
		c.gridx = 2;
		button = new JButton("0");
		button.addActionListener(new ButtonListener());
		panel.add(button, c);
		
		// Col 3
		c.gridx = 3;
		button = new JButton("C");
		button.addActionListener(new ButtonListener());
		panel.add(button, c);
		
		// Col 4
		c.gridx = 4;
		button = new JButton("/");
		button.addActionListener(new ButtonListener());
		panel.add(button, c);
		
		// Row 5
		c.gridy = 5;
		// Col 1
		c.gridx = 1;
		
		c.gridwidth = 3;
		button = new JButton("Calculate");
		button.addActionListener(new ButtonListener());
		panel.add(button, c);
		c.gridwidth = 1;
		
		// Col 4
		c.gridx = 4;
		button = new JButton("_");
		button.addActionListener(new ButtonListener());
		panel.add(button, c);
		
		
		
	}
	
	private class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			String command = arg0.getActionCommand();
			System.out.println(command);
			
			String current = screen.getText();
			current = current.replaceAll("\\s+", " ");
			
			if (current.contains("ERROR")) {
				current = "";
				screen.setText("");
			}
			
			if (command.equals("Calculate")){
				current += " =";
				try {
					screen.setText(calculate(current));
				} catch (TooManyValuesException e) {
					screen.setText("ERROR: TOO MANY VALUES");
					System.out.println(e.toString());
				} catch (NumberFormatException e) {
					screen.setText("ERROR: SYMBOL FORMAT");
					System.out.println(e.toString());
				} catch (EmptyStackException e) {
					screen.setText("ERROR: TOO MANY OPERATORS");
					System.out.println(e.toString());
				} catch (Exception e) {
					screen.setText("UNHANDLED ERROR");
					System.out.println(e.toString());
				}
			} else if (command.equals("C")) {
				// Clear screen
				screen.setText("");
			} else if (command.equals("_")) {
				screen.setText(current + " ");
			} else {
				screen.setText(current + command);
			}
			
			
		}
		
	}
	
	private static String calculate(String input) throws Exception {
		if (input.equals("")) {
			return(input);
		}
		
		double val1, val2, result;
		String output = null;
		String symbol;
		Stack<Double> stack;
		String[] symbols;
		
		stack = new Stack<Double>();
		symbols = input.split(" ");
		
		for (int i = 0; i < symbols.length; i++) {
			symbol = symbols[i];
			if (symbol.equals("")) {
				continue;
			}
			if (symbol.equals("+")) {
				val1 = stack.pop();
				val2 = stack.pop();
				result = val1 + val2;
				stack.push(result);
			} else if (symbol.equals("*")) {
				val1 = stack.pop();
				val2 = stack.pop();
				result = val1 * val2;
				stack.push(result);
			} else if (symbol.equals("-")) {
				val1 = stack.pop();
				val2 = stack.pop();
				result = val2 - val1;
				stack.push(result);
			} else if (symbol.equals("/")) {
				val1 = stack.pop();
				val2 = stack.pop();
				result = val2 / val1;
				stack.push(result);
			} else if (symbol.equals("=")) {
				output = fmt(stack.pop());
				if (!stack.empty()) {
					throw new TooManyValuesException();
				}
			} else {
				val1 = Double.parseDouble(symbol);
				stack.push(val1);
			}
		}
		
		
		return output;
		
	}
	
	public static String fmt(double d)
	{
	    if(d == (int) d)
	        return String.format("%d",(int)d);
	    else
	        return String.format("%s",d);
	}
	
	
	public static void main(String[] args) {
		new Calculator();
	}
	
}
