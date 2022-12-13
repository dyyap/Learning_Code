package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CreditCardGUI2 implements ActionListener { 
	public static void main(String[] args) {
		CreditCardGUI2 gui = new CreditCardGUI2();
	}
	// fields
	private JFrame frame;
	private JTextField numberField;
	private JLabel validLabel;
	private JButton verifyButton;
	
	//creates components, does layout, shows window onscreen
	public CreditCardGUI2() {
		numberField = new JTextField(16);
		validLabel = new JLabel("not yet verified");
		verifyButton = new JButton("Verify CC Number");
		
		//event listeners
		verifyButton.addActionListener(this);
		
		frame = new JFrame("Credit card number verifier");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(350, 100));
		frame.setLayout(new FlowLayout());
		frame.add(numberField);
		frame.add(verifyButton);
		frame.setVisible(true);
	}
	
	//Returns whether the given string is a valid Visa
	// card number according to the Luhn checksum algorithm
	public boolean isValidCC(String text) {
		int sum = 0;
		for(int i = text.length() - 1; i >= 0; i--) {
			int digit = Integer.parseInt(text.substring(i, i+1));
			if (i%2 == 0) {
				//double even digits
				digit *= 2;
			}
			sum += (digit/10) + (digit%10);
		}
		 //valid numbers add up to a multiple of 10
		return sum % 10 == 0 && text.startsWith("4");
	}
	
	//Sets label's text to show whether CC number is valid
	public void actionPerformed(ActionEvent event) {
		String text = numberField.getText();
		if (isValidCC(text)) {
			validLabel.setText("Valid Number!");
		}else { 
			validLabel.setText("Invalid Number.");
		}
	}
}
