package com.cis.lecture11.simpleapplet;

import javax.swing.*;
import java.awt.*;

public class SimpleApplet extends JApplet {
	public SimpleApplet() {
		JLabel label = new JLabel("My first applet");
		setLayout(new FlowLayout());
		add(label);
	}
}
