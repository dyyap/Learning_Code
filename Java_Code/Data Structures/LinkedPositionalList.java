package datastructures;

import java.util.NoSuchElementException;
import java.util.Iterator;


public class LinkedPositionalList<E> implements PositionalList<E>{
	private static class Node<E> implements Position<E> {
		
		private E element;
		private Node<E> prev;
		private Node<E> next;
		public Node(E e, Node<E> p, Node<E> n) {
			element = e;
			prev = p;
			next = n;
		}
		
		public E getElement() throws IllegalStateException {
			if (next == null)
				throw new IllegalStateException("Position no longer valid");
			return element;
		}
		
		public Node<E> getPrev() {
			return prev;
		}
		
		public Node<E> getNext() {
			return next;
		}
		
		public void setElement(E e) {
			element = e;
		}
		
		public void setPrev(Node<E> p) {
			prev = p;
		}
		
		public void setNext(Node<E> n) {
			next = n;
		}
	}//-------------end of nested Node class------------
	
	private Node<E> header;
	private Node<E> trailer;
	private int size = 0;
	
	public LinkedPositionalList() {
		header = new Node<> (null, null, null); //create header
		trailer = new Node<> (null, header, null); // trailer prev is pointed to header
		header.setNext(trailer); // header is followed by trailer
	}
	
	private Node<E> validate(Position<E> p) throws IllegalArgumentException { //validates the position and returns it as a node
		if(!(p instanceof Node)) throw new IllegalArgumentException("Invalid p");
		Node<E> node = (Node<E>)p; //safe cast
		if (node.getNext() == null)
			throw new IllegalArgumentException("p is no longer in the list");
		return node;
		
	}
	
	private Position<E> position(Node<E> node) { // Returns the given node as a position
		if(node == header || node == trailer)
			return null;
		return node;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public Position<E> first() {
		return position(header.getNext());
	}
	
	public Position<E> last() {
		return position(trailer.getPrev());
	}

	
	public Position<E> before(Position<E> p) throws IllegalArgumentException {
		Node<E> node = validate(p);
		return position(node.getPrev());
	}

	
	public Position<E> after(Position<E> p) throws IllegalArgumentException {
		Node<E> node = validate(p);
		return position(node.getNext());
	}
	
	private Position<E> addBetween(E e, Node<E> pred, Node<E> succ) {
		Node<E> newest = new Node<>(e, pred, succ);
		pred.setNext(newest);
		succ.setPrev(newest);
		size++;
		return newest;
		
	}


	public Position<E> addFirst(E e) {
		return addBetween(e, header, header.getNext()); // just after the header
	}

	
	public Position<E> addLast(E e) {
		return addBetween(e, trailer.getPrev(), trailer); // just before the trailer
		
	}


	public Position<E> addBefore(Position<E> p, E e) throws IllegalArgumentException {
			Node <E> node = validate(p); // find the node in that position
			return addBetween(e, node.getPrev(), node); //put before the node
	}


	public Position<E> addAfter(Position<E> p, E e) throws IllegalArgumentException {
		Node<E> node = validate(p); // get the position and turn it into the node
		return addBetween(e, node, node.getNext()); // put it after the node
	}

	
	public E set(Position<E> p, E e) throws IllegalArgumentException {
		Node<E> node = validate(p); // find the node in that position
		E answer = node.getElement(); //get whatever is in that node
		node.setElement(e); //set the new element
		return answer; //return the removed
	}

	public E remove(Position<E> p) throws IllegalArgumentException {
		Node<E> node = validate(p); //get the node in the position
		Node<E> predecessor = node.getPrev(); // make all of the pointers skip
		Node<E> successor = node.getNext();
		predecessor.setNext(successor);
		successor.setPrev(predecessor);
		size--;
		E answer = node.getElement(); //get the removed
		node.setElement(null); // make everything null
		node.setNext(null);
		node.setPrev(null);
		return answer;
	}


	private class PositionIterator implements Iterator<Position<E>> {
		private Position<E> cursor = first(); //position of the next element to report
		private Position<E> recent = null; //position of the last reported element
		
		public boolean hasNext() {
			return (cursor != null);
		}
		
		public Position<E> next() throws NoSuchElementException {
			if (cursor == null) throw new NoSuchElementException("nothing left");
			recent = cursor; //element at this position might later be removed
			cursor = after(cursor);
			return recent;
		}
		
		public void remove() throws IllegalStateException {
			if (recent == null) throw new IllegalStateException("nothing to remove");
			LinkedPositionalList.this.remove(recent); //remove from the outer list
			recent = null;
		}
	}
		
		

		
		private class ElementIterator implements Iterator<E> {
			Iterator<Position<E>> posIterator = new PositionIterator();
			public boolean hasNext() {
				return posIterator.hasNext();
			}
		
			
			public E next() {
				return posIterator.next().getElement();
			}
			
			public void remove() {
				posIterator.remove();
			}
			
			
		}
		
		public Iterator<E> iterator() {
			return new ElementIterator();
		}

		@Override
		public E getElement() throws IllegalStateException {
			// TODO Auto-generated method stub
			return null;
		}


}
