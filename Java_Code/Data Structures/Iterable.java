package datastructures;

import java.util.Spliterator;
import java.util.function.Consumer;

public interface Iterable<E> {
	
	//Performs the given action for each element of the Iterable until
	//all elements have been processed or the action throws an exception
	default void forEach(Consumer<? super E> action) {};
	
	//Returns an iterator over elements of type E
	Iterator<E> iterator();
	
	//Creates a Spliterator over the elements described by this Iterable
	default Spliterator<E> spliterator() {
		return null;
	}
	
	
}
