package datastructures;

public interface BinaryTree<E> extends Tree<E>{
	
	//Returns the Position of p's left child
	Position<E> left(Position<E> p) throws IllegalArgumentException;
	
	//Returns the Position of p's right child
	Position<E> right(Position<E> p) throws IllegalArgumentException;
	
	//Returns the Position of p's sibling
	Position<E> sibling(Position<E> p) throws IllegalArgumentException;

}
