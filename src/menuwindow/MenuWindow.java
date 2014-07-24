package menuwindow;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MenuWindow extends JFrame {
	private JLabel messageLabel;
	private final int LABEL_WIDTH = 400;
	private final int LABEL_HEIGHT = 200;
	
	private JMenuBar menuBar;
	private JMenu fileMenu;
	private JMenu textMenu;
	private JMenuItem exitItem;
	private JRadioButtonMenuItem blackItem;
	private JRadioButtonMenuItem redItem;
	private JRadioButtonMenuItem blueItem;
	private JCheckBoxMenuItem visibleItem;
	
	public MenuWindow() {
		setTitle("Example Menu System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		messageLabel = new JLabel(
				"Use the Text menu to change " +
				"my color and make me invisible");
		
		messageLabel.setPreferredSize(new Dimension(LABEL_WIDTH, LABEL_HEIGHT));
		
		add(messageLabel);
		
		buildMenuBar();
		
		pack();
		
		setVisible(true);
	}// end constructor
	
	private void buildMenuBar() {
		menuBar = new JMenuBar();
		
		buildFileMenu();
		buildTextMenu();
		
		menuBar.add(fileMenu);
		menuBar.add(textMenu);
		
		setJMenuBar(menuBar);
	}// end build menu bar
	
	private void buildFileMenu() {
		exitItem = new JMenuItem("Exit");
		exitItem.setMnemonic(KeyEvent.VK_X);
		exitItem.addActionListener(new ExitListener());
		
		fileMenu = new JMenu("File");
		fileMenu.setMnemonic(KeyEvent.VK_F);
		fileMenu.add(exitItem);
	}// end build file menu
	
	private void buildTextMenu() {
		blackItem = new JRadioButtonMenuItem("Black", true);
		blackItem.setMnemonic(KeyEvent.VK_B);
		blackItem.addActionListener(new ColorListener());
		
		redItem = new JRadioButtonMenuItem("Red");
		redItem.setMnemonic(KeyEvent.VK_R);
		redItem.addActionListener(new ColorListener());
		
		blueItem = new JRadioButtonMenuItem("Blue");
		blueItem.setMnemonic(KeyEvent.VK_U);
		blueItem.addActionListener(new ColorListener());
		
		ButtonGroup group = new ButtonGroup();
		group.add(blackItem);
		group.add(redItem);
		group.add(blueItem);
		
		visibleItem = new JCheckBoxMenuItem("Visible", true);
		visibleItem.setMnemonic(KeyEvent.VK_V);
		visibleItem.addActionListener(new VisibleListener());
		
		textMenu = new JMenu("Text");
		textMenu.setMnemonic(KeyEvent.VK_T);
		
		textMenu.add(blackItem);
		textMenu.add(redItem);
		textMenu.add(blueItem);
		textMenu.addSeparator();
		textMenu.add(visibleItem);
		
		
	}// end build text menu
	
	private class ExitListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			System.exit(0);
		}
		
	}// end exit listener
	
	private class ColorListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (blackItem.isSelected()) {
				messageLabel.setForeground(Color.BLACK);
			} else if (redItem.isSelected()) {
				messageLabel.setForeground(Color.RED);
			} else if (blueItem.isSelected()) {
				messageLabel.setForeground(Color.BLUE);
			} // end if
			
		}// end action performed
		
	}// end color listener
	
	private class VisibleListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			messageLabel.setVisible(visibleItem.isSelected());
		}
		
	}// end visible listener
	
	public static void main(String[] args) {
		new MenuWindow();
	}// end main
	
}// end class
