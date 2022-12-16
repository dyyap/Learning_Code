package cs241;
import java.util.Iterator;

public interface TreeIteratorInterface<T> {

	public Iterator<T> getPreorderIterator();
	public Iterator<T> getPostorderIterator();
	public Iterator<T> getInorderIterator();
	public Iterator<T> getLevelorderIterator();
	boolean remove(int value);
	
}
