package datastructures;

public class DoublyLinkedList<E> implements Deque<E> {
	//-------Nested Node class----------
	
	private static class Node<E> {
		private E element;     //data
		private Node<E> prev;  //before
		private Node<E> next;  //after
		public Node(E e, Node<E> p, Node<E> n) {
			element = e;
			prev = p;
			next = n;
		}
		public E getElement() {
			return element;
		}
		
		public Node<E> getPrev() {
			return prev;
		}
		
		public Node<E> getNext() {
			return next;
		}
		
		public void setPrev(Node<E> p) {
			prev = p;
		}
		
		public void setNext(Node<E> n) {
			next = n;
		}
	} //--------------Node--------------------
	
	private Node<E> header;  //header
	private Node<E> trailer; // tail
	private int size = 0;

	public DoublyLinkedList() {
		header = new Node<> (null, null, null);  //make a node
		trailer = new Node<> (null, header, null); // trailer is after the header
		header.setNext(trailer); // header is before the trailer
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
		return header.getNext().getElement(); //Header points to the first, get the first
	}
	
	public E last() {
		if (isEmpty())
			return null;
		return trailer.getPrev().getElement(); // The last element is before the trailer, get it
			
	}
	
	public void addFirst(E e) {
		addBetween(e, header,header.getNext()); // place after the header
	}
	
	public void addLast(E e) {
		addBetween(e, trailer.getPrev(), trailer); // place before the trailer
	}
	
	public E removeFirst() {
		if (isEmpty())
			return null;
		return remove(header.getNext()); // first element is beyond the header
	}
	
	public E removeLast() {
		if (isEmpty())
			return null;
		return remove(trailer.getPrev()); // last element is before the trailer
	}
	
	private void addBetween(E e, Node<E> predecessor, Node<E> successor) {
		Node<E> newest = new Node<>(e, predecessor, successor); // make a node and put it in the middle
		predecessor.setNext(newest);
		successor.setPrev(newest);
		size++;
	}
	
	private E remove(Node<E> node) {
		Node<E> predecessor = node.getPrev();
		Node<E> successor = node.getNext();
		predecessor.setNext(successor); //get the node before to point to the node after
		successor.setPrev(predecessor); //get the node after to point to the node before
		size--;
		return node.getElement();
	}


}
