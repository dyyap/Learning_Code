package datastructures;

import java.util.Iterator;



public interface PositionalList<E> extends Position<E> {
	
	//Returns the number of elements in the list
	int size();
	
	//Tests whether the list is empty
	boolean isEmpty();
	
	//Returns the first Position in the list 
	Position<E> first();
	
	//Returns the last Position in the list
	Position<E> last();
	
	//Returns the Position immediately before Position p
	Position<E> before(Position<E> p) throws IllegalArgumentException;
	
	//Returns the Position immediately after Position p
	Position<E> after(Position<E> p ) throws IllegalArgumentException;
	
	//Inserts element e at the front of the list and returns its new Position
	Position<E> addFirst(E e);
	
	//Inserts element e at the back of the list and returns its new Position
	Position<E> addLast(E e);
	
	//Inserts element e immediately before Position p and returns its new Position
	Position<E> addBefore(Position<E> p, E e) throws IllegalArgumentException;
	
	//Inserts element e immediately after Position p and returns its new Position
	Position<E> addAfter(Position<E> p, E e) throws IllegalArgumentException;
	
	//Replaces the element stored at Position p and returns the replaced element
	E set(Position<E> p , E e) throws IllegalArgumentException;
	
	//Removes the element stored at Position p and returns it
	E remove(Position<E> p) throws IllegalArgumentException;
	
	Iterator<E> iterator();
	
	
	
	
}
