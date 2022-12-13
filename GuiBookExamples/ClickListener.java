package gui;

//Responds to a mouse click by showing a message
// that indicates were the user clicked

import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class ClickListener extends MouseInputAdapter {
	public void mousePressed(MouseEvent event) {
		JOptionPane.showMessageDialog(null,
				"Mouse pressed at position ("  + event.getX() + "," + event.getY() + ")");
	}

}
