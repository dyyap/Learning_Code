package cs241;

import java.util.Iterator;

public class BinaryTree<T> implements BinaryTreeInterface<T>{
	protected BinaryNodeInterface<T> root;
	public BinaryTree()
	{
		root = null;
	}
	
	public BinaryTree(T rootData) {
		root = new BinaryNode<T>(rootData);
	}
	public BinaryTree(T rootData, BinaryTree<T> leftTree, BinaryTree<T> rightTree)
	{
		privateSetTree(rootData, leftTree, rightTree);
	}
	@Override
	public void setTree(T rootData)
	{
		root = new BinaryNode<T>(rootData);
		
	}

	@Override
	public void setTree(T rootData, BinaryTreeInterface<T> leftTree, BinaryTreeInterface<T> rightTree)
	{
		privateSetTree(rootData, (BinaryTree<T>) leftTree, (BinaryTree<T>)rightTree);
	}
	private void privateSetTree(T rootData, BinaryTree<T> leftTree, BinaryTree<T> rightTree)
	{
		root = new BinaryNode<T>(rootData);
		if ((leftTree != null) && !leftTree.isEmpty())
			root.setLeftChild(leftTree.root.copy());
		if ((rightTree != null) && !rightTree.isEmpty())
			root.setRightChild(rightTree.root.copy());
	}


	@Override
	public T getRootData() {
		T rootData = null;
		
		if (root != null)
			rootData = root.getData();
		return rootData;
	}
	protected void setRootData(T rootData)
	{
	root.setData(rootData);
	}
	
	protected void setRootNode(BinaryNodeInterface<T> rootNode) {
		root = rootNode;
	}
	protected void setRootNode(BinaryNode<T> rootNode) {
		root = rootNode;
	}
	protected BinaryNodeInterface<T> getRootNode(){
		return root;
	}
	@Override
	public int getHeight() {
		
			return root.getHeight();
		}
	


	@Override
	public int getNumberofNodes() {
		 return root.getNumberOfNodes();
	}


	@Override
	public boolean isEmpty() {
	 return root == null;
	}


	@Override
	public void clear() {
		root = null;
		
	}
	
	public void inorderTraverse()
	{
		inorderTraverse(root);
	}
	protected void inorderTraverse(BinaryNodeInterface<T> node)
	{
		if (node != null)
		{
			inorderTraverse(node.getLeftChild());
			System.out.print(node.getData() + " ");
			inorderTraverse(node.getRightChild());
		}
	}
	public void getSuccessor(T entry) {
		getSuccessor(root, entry);
	}

	protected void getSuccessor(BinaryNodeInterface<T> node, T entry)
	{
		if (node != null)
		{
			
			getSuccessor(node.getLeftChild(), entry);
			getSuccessor(node.getRightChild(), entry);
		
		if (node.equals(entry))
		{
			if (node.hasRightChild()){
				System.out.println(node.getRightChild());
				
			}
			
		}}
		}
	
	
	public void preorderTraverse()
	{
		preorderTraverse(root);
	}
	private void preorderTraverse(BinaryNodeInterface<T> node)
	{
		if (node != null)
		{
			System.out.print(node.getData() + " ");
			preorderTraverse(node.getLeftChild());
			preorderTraverse(node.getRightChild());
		}
	}
	public void postorderTraverse()
	{
		postorderTraverse(root);
	}
	private void postorderTraverse(BinaryNodeInterface<T> node)
	{
		if (node != null)
		{
			
			postorderTraverse(node.getLeftChild());
			postorderTraverse(node.getRightChild());
			System.out.print(node.getData() + " ");
		}
	}
	@Override
	public Iterator<T> getInorderIterator() {
	return null;
	}

	@Override
	public Iterator<T> getLevelorderIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<T> getPreorderIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<T> getPostorderIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(int value) {
		// TODO Auto-generated method stub
		return false;
	}
}
 

