package gui;

import java.awt.*;
import javax.swing.*;

public class UseRectPanel {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200, 200);
		frame.setTitle("A panel with rectangles");
		
		DrawingPanel panel = new DrawingPanel(50,60);
		panel.setBackground(Color.WHITE);
		frame.add(panel);
		
		frame.setVisible(true);
	}
}
