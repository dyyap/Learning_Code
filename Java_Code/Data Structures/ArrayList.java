package datastructures;

import java.util.NoSuchElementException;

public class ArrayList<E>{
	public static final int CAPACITY = 16;
	
	private E[] data;
	private int size = 0;
	
	public ArrayList() {
		this(CAPACITY);
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList(int capacity) {
		data = (E[])new Object[capacity];
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public E get(int i) throws IndexOutOfBoundsException {
		checkIndex(i, size);
		return data[i];
	}
	
	public E set(int i, E e) throws IndexOutOfBoundsException {
		checkIndex(i, size);
		E temp = data[i];
		data[i] = e;
		return temp;
	}
	
	public void add(int i, E e) throws IndexOutOfBoundsException, IllegalStateException {
		checkIndex(i, size + 1);
		if (size == data.length)
			resize(2 * data.length);
		for(int k = size -1; k >= i; k--) //shifts to the right
			data[k+1] = data[k];
		data[i] = e; // places the payload
		size++;
	}
	
	public E remove(int i) throws IndexOutOfBoundsException {
		checkIndex(i, size);
		E temp = data[i];
		for (int k = i; k < size - 1; k++) // shifts elements to fill hole
			data[k] = data[k+1];
		data[size -1] = null; // helps with garbage collection
		size--;
		return temp;
	}
	
	protected void checkIndex(int i, int n) throws IndexOutOfBoundsException {
		if (i < 0 || i >= n)
			throw new IndexOutOfBoundsException("Illegal index: " + i);
	}
	
	protected void resize(int capacity) {
		@SuppressWarnings("unchecked")
		E[] temp = (E[]) new Object[capacity];
		for(int k = 0; k < size; k++)
			temp[k] = data[k];
		data = temp;
	}
	
	//-------------nested ArrayIterator class ----------------
	private class ArrayIterator implements Iterator<E> {
		private int j = 0; //index of the next element to report
		private boolean removable = false; //can remove be called at this time
		
		public boolean hasNext() {
			return j < size;
		}

		
		public E next() throws NoSuchElementException{
			if (j == size) throw new NoSuchElementException("No next element");
			removable = true;
			return data[j++];
		}

		
		public void remove() throws IllegalStateException {
			if (!removable) throw new IllegalStateException("nothing to remove");
			ArrayList.this.remove(j-1); // that was the last on returned
			j--;
			removable = false;
			
		}
		
		
}
	
	public Iterator<E> iterator() {
		return new ArrayIterator();
	}
}
