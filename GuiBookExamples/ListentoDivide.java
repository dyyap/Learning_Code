package gui;

import java.awt.event.*;
import javax.swing.*;

public class ListentoDivide (JTextField firstnumber, JTextField secondnumber) implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		
	// read height/weight info from text field
			String first = firstnumber.getText();
			double height = Double.parseDouble(first);
			String second = secondnumber.getText();
			double weight = Double.parseDouble(second);
			
			//compute BMI and display it onscreen
			double bmi =weight/ (height * height) * 703;
			bmiLabel.setText("BMI: " + bmi);
	
}
}