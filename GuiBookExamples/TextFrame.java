package gui;


import java.awt.*;
import javax.swing.*;

public class TextFrame {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		frame.setSize(new Dimension(350, 100));
		frame.setTitle("Hello");
		
		JTextArea area = new JTextArea(5,20);
		frame.add(area);
		
		frame.setVisible(true);
	}

}
