package cs241;
public class BinarySearchTree<T extends Comparable<? super T>>
extends BinaryTree<T> implements SearchTreeInterface<T>
{
	public BinarySearchTree()
	{
		super();
	}

	public BinarySearchTree(T rootEntry)
	{
		super();
		setRootNode(new BinaryNode<T>(rootEntry));
	}
	@Override
	public void setTree(T rootData)
	{
		throw new UnsupportedOperationException();
	}
	@Override
	public void setTree(T rootData, BinaryTreeInterface<T> leftTree, BinaryTreeInterface<T> rightTree) {
		throw new UnsupportedOperationException();
	}


	@Override
	public boolean contains(T entry) {
		return getEntry(entry) != null;
	}
	
	

	@Override
	public T getEntry(T entry) {
		return findEntry(getRootNode(), entry);
	}
	private T findEntry(BinaryNodeInterface<T> rootNode, T entry)
	{
		T result = null;
		if(rootNode != null)
		{
			T rootEntry = rootNode.getData();
			if (entry.equals(rootEntry))
				result = rootEntry;
			else if (entry.compareTo(rootEntry)<0)
				result = findEntry(rootNode.getLeftChild(), entry);
			else
				result = findEntry(rootNode.getRightChild(), entry);
		}
		return result;
	}
	

	
	@Override
	public T add(T newEntry) {
		T result = null;
		if (isEmpty())
	setRootNode(new BinaryNode<T>(newEntry));
		else 
	result = addEntry(getRootNode(), newEntry);
		return result;
	}


	private T addEntry(BinaryNodeInterface<T> rootNode, T newEntry) {
		assert rootNode != null;
		T result = null;
		int comparison = newEntry.compareTo(rootNode.getData());
		
		if (comparison == 0){
		result = rootNode.getData();
		rootNode.setData(newEntry);
		}
		else if (comparison < 0)
		{
			if (rootNode.hasLeftChild())
				result = addEntry(rootNode.getLeftChild(), newEntry);
			else 
				rootNode.setLeftChild(new BinaryNode<T>(newEntry));
		}
		else 
		{
			assert comparison > 0;
			if (rootNode.hasRightChild())
				result = addEntry(rootNode.getRightChild(), newEntry);
			else 
				rootNode.setRightChild(new BinaryNode<T>(newEntry));
		}return result;
	}
	// Get minimum element in binary search tree
		public BinaryNodeInterface<T> minimumElement(BinaryNodeInterface<T> root) {
			if (root.getLeftChild() == null)
				return root;
			else {
				return minimumElement(root.getLeftChild());
			}
		}
		
	
	private BinaryNodeInterface<T> findLargest(BinaryNodeInterface<T> rootNode){
	if (rootNode.hasRightChild())
		rootNode = findLargest(rootNode.getRightChild());
	
	return rootNode;

}  
	private BinaryNodeInterface<T> removeLargest(BinaryNodeInterface<T> rootNode)
	{
		if (rootNode.hasRightChild());
		{
			BinaryNodeInterface<T> rightChild = rootNode.getRightChild();
			BinaryNodeInterface<T> root = removeLargest(rightChild);
			rootNode.setRightChild(root);
		}
			rootNode = rootNode.getLeftChild();
		
		return rootNode;
	}
    public void delete(T data) {
    	 
        deleteNode(this.root, data);
    }
 
    private BinaryNodeInterface<T> deleteNode(BinaryNodeInterface<T> root, T data) {
 
        if(root == null) return root;
 
        if(data.compareTo(root.getData())< 0) {
            root.setLeftChild(deleteNode(root.getLeftChild(), data));
        } else if(data.compareTo(root.getData())> 0) {
            root.setRightChild(deleteNode(root.getRightChild(), data));
        } else {
            // node with no leaf nodes
            if(root.getLeftChild() == null && root.getRightChild() == null) {
                System.out.println("deleting "+data);
                return null;
            } else if(root.getLeftChild() == null) {
                // node with one node (no left node)
                System.out.println("deleting "+data);
                return root.getRightChild();
            } else if(root.getRightChild() == null) {
                // node with one node (no right node)
                System.out.println("deleting "+data);
                return root.getLeftChild();
            } else {
                // nodes with two nodes
                // search for min number in right sub tree
                T minValue = minValue(root.getRightChild());
                root.setData(minValue);
                root.setRightChild(deleteNode(root.getRightChild(), minValue));

            }
        }
 
        return root;
    }
 
    private T minValue(BinaryNodeInterface<T> node) {
 
        if(node.getLeftChild() != null) {
            return minValue(node.getLeftChild());
        }
        return node.getData();
    }


	@Override
	public boolean remove(int value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T remove(T entry) {
		// TODO Auto-generated method stub
		return null;
	}
}

	