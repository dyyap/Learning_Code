package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AnimatedRectPanel1 extends JPanel {
	private Point p1; //location of the first rectangle
	private Point p2; //location of the second rectangle
	private int dx; //amount by which to move horizontally
	private int dy; //amount by which to move vertically
	
	public AnimatedRectPanel1() {
		p1 = new Point(20, 40);
		p2 = new Point(60, 10);
		dx = 5;
		dy = 5;
		
	}
	
	//draws the panel on the screen
	public void paitComponent(Graphics g) {
		super.paintComponent(g); // call JPanel's version
		g.setColor(Color.RED);
		g.fillRect(p1.x,  p1.y, 70, 30);
		g.setColor(Color.BLUE);
		g.fillRect(p2.x, p2.y, 20, 80);
	}

}
