package parallel;

import java.util.LinkedList;
import java.util.Queue;

public class Keeper {

	static Queue<Integer> KeeperQueue;
	public Keeper() {
		Queue<Integer> KeeperQueue1 = new LinkedList<>();
		KeeperQueue = KeeperQueue1;
	}
	
	public int size() {
		return KeeperQueue.size();
	}
	
	public void add(int a) {
		KeeperQueue.add(a);
	}
	
	
	public  Integer poll() {
		return KeeperQueue.poll();
	}

	public  synchronized Integer Synchronizedpoll() {
		return KeeperQueue.poll();
	}
	public synchronized void Synchronizedadd(int a) {
		KeeperQueue.add(a);
	}
}
