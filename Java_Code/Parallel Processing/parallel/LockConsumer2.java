package parallel;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockConsumer2 {
	
	static Queue<Integer> IntQueue = new LinkedList<>();

	public static void main(String[] args) {
		System.out.println("2 producers 5 Consumers");
		Lock lock = new ReentrantLock();
		boolean done = false;
		long startTime = System.currentTimeMillis();
		Thread[] threads = new Thread[5];
		
		for (int i = 0; i < 2; i++) {
			threads[i] = new Thread(new Runnable() {
				public void run() {
						Producer a = new Producer();
						Keeper keeper = new Keeper();
						lock.lock();
						while(a.getHasProduced() < 100) {
							if(keeper.size() < 10) {
								keeper.add(a.Increment());
								IntQueue.add(keeper.poll());
							}	
							
						}
						lock.unlock();
					}
				});
		}
		
		for (int i = 0; i < 2; i++) {
			threads[i].start();
		}
		
		System.out.println("Producers Made!");
		
		
		while(done == false) {
			if(IntQueue.size() > 19) {
		Thread a = new Thread(new Runnable() {
			 public void run() {
				 Consumer consumer = new Consumer();
				 while(IntQueue.size() > 0)
				 {
			     lock.lock();
				 consumer.Consume(IntQueue);
				 lock.unlock();
				 }
				 try {
						Thread.sleep(1000
								);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				 
				 System.out.println("Consumer 1 Done in: " + (System.currentTimeMillis()-startTime));
			 }
		});
		
		Thread b = new Thread(new Runnable() {
			 public void run() {
				 Consumer consumer = new Consumer();
				 while(IntQueue.size() > 0) {
				 lock.lock();
				 consumer.Consume(IntQueue);
				 lock.unlock();
				 try {
						Thread.sleep(1000
								);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				 
				 }
				 System.out.println("Consumer 2 Done in: " + (System.currentTimeMillis()-startTime));
			 }
		});
		Thread c = new Thread(new Runnable() {
			 public void run() {
				 Consumer consumer = new Consumer();
				 while(IntQueue.size() > 0)
				 {
			     lock.lock();
				 consumer.Consume(IntQueue);
				 lock.unlock();
				 try {
						Thread.sleep(1000
								);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				 }
				 System.out.println("Consumer 3 Done in: " + (System.currentTimeMillis()-startTime));
			 }
		});
		
		Thread d = new Thread(new Runnable() {
			 public void run() {
				 Consumer consumer = new Consumer();
				 while(IntQueue.size() > 0) {
				 lock.lock();
				 consumer.Consume(IntQueue);
				 lock.unlock();
				 try {
						Thread.sleep(1000
								);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				 
				 }
				 System.out.println("Consumer 4 Done in: " + (System.currentTimeMillis()-startTime));
			 }
		});
		Thread e = new Thread(new Runnable() {
			 public void run() {
				 Consumer consumer = new Consumer();
				 while(IntQueue.size() > 0) {
				 lock.lock();
				 consumer.Consume(IntQueue);
				 lock.unlock();
				 try {
						Thread.sleep(1000
								);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				 
				 }
				 System.out.println("Consumer 5 Done in: " + (System.currentTimeMillis()-startTime));
			 }
		});
		a.start();
		b.start();
		c.start();
		d.start();
		e.start();
		done = true;
		
			}
		}

		
		
	}
}
