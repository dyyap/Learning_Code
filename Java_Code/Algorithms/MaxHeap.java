package cs241;


public class MaxHeap<T extends Comparable<? super T>> implements MaxHeapInterface<T> 
{
	private T[] heap;
	private int lastIndex;
	private boolean initialized = false;
	private static final int DEFAULT_CAPACITY = 25;
	private static final int MAX_CAPACITY = 10000;
	public int reheapcounter;
	
	
	

	
	public MaxHeap() {
	
		this(DEFAULT_CAPACITY);
	}
	public void getreheapcounter2() {
		System.out.println("\nThe number of swaps was: " + reheapcounter);
		
		
	}
	public int getreheapcounter() {
		return reheapcounter;
	}
	public void resetreheap() {
		reheapcounter = 0;
		
	}
	
	public void readHeap() {
		System.out.println("Heap Built using optimal method:");
		for (int i = 1; i<heap.length; i++) {
			System.out.print(heap[i]+", ");
		}
		
	}
	public MaxHeap(T[] entries) {
		@SuppressWarnings("unchecked")
		T[] tempHeap = (T[]) new Comparable[entries.length +1];
		heap = tempHeap;
		lastIndex = entries.length;
		
		for (int index = 0; index < entries.length; index++) {
			heap[index+1] = entries[index];}
		for (int rootIndex = lastIndex/2; rootIndex >0; rootIndex--) {
			reheap(rootIndex);
			}
		
	}
	
	public MaxHeap(int initialCapacity)
	{
		if(initialCapacity <DEFAULT_CAPACITY)
			initialCapacity = DEFAULT_CAPACITY;
		else
			checkCapacity(initialCapacity);
	

	@SuppressWarnings("unchecked")
	T[] tempHeap = (T[]) new Comparable[initialCapacity + 1];
	heap = tempHeap;
	lastIndex = 0;
	initialized = true;
}
	@Override
	public void add(T newEntry) {
		checkInitialization();
		int newIndex = lastIndex + 1;
		int parentIndex = newIndex/2;
		while ((parentIndex > 0 ) && newEntry.compareTo(heap[parentIndex]) > 0)
				{
			heap[newIndex] = heap[parentIndex];
			newIndex = parentIndex;
			parentIndex = newIndex/2;
			
				}
		heap[newIndex] = newEntry;
		lastIndex++;
		
		
	}

	@Override
	public T removeMax() {
		T root = null;
				
		if(!isEmpty())
		{
			root = heap[1];
			heap[1] = heap[lastIndex];
			lastIndex--;
			reheap(1);
		}
		return root;
	}


	@Override
	public T getMax() {
		checkInitialization();
		T root = null;
		if(!isEmpty())
			root = heap[1];
		return root;
	}

	
	@Override
	public boolean isEmpty() {
	
		return lastIndex < 1;
	}

	
	@Override
	public int getSize() {
		
		return lastIndex;
	}


	@Override
	public void clear() {
		checkInitialization();
		while (lastIndex > -1)
		{
			heap[lastIndex] = null;
			lastIndex--;
		}
		lastIndex = 0;
		}
		
	
	private void checkInitialization()
		{
			if (!initialized)
			throw new SecurityException ("ArrayStack object is not initialized properly.");
		} // end checkInitialization

// Throws an exception if the client requests a capacity that is too large.
	private void checkCapacity(int capacity)
	{
		if (capacity > MAX_CAPACITY)
			throw new IllegalStateException("Attempt to create a stack " +
                                      "whose capacity exceeds " +
                                      "allowed maximum.");
	} // end checkCapacity

	private void reheap(int rootIndex)
	{   reheapcounter++;
		boolean done = false;
		T orphan = heap[rootIndex];
		int leftChildIndex = 2 * rootIndex;
		
		while (!done && (leftChildIndex <= lastIndex))
		{
			int largerChildIndex = leftChildIndex;
			int rightChildIndex = leftChildIndex + 1;
			if((rightChildIndex <= lastIndex) && heap[rightChildIndex].compareTo(heap[largerChildIndex]) > 0)
			{
				largerChildIndex = rightChildIndex;
				
				
			}
			
			if (orphan.compareTo(heap[largerChildIndex]) < 0)
			{
				heap[rootIndex] = heap[largerChildIndex];
				rootIndex = largerChildIndex;
				leftChildIndex = 2 * rootIndex;
			}
			else
				done = true;
		}
		heap[rootIndex] = orphan;
	}

	
	
}

