package sdfghjk;

public class TaskDDemo {
	
	public static void main(String[] args) {
		ArrayStack<String> Tester = new ArrayStack<>();
		Tester.push("hello");
		Tester.push("hello1");
		Tester.push("hello2");
		Tester.push("hello3");
		Tester.push("hello4");
		Tester.push("hello5");
		Tester.getStack();
		
		
		ArrayStack<String> LinkedTester = new ArrayStack<>();
		LinkedStack LTest = new LinkedStack();
		LinkedTester.push("soup");
		LinkedTester.push("soup1");
		LinkedTester.push("soup2");
		LinkedTester.push("soup3");
		LinkedTester.push("soup4");
		LinkedTester.push("soup5");
		LinkedTester.push("soup6");
		LinkedTester.push("soup7");
		LTest.getLinkedStack(LinkedTester);
	}

}
