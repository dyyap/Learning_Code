package datastructures;

public class ArrayQueue<E> implements Queue<E>{
	public static final int CAPACITY = 1000; // Default
	private E[] data; // generic array
	private int f = 0; // index of the front element
	private int sz = 0; // current number of elements
	
	public ArrayQueue() {
		this(CAPACITY);
	}
	
	@SuppressWarnings("unchecked")
	public ArrayQueue(int capacity) {
		data = (E[])new Object[capacity];
	}
	
	public int size() {
		return sz;
	}
	
	public boolean isEmpty() {
		return (sz == 0);
		
	}
	
	public void enqueue(E e) throws IllegalStateException {
		if (sz == data.length) throw new IllegalStateException("Queue is full");
		int avail = (f + sz) % data.length;
		data[avail] = e;
		sz++;
	}
	
	public E first() {
		if(isEmpty())
			return null;
		return data[f];
	}
	
	public E dequeue() {
		if (isEmpty())
			return null;
		E answer = data[f];
		data[f] = null;
		f = (f  + 1) % data.length;
		sz--;
		return answer;
	}

}
