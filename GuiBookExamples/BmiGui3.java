package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BmiGui3 implements ActionListener {
	//BmiGui3 is its own runnable Client program
	public static void main(String[] args) {
		BmiGui3 gui = new BmiGui3();
	}
	
	//onscreen components stored as fields
	private JFrame frame;
	private JTextField heightField;
	private JTextField weightField;
	private JLabel bmiLabel;
	private JButton computeButton;
	
	public BmiGui3() {
		//set up components
		heightField = new JTextField(5);
		weightField = new JTextField(5);
		bmiLabel = new JLabel("Type your height and weight");
		computeButton = new JButton("Compute");
		
		//attach Gui as event listener to Compute button
		computeButton.addActionListener(this);
		
		//layout
		JPanel north = new JPanel(new GridLayout(2,2));
		north.add(new JLabel("Height: "));
		north.add(heightField);
		north.add(new JLabel("Weight: "));
		north.add(weightField);
		
		//overall frame
		frame = new JFrame("BMI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.add(north, BorderLayout.NORTH);
		frame.add(bmiLabel, BorderLayout.CENTER);
		frame.add(computeButton, BorderLayout.SOUTH);
		frame.pack();
		frame.setVisible(true);
		
		

	}
	 
	//handles clicks on compute button by computing the BMI
	public void actionPerformed(ActionEvent event) {
		// read height/weight info from text field
		String heightText = heightField.getText();
		double height = Double.parseDouble(heightText);
		String weightText = weightField.getText();
		double weight = Double.parseDouble(weightText);
		
		//compute BMI and display it onscreen
		double bmi =weight/ (height * height) * 703;
		bmiLabel.setText("BMI: " + bmi);
	}
}
