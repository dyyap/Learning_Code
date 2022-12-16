package datastructures;

import java.util.Comparator;

public class AbstractPriorityQueue<K, V> implements PriorityQueue<K,V> {
//-----------nested PQEntry Class
	protected static class PQEntry<K,V> implements Entry<K,V> {
		private K k;
		private V v;
		public PQEntry(K key, V value) {
			k = key;
			v = value;
		}
		
		//entry interface
		public K getKey() {
			return k;
		}
		
		public V getValue() {
			return v;
		}
		
		//utilities not exposed as part of the Entry interface
		protected void setKey(K key) {
			k = key;
		}
		
		protected void setValue(V value) {
			v = value;
		}
		
	}
	
	//The comparator defining the ordering of keys in the priority queue
	private Comparator<K> comp;
	
	//Creates an empty priority queue using the given comparator to order keys
	protected AbstractPriorityQueue(Comparator<K> c) {
		comp = c;
	}
	
	//creates an empty priority queue based on the natural ordering of its keys
	protected AbstractPriorityQueue() {
		this(new DefaultComparator<K>());
	}
	//method for comparing two entries according to key
	protected int compare(Entry<K,V> a, Entry<K,V> b) {
		return comp.compare(a.getKey(), b.getKey());
	}
	
	//Determines whether a key is valid
	protected boolean checkKey(K key) throws IllegalArgumentException {
		try {
			return (comp.compare(key, key) == 0); //see if key can be compared to itself			
		} catch (ClassCastException  e) {
			throw new IllegalArgumentException("Imcompatable key");
		}
	}
	
	//Tests whether the priority queue is empty
	public boolean isEmpty() {
		return size() == 0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Entry<K, V> insert(K key, V value) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Entry<K, V> min() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Entry<K, V> removeMin() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
