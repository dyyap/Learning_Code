package gui;

import javax.swing.*;

public class Questionaire {
	public static void main(String[] args) {
		String ageText = JOptionPane.showInputDialog(null, "How old are you?");
		
		int age = 0;
		
		try {
			age = Integer.parseInt(ageText);
		}
		catch (NumberFormatException nfe) {
			JOptionPane.showMessageDialog(null, "Invalid integer.");
		}
		
		String moneyText = JOptionPane.showInputDialog(null, "How much money do you have?");
		double money = Double.parseDouble(moneyText);
		
		JOptionPane.showMessageDialog(null, "If you can double your money each year,\n" + "You'll have " + (money * 32) + " dollars at age " + (age + 5) + "!");
		
			;
		}
	}
	
	
