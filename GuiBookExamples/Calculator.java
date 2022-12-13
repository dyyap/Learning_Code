package gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

public class Calculator {
	public static void main(String[] args) { 
		new Calculator();
	}

	private JFrame frame;
	private JTextField firstnumber;
	private JTextField secondnumber;
	private JLabel CalcLabel;
	private JButton Multiply;
	private JButton Divide;
	private JButton Addition;
	private JButton Subtraction;
	public  Calculator() { 
	//set up components
			firstnumber = new JTextField(5);
			secondnumber = new JTextField(5);
			CalcLabel = new JLabel("Type the first number and second number");
			Multiply = new JButton("Multiply");
			Divide = new JButton("Divide");
			Subtraction = new JButton("Subtract");
			Addition = new JButton("Add");
			
			
			Multiply.addActionListener(new ListentoMultiply());
			Divide.addActionListener(new ListentoDivide());
			Subtraction.addActionListener(new ListentoSubtraction());
			Addition.addActionListener(new ListentoAddition());
			
			//layout
			JPanel north = new JPanel(new GridLayout(2,2));
			north.add(new JLabel("First Number: "));
			north.add(firstnumber);
			north.add(new JLabel("Second Number: "));
			north.add(secondnumber);
			
			JPanel south = new JPanel(new GridLayout(2,2));
			south.add(Multiply);
			south.add(Divide);
			south.add(Addition);
			south.add(Subtraction);
			
			//overall frame
			frame = new JFrame("");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setLayout(new BorderLayout());
			frame.add(north, BorderLayout.NORTH);
			frame.add(CalcLabel, BorderLayout.CENTER);
			frame.add(south, BorderLayout.SOUTH);
			frame.pack();
			frame.setVisible(true);
			
			
	
}

class ListentoDivide implements ActionListener {
	public void actionPerformed(ActionEvent e) {
	// read height/weight info from text field
			String first = firstnumber.getText();
			double height = Double.parseDouble(first);
			String second = secondnumber.getText();
			double weight = Double.parseDouble(second);
			
			//compute BMI and display it onscreen
			double answer = height/weight;
			CalcLabel.setText("Answer: " + answer);
	
		}
	}
class ListentoMultiply implements ActionListener {
	public void actionPerformed(ActionEvent e) {
	// read height/weight info from text field
			String first = firstnumber.getText();
			double height = Double.parseDouble(first);
			String second = secondnumber.getText();
			double weight = Double.parseDouble(second);
			
			//compute BMI and display it onscreen
			double answer = height * weight;
			CalcLabel.setText("Answer: " + answer);

		}
	}
class ListentoAddition implements ActionListener {
	public void actionPerformed(ActionEvent e) {
	// read height/weight info from text field
			String first = firstnumber.getText();
			double height = Double.parseDouble(first);
			String second = secondnumber.getText();
			double weight = Double.parseDouble(second);
			
			//compute BMI and display it onscreen
			double answer = (weight + height);
			CalcLabel.setText("Answer: " + answer);
		}
	}
class ListentoSubtraction implements ActionListener {
public void actionPerformed(ActionEvent e) {
	// read height/weight info from text field
			String first = firstnumber.getText();
			double height = Double.parseDouble(first);
			String second = secondnumber.getText();
			double weight = Double.parseDouble(second);
			
			//compute BMI and display it onscreen
			double answer = height - weight;
			CalcLabel.setText("Answer: " + answer);
		}
	}
}