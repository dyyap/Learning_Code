package gui;

import java.awt.*;
import java.awt.image.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;


public class DrawingPanel extends MouseInputAdapter implements ActionListener {
	private JFrame frame; // window frame
	private JPanel panel; //drawing surface
	private Graphics g; // drawing pen
	private JLabel statusBar; // status bar
	
	//constructs a drawing panel of given size
	public DrawingPanel(int width, int height) {
		//sets up the empty image onto which we will draw
		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		g = image.getGraphics();
		g.setColor(Color.black);
		
		
	// enclose the image in a  label inside a panel
		JLabel label = new JLabel();
		label.setIcon(new ImageIcon(image));
		panel = new JPanel(new FlowLayout());
		panel.setBackground(Color.white);
		panel.setPreferredSize(new Dimension(width, height));
		panel.add(label);
		
	// the status bar that shows the mouse position
		statusBar = new JLabel(" ");
		
	//attaches listener to obesrve mouse movement
		panel.addMouseListener(this);
		panel.addMouseMotionListener(this);
		
		//set up the JFrame
		frame = new JFrame("Drawing Panel");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLayout(new BorderLayout());
		frame.add(panel, BorderLayout.CENTER);
		frame.add(statusBar, BorderLayout.SOUTH);
		frame.pack();
		frame.setVisible(true);
		
		
	}
	
	//obtain the Graphics object to fraw on the panel
	public Graphics getGraphics() {
		return g;
	}
	
	//sets the background color of the drawing panel
	public void setBackground(Color c) {
		panel.setBackground(c);
		
	}
	 // show or hides the drawing panel on the screen
	public void setVisible(boolean visible) {
		frame.setVisible(visible);
	}
	
	// used for timer that repeatedly repaints screen
	public void actionPerformed(ActionEvent e) {
		panel.repaint();
	}
	//draws status bar text when mouse moves
	public void mouseMoved(MouseEvent e) {
		statusBar.setText("(" + e.getX() + ", " + e.getY() + ")");
	}
	

}
