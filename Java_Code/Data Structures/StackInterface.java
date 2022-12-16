package datastructures;

public interface StackInterface<E> {
	
	// Returns the number of elements in the stack
	int size();
	//Returns number of elements in the stack
	
	// Tells whether the stack is empty
	boolean isEmpty();
	// Returns true if stack is empty
	
	// Insets an element to the top of the stack
	void push(E e);
	// Element to be inserted
	
	//Returns but does not remove the top element of the stack
	E top();
	// Returns top element of the stack
	
	// Removes and returns the top element from the stack
	E pop();
	// return element removed or null if empty
	

}
