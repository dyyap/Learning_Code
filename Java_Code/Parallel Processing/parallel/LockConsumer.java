package parallel;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockConsumer {
	
	static Queue<Integer> IntQueue = new LinkedList<>();

	public static void main(String[] args) {
		System.out.println("5 producers 2 Consumers");
		Lock lock = new ReentrantLock();
		boolean done = false;
		long startTime = System.currentTimeMillis();
		Thread[] threads = new Thread[5];
		
		for (int i = 0; i < 5; i++) {
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
		
		for (int i = 0; i < 5; i++) {
			threads[i].start();
		}
		
		System.out.println("Producers Made!");
		
		
		while(done == false) {
			
			if(IntQueue.size() > 49) {
				Thread a = new Thread(new Runnable() {
					public void run() {
				 Consumer consumer = new Consumer();
				 while(IntQueue.size() > 0)
				 {
			     lock.lock();
				 consumer.Consume(IntQueue);
				// System.out.println("Consumer 1 ate");
				 lock.unlock();
				 try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				 }
				 System.out.println("Consumer 1 Done in:" + (System.currentTimeMillis()-startTime));
			 }
		});
		
		Thread b = new Thread(new Runnable() {
			 public void run() {
				 Consumer consumer = new Consumer();
				 while(IntQueue.size() > 0) {
				 lock.lock();
				 consumer.Consume(IntQueue);
				// System.out.println("Consumer 2 ate");
				 lock.unlock();
				 try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				 }
				 System.out.println("Consumer 2 Done in:" + (System.currentTimeMillis()-startTime));
			 }
		});
		a.start();
		b.start();
		done = true;
		
		
			}
		}
		

		
		
	}
}
