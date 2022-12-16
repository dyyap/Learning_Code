package datastructures;

public class SinglyLinkedList<E> {
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
		
		private Node<E> head = null;
		private Node<E> tail = null;
		private int size = 0;
		public SinglyLinkedList() {
			
		}
		
		public int size() {
			return size; // return size
	}
		
		public boolean isEmpty() {
			return size == 0; // true if empty
		}
		
		public E first() {
			if (isEmpty())
				return null;
			return head.getElement(); // first on the stack
		}
		
		public E last() {
			if (isEmpty())
				return null;
			return tail.getElement(); // last on the stack
		}
		
		public void addFirst(E e) {
			head = new Node<>(e, head); // puts the element to the front of the list
			if (size == 0)
				tail = head; // if it is the only it is the first and the last
			size++;
		}
		
		public void addLast(E e) {
			Node<E> newest = new Node<>(e, null);
			if (isEmpty())
				head = newest; // the node is the first if it is empty
			else
				tail.setNext(newest); // tails adds a node after itself
			tail = newest; // the node is the new tail
			size++;
		}
		
		public E removeFirst() {
			if (isEmpty()) 
				return null;
			E answer = head.getElement(); // get the head
			head = head.getNext(); // second is the first
			size--;
			if (size == 0)
				tail = null; // it is empty
			return answer;
		}
		

}
