package gui;

import java.awt.*;
import  javax.swing.*;

public class CreditCardGUI {
	public static void main(String[] args) {
		CreditCardGUI gui = new CreditCardGUI();
		
	}
	
	//fields
	private JFrame frame;
	private JTextField numberField;
	private JLabel validLabel;
	private JButton verifyButton;
	
	//creates components, does layout, shows window onscreen
	public CreditCardGUI() {
		numberField = new JTextField(16);
		validLabel = new JLabel("not yet verified");
		verifyButton = new JButton("Verify CC Number");
		
		frame = new JFrame("Credit card number verifier");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(350, 100));
		frame.setLayout(new FlowLayout());
		frame.add(numberField);
		frame.add(verifyButton);
		frame.add(validLabel);
		frame.setVisible(true);
	}
}
