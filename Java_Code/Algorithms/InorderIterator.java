package cs241;

public static void main(String args[]) {
	


public T remove(T entry)
{
ReturnObject oldEntry = new ReturnObject(null);
BinaryNodeInterface<T> newRoot = removeEntry(getRootNode(), entry,
oldEntry);
setRootNode(newRoot);
return oldEntry.get();
}
}