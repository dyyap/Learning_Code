package datastructures;

public class CircularlyLinkedList<E> { 
	// ---------------nested NODE class ----
	private static class Node<E> {
		private E element;
		private Node<E> next;
		public Node(E e, Node<E> n) {
			// This is a Node
			element = e;
			next = n;
		}
		
		public E getElement() {
			return element;
		}
		
		public Node<E> getNext() {
			return next;
		}
		
		public void setNext(Node<E> n) {
			next = n;
		}
	}
	// -----------------Node--------------

	private Node<E> tail = null; // store tail not head
	private int size = 0;
	public CircularlyLinkedList() {
		//makes an empty list
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public E first() {
		if (isEmpty())
			return null;
		return tail.getNext().getElement(); //The head is after the tail cuz its a circle
	}
	
	public E last() {
		if (isEmpty())
			return null;
		return tail.getElement();
	}
	
	public void rotate() {
		if (tail != null)
			tail = tail.getNext();
	}
	
	public void addFirst(E e) {
		if (size == 0) {
			tail = new Node<>(e, null);
			tail.setNext(tail); //links to itself
	}
		else {
			Node<E> newest = new Node<>(e,tail.getNext()); //make a node
			tail.setNext(newest); //link it
		}
		size++;
}
	public void addLast(E e) {
		addFirst(e); //its circular goes to the front
		tail = tail.getNext(); //now the element becomes the tail
	}
	
	public E removeFirst() {
		if (isEmpty()) // is empty
			return null;
		Node <E> head = tail.getNext(); //Gets the front
		if (head == tail) 
			tail = null; // if it is one node, remove the one node
		else
			tail.setNext(head.getNext()); // tells the tail to skip the front and point to second
		size--;
		return head.getElement();
	}
	
}
