package datastructures;

public class LinkedBinaryTree<E> extends AbstractBinaryTree<E>{
	
	protected static class Node<E> implements Position<E> {
		private E element; //element stored at the node
		private Node<E> parent; //points to the parent
		private Node<E> left; //points at the left child
		private Node<E> right; //points at the right child
		
		//Constructs a node with the given element and neighbors
		public Node(E e, Node<E> above, Node<E> leftChild, Node<E> rightChild) {
			element = e;
			parent = above;
			left = leftChild;
			right = rightChild;
		}
		
		//getters methods
		public E getElement() {
			return element;
		}
		
		public Node<E> getParent() {
			return parent;
		}
		
		public Node<E> getLeft() {
			return left;
		}
		
		public Node<E> getRight() {
			return right;
		}
		
		//setters
		public void setElement(E e) {
			element = e;
		}
		
		public void setParent(Node<E> parentNode) {
			parent = parentNode;
		}
		
		public void setLeft(Node<E> leftChild) {
			left = leftChild;
		}
		
		public void setRight(Node<E> rightChild) {
			right = rightChild;
		}
				
	} //------------------end node class------------
	
	protected Node<E> createNode(E e, Node<E> parent, Node<E> left, Node<E> right) {
		return new Node<E> (e, parent, left, right);
	}
	
	//LinkedBinaryTree
	protected Node<E> root = null; //root of the tree
	private int size = 0; // number of nodes in the tree
	
	//constructor
	public LinkedBinaryTree() {} // makes an empty binary tree
	
	protected Node<E> validate(Position<E> p) throws IllegalArgumentException {
		if(!(p instanceof Node))
			throw new IllegalArgumentException("Not valid position type");
		Node<E> node = (Node<E>) p;
		if(node.getParent() == node)
			throw new IllegalArgumentException("p is no longer in the tree");
		return node;
	}
	
	//getters not already in the AbstractBinaryTree
	public int size() {
		return size;
	}
	
	public Position<E> root() {
		return root;
	}
	
	public Position<E> parent(Position<E> p) throws IllegalArgumentException {
		Node<E> node = validate(p); //gets the position and returns the node at that spot
		return node.getParent(); // gets the parent
	}
	
	public Position<E> left(Position<E> p) throws IllegalArgumentException {
		Node<E> node = validate(p); //gets the node at that position;
		return node.getLeft(); //gets the left
	}
	
	public Position<E> right(Position<E> p) throws IllegalArgumentException {
		Node<E> node = validate(p); //gets the node at that position
		return node.getRight(); // gets the right
	}
	
	//setters
	public Position<E> addRoot(E e) throws IllegalStateException {
		if(!isEmpty()) throw new IllegalStateException("Tree is not empty");
		root= createNode(e,null,null,null);
		size = 1;
		return root;
	}
	
	public Position<E> addLeft(Position<E> p, E e) throws IllegalArgumentException {
		Node<E> parent = validate(p);
		if (parent.getLeft() != null)
			throw new IllegalArgumentException("P alread has a left child");
		Node<E> child = createNode(e, parent, null, null);
		parent.setLeft(child);
		size++;
		return child;
	}
	
	public Position<E> addRight(Position<E> p, E e) throws IllegalArgumentException {
		Node<E> parent = validate(p);
		if (parent.getRight() != null)
			throw new IllegalArgumentException("p already has a right child");
		Node<E> child = createNode(e, parent, null, null);
		parent.setRight(child);
		size++;
		return child;
}
	public E set(Position<E> p, E e) throws IllegalArgumentException {
		Node<E> node = validate(p);
		E temp = node.getElement();
		node.setElement(e);
		return temp;
	}
	
	//attaches trees t1 and t2 as left and right subtrees of external p
	
	public void attach(Position<E> p, LinkedBinaryTree<E> t1, LinkedBinaryTree<E> t2) throws IllegalArgumentException {
		Node<E> node = validate(p); // get the position of the node that you want
		if (isInternal(p)) 
			throw new IllegalArgumentException("P nust be a leaf");
		if(!t1.isEmpty()) { // if the tree exists
			t1.root.setParent(node); //make the node the parent
			node.setLeft(t1.root);; //make the node point to the tree
			t1.root = null; //root is not a root anymore
			t1.size = 0; //bigger tree
		}
		if(!t2.isEmpty()) { // if the tree exists
			t2.root.setParent(node); //make the node the parent
			node.setLeft(t2.root);; //make the node point to the tree
			t2.root = null; //root is not a root anymore
			t2.size = 0; //bigger tree
		}
	}
	
	//Removes the node at Position p and replaces it with its child, if any
	public E remove(Position<E> p) throws IllegalArgumentException {
		Node<E> node = validate(p);
		if (numChildren(p) == 2) 
			throw new IllegalArgumentException("P has two kids");
		Node<E> child = (node.getLeft() != null ? node.getLeft() : node.getRight() ); //get its child
		if (child != null)
			child.setParent(node.getParent()); //skips to the grandparent
		if (node == root)
			root = child;
		else {
			Node<E> parent = node.getParent();
			if (node == parent.getLeft()) // if the parent points left and the node is there
				parent.setLeft(child); // validate and send the node back
			else
				parent.setRight(child); // else make it the right child
			
		}
		size--;
		E temp = node.getElement();
		node.setElement(null);
		node.setRight(null);
		node.setLeft(null);
		node.setParent(node);
		return temp;
		
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Position<E>> positions() {
		// TODO Auto-generated method stub
		return null;
	}
} 
