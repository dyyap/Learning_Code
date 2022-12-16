package sdfghjk;

public class TaskCDemo {

	public static void main(String[] args){
		ArrayStack<String> GoodTest = new ArrayStack<>();
		GoodTest.push("hello");
		GoodTest.push("World");
		GoodTest.push("Soup");
		LinkedStack Testing = new LinkedStack();
		System.out.println(Testing.peek2(GoodTest) + " = this is the second of the stack");
		System.out.println(GoodTest.peek() + " = This is the top of the stack");
		
		ArrayStack<String> BadTest = new ArrayStack<>();
		BadTest.push("goodbye");
		System.out.println(Testing.peek2(BadTest));
		
} 
}