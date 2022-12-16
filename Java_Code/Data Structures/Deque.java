package datastructures;

public interface Deque<E> {
	
	// Returns the number of elements in the deque
	int size();
	
	//Tests whether the deque is empty
	boolean isEmpty();
	
	//Returns but does not remove, the first element of the deque
	E first();
	
	//Returns, but does not remove, the last element of the deque
	E last();
	
	//Inserts an element at the front of the deque
	void addFirst(E e);
	
	//Insert and element at the back of the deque
	void addLast(E e);
	
	//Removes and returns the first element of the deque
	E removeFirst();
	
	//Removes and returns the last element of the deque
	E removeLast();

}
