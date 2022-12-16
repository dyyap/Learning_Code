/*

showConfirmDialog(parent, message)

	shows a yes/no/cancel message boc containing the given message on the screen ad returns the choice as an int
	with one other following constant values:
		JOptionPane.YES_OPTION(user clicked "Yes")
		JOptionPane.NO_OPTION(user clicked "no")
		JOPtionPane.CANCEL_OPTION(user clicked "Cancel")


-------------------------------------------------------------------------------------------------------------------------

showInputDialog(Parent, message)
	
	Shows an input box containing the given message on the screen 
	returns the user's input value as a String
	
showMessageDialog(parent, message)
	
	Shows the given message string in a message box on the screen
	
----------------------------------------------------------------------------------------------------------------------

Frame == A graphical window on the screen

Component == A widget, such as a button or text field, that resides inside a graphical window.abstract

text field == box in which a user can type text strings

label == string displayed by the GUI

Layout Manager == a Java object that determines the positions, sizes, and resizing behavior of the components
				  within a frame or other container on the screen
				  
Event == An object that represents a user's interaction with a GUI component and that can
		 be handled by your programs to create interactive components

Listener == An object that is notified when an event occurs and that executes code 
			to respond to the event

Composite Layer == A layered layout that uses several layout managers in different nested containers
			

--------------------------------------------------------------------------------------------------------------------------------------------


Integer.parseInt(str) 
	Returns the integer represented by the given String as an int

Double.parseDouble(str)
 	Returns the real number represented by the given String as a double

Boolean.parseBoolean(str)
	Returns the boolean value represented by the given String (if the text is "true", returns true; otherwise, returns false
	
------------------------------------------------------------------------------------------------------------------------------------------------------------

Types of J
	JButton
	JCheckBox
	JRadioBox
	JLabel
	JTextField
	JSlider
	JToolBar
	JComboBox
	JList
	JMenuBar, JMenu, JMenuItem
	JColorChooser
	JFileChooser
	JTable
	JTree
----------------------------------------------------------------------------------------------------------

default Close operation
	What should happen when the frame is closed; choices include:
		JFrame.DO_NOTHING_ON_CLOSE (Don't do anything)
		JFrame.HIDE_ON_CLOSE (Hide the frame)
		JFrame.DISPOSE_ON_CLOSE (Hide and destroy the frame so that it cannot be shown again)
		JFrame.EXIT_ON_CLOSE (Exit the program)
		
		Methods
			getDefaultCloseOperation;
			setDefaultCloseOperation(int);
			
icon image (Image)
		
	The icon that appears in the title bar and Start menu or Dock
		
	Methods
		getIconImage
		setIconImage (Image)
		
layout (LayoutManager)

	An object that controls the positions and sizes of the components inside this frame
	
	Methods
		getLayout
		setLayout (LayoutManager)
		
resizable (boolean)
	
	An object that controls the positions and sizes of the components inside this frame
	
	Methods
		isResizable
		setResizable (boolean)
		
title (String)

	The text that appears in the frame's title bar
	
	Methods
		getTitle,
		setTitle (String)
		
background (color)

	Background color
	
	Methods
		getBackground
		setBackground (Color)

enabled (boolean)

	Whether the component can be interacted with
	
	Methods
		isEnabled
		setEnable (boolean)

focusable (boolean)
	
	Whether the keyboard can send input to the component
	
	Methods
		isFocusable
		setFocusable (boolean)
		
font (Font)

	Font used to write text
	
	Methods
		getFont
		setFont(Font)
		
foreground (Color)

	Foreground Color
	
	Methods
		getForeground
		setForeground (Color)
		
Location (point)

	(x,y) coordinate of component's top-left corner
	
	Methods
		getLocation
		setLocation (Point)
		
size (Dimension) 

	Current width and height of the component
	
	Methods
		getSize
		setSize (Dimension)
		
preferred size (Dimension)

	"Preferred" width and height of the component; the size it should be to make it appear naturally on the screen (used with layout managers, seen later)
	
	Methods
		getPreferredSize
		setPreferredSize (Dimension)
		
visible (boolean)

	Whether the component can be seen on the screen
	
	Methods
		isVisible
		setVisible(boolean)
		
---------------------------------------------------------------------------------------------------

public Dimension(int width, int height)
public int getWidth()
public int getHeight()

----------------------------------------------------------------------------------------------------

How to handle an event in Java
	Write a class that implements ActionListener
	Place the code to handle the event into its actionPerformed method
	Attach an object of your listener class to the component of interest using its addActionListener Method
	
------------------------------------------------------------------------------------------------------------

public BufferedImage(int widthh, int height, int type)
Constructs an image buffer of the given size and type. Valid Types are 
	BufferedImage.TYPE_INT_ARGB: An image with a transparent background.
	BufferedImage.TYPE_INT_RGB: An image with a solid black background
	
public Graphics getGraphics()
Returns the pen for drawing on this image buffer

-----------------------------------------------------------------------------------------------------

public void mouseClicked(MouseEvent event)
	Invoked when the mouse button has been clicked(pressed and released) on a component

public void mouseDragged(MouseEvent event)
	Invoked when a mouse button is pressed ona  component and then dragged
	
public void mouseEntered(MouseEvent event)
	Invoked when the mouse enters a component
	
public void mouseExited(MouseEvent event)
	Invoked when the mouse exits a component

public void mouseMoved(MouseEvent event)
	Invoked when the mouse has been moved onto a component but no buttons have been pushed
	
public void mousePressed(MouseEvent event)
	Invoked when a mouse button has been pressed on a computer

public void mouseReleased(MouseEvent event)
	Invoked when a mouse button has been released on a computer
	
-----------------------------------------------------------------------------------------------------

public void addMouseListener(MouseListener listener)
	Attaches a listener to hear mouse enter, exit press, release, and click events
	
public void addMouseMotionListener(MouseMotionListener listener)
	Attaches a listener to hear mouse move and drag events
	
----------------------------------------------------------------------------------------------------------

public int getButton()
	Returns the number of the mouse button that was pressed or released(1 for the left button, 2 for the right button and so on
	
public in getClibkCount()
	Returns the number of times the user clicked the button. This method is useful for detecting double-click
	
public Point getPoint()
	Returns the (x,y) point where the mouse event occurred
	
public int getX()
	Returns the x coordinate
	
public int getY
	Returns the Y coordinate
	
----------------------------------------------------------------------------------------------------------------
public Timer(int msDelay ActionListener listener)
	Creates a Timer that activates the given ActionListener every msDelay millisecond
	
public void start()
	Tells the timer to start ticking and to activate its ActionListener
	
public void stop()
	Tells the timer to stop ticking and not to activate its ActionListener


*/

