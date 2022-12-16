package sdfghjk;

public class LinkedStack {
	
	

	public <T> T peek2(ArrayStack<T> a) {
		
		 T temp = a.peek();
		 a.pop();
		 if (!a.isEmpty()) {
			 
			 T second = a.peek();
			 a.push(temp);
			 return second;
		 }
		 else {
			 return null;
		
		}
	}
	public <T> void getLinkedStack(ArrayStack<T> a) {
		while(!a.isEmpty())
		{
			T print = a.pop();
			System.out.println(print);
			
		}
		
		
	}
	

}