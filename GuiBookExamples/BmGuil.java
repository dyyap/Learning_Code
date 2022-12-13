package gui;
import java.awt.*;
import javax.swing.*;

public class BmGuil {
	public static void main(String[] args) {
		//set up components
		JTextField heightField = new JTextField(5);
		JTextField weightField = new JTextField(5);
		JLabel bmiLabel = new JLabel(
				"Type your height and wieght");
		JButton computeButton = new JButton("Compute");
		
		//layout
		JPanel north = new JPanel(new GridLayout(2,2));
		north.add(new JLabel("Height: ")); //text
		north.add(heightField); //input text file
		north.add(new JLabel("Weight: ")); // text
		north.add(weightField); //input text file
		
		//overall frame
		JFrame frame = new JFrame("BMI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.add(north, BorderLayout.NORTH); // up
		frame.add(bmiLabel, BorderLayout.CENTER); // middle
		frame.add(computeButton, BorderLayout.SOUTH); // down
		frame.pack();
		frame.setVisible(true);
		
	}

}
