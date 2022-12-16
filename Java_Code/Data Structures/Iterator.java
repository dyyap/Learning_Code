package datastructures;

import java.util.NoSuchElementException;

public interface Iterator<E> {
	
	//Returns true if the iterator has more elements
	boolean hasNext();
	
	//Returns the next element in the iteration
	E next() throws NoSuchElementException;
	
	//Removes from the underlying collection the last element returned
	//by this iterator (optional operation).
	void remove() throws IllegalStateException;
	

}
