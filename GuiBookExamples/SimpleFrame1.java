package gui;

import java.awt.* ;
import javax.swing.*;

public class SimpleFrame1 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setForeground(Color.WHITE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(new Point(10, 50));
		frame.setSize(new Dimension(300, 120));
		frame.setTitle("A frame");
		frame.setVisible(true);
		
		JButton button1 = new JButton();
		button1.setText("I'm the first button");
		frame.add(button1);
		
		JButton button2 = new JButton("The second button");
		button2.setBackground(Color.YELLOW);
		frame.add(button2);
	}

}
