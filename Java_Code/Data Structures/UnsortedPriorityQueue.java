package datastructures;

import java.util.Comparator;

public class UnsortedPriorityQueue<K,V> extends AbstractPriorityQueue<K,V> {
	//primary collection of priority queue entries
	private PositionalList<Entry<K,V>> list = new LinkedPositionalList<>();
	
	//creates an empty priority queue based on the natural ordering of its keys
	public UnsortedPriorityQueue() {
		super();
	}
	
	//Creates an empty priority queue using the given comparator to order keys
	public UnsortedPriorityQueue(Comparator<K> comp) {
		super(comp);
	}
	
	//Returns the Position of an entry having minimal key
	private Position<Entry<K,V>> findMin() {
		Position<Entry<K,V>> small = list.first();
		for(Position<Entry<K,V>> walk : list.positions())
			if (compare(walk.getElement(), small.getElement()) < 0)
				small = walk;
		return small;
	}
	
	//insets a key-value pair and returns the entry created
	public Entry<K,V> insert(K key, V value) throws IllegalArgumentException {
		checkKey(key);
		Entry<K,V> newest = new PQEntry<>(key,value);
		list.addLast(newest);
		return newest;
	}
	
	//Returns (but does not remove) an entry with minimal key
	public Entry<K,V> min() {
		if (list.isEmpty())
			return null;
		return findMin().getElement();
		}
	
	public int size() {
		return list.size();
	}
	
	}
