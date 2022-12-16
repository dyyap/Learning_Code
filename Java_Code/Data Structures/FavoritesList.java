package datastructures;

/** Maintains a list of elements ordered according to access frequency */
public class FavoritesList<E> {
	
	protected static class Item<E> {
		private E value;
		private int count = 0;
		
		// constructs new item with initial count of zero
		public Item(E val) {
			value = val;
		}
		
		public int getCount() {
			return count;
		}
		
		public E getValue() {
			return value;
		}
		
		public void increment() {
			count++;
		}
	}
	
	PositionalList<Item<E>> list = new LinkedPositionalList<>();
	public FavoritesList() {};
	
	protected E value(Position<Item<E>> p) {
		return p.getElement().getValue();
	}
	
	protected int count(Position<Item<E>> p) {
		return p.getElement().getCount();
	}
	
	protected Position<Item<E>> findPosition(E e) {
		Position<Item<E>> walk = list.first();
		while (walk != null && !e.equals(value(walk)))
			walk = list.after(walk);
		return walk;
	}
	
	protected void moveUp(Position<Item<E>> p) {
		int cnt = count(p);
		Position<Item<E>> walk = p;
		while(walk != list.first() && count(list.before(walk)) < cnt)
			walk = list.before(walk);
		if (walk != p)
			list.addBefore(walk, list.remove(p));
		
	}
	
	public int size() {
		return list.size();
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	public void access(E e) {
		Position<Item<E>> p = findPosition(e); // try to locate existing element
		if (p == null)
			p = list.addLast(new Item<E>(e)); // if new, place at end
		p.getElement().increment(); // always increment count
		moveUp(p); // consider moving forward
	}
	
	public void remove(E e) {
		Position<Item<E>> p = findPosition(e); // 
		if (p != null);
		list.remove(p);
	}
	
	@SuppressWarnings("unchecked")
	public Iterable<E> getFavorites(int k) throws IllegalArgumentException {
		if( k < 0 || k > size())
			throw new IllegalArgumentException("Invalid k");
		PositionalList<E> result = new LinkedPositionalList<>();
		java.util.Iterator<Item<E>> iter = list.iterator();
		for(int j = 0; j < k; j++) 
			result.addLast(iter.next().getValue());
		return (Iterable<E>) result;
	}

}
