package com.applet;

//First.java  
import java.applet.Applet;
import java.awt.Graphics;

public class AppletDemo extends Applet {

	public void paint(Graphics g) {
		g.drawString("welcome", 150, 150);
	}

}