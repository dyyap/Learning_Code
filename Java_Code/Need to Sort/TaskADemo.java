package sdfghjk;

public class TaskADemo {

	//Daniel Yap
	//CS240
	//Assignment 2
	//5/3/2018
	public static void main(String args[]) {
	ArrayStack<String> Carlton = new ArrayStack<>();
	String[] list = new String[3];
	Carlton.push("Carl");
	list[0] = Carlton.peek();
	Carlton.push("Hello");
	list[1] = Carlton.peek();
	Carlton.push("World");
	list[2] = Carlton.peek();
	
	for (int c = 0; c<list.length; c++) {// reading the contents of the stack in the order it was placed
		System.out.println(list[c]);
	}
	
	
	
	
	
	
	
	

    
	
}
}