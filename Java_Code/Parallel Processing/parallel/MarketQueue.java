package parallel;

import java.util.LinkedList;
import java.util.Queue;

public class MarketQueue {
	
	static Queue<Integer> IntQueue = new LinkedList<>();
	public MarketQueue() {
		Queue<Integer> Transfer = new LinkedList<>();
		IntQueue = Transfer;
	}

	public synchronized void add(int i) {
		IntQueue.add(i);
	}
	public boolean isEmpty() {
		return IntQueue.isEmpty();
	}
	public synchronized Integer poll() {
		return IntQueue.poll();
	}
	public int size() {
		return IntQueue.size();
	}
}
