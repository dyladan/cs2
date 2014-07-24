package com.cis.lecture10.listwindow;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

@SuppressWarnings("serial")
public class ListWindow extends JFrame{
	private JPanel monthPanel;
	private JPanel selectedMonthPanel;
	private JList<String> monthList;
	private JTextField selectedMonth;
	private JLabel label;
	private JScrollPane scrollPane;
	
	private String[] months = {
			"January",
			"February",
			"March",
			"April",
			"May",
			"June",
			"July",
			"August",
			"September",
			"October",
			"November",
			"December"
	};
	
	public ListWindow() {
		setTitle("List Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		buildMonthPanel();
		buildSelectedMonthPanel();
		
		add(monthPanel, BorderLayout.CENTER);
		add(selectedMonthPanel, BorderLayout.SOUTH);
		
		pack();
		
		setVisible(true);
	}
	
	public void buildMonthPanel() {
		monthPanel = new JPanel();
		monthList = new JList<String>(months);
		monthList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		monthList.addListSelectionListener(new ListListener());
		
		monthList.setVisibleRowCount(6);
		scrollPane = new JScrollPane(monthList);
		
		monthPanel.add(scrollPane);
	}
	
	public void buildSelectedMonthPanel() {
		selectedMonthPanel = new JPanel();
		label = new JLabel("You selected: ");
		selectedMonth = new JTextField(10);
		selectedMonth.setEnabled(false);
		selectedMonthPanel.add(label);
		selectedMonthPanel.add(selectedMonth);
	}
	
	private class ListListener implements ListSelectionListener {
		public void valueChanged(ListSelectionEvent e) {
			String selection = (String)monthList.getSelectedValue();
			selectedMonth.setText(selection);
		}
	}
	
	public static void main(String[] args) {
		new ListWindow();
	}
}
