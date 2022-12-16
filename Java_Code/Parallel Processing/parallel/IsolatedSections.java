package parallel;



public class IsolatedSections {
	
	
	
	public static void main(String[] args) {
		
		MarketQueue IntQueue = new MarketQueue();
		boolean done = false;
        long startTime = System.currentTimeMillis();
		Thread[] threads = new Thread[5];
		
		for (int i = 0; i < 2; i++) {
			threads[i] = new Thread(new Runnable() {
				public void run() {
						Producer a = new Producer();
						Keeper keeper = new Keeper();
						while(a.getHasProduced() < 100) {
							if(keeper.size() < 10) {
								keeper.add(a.Increment());
								IntQueue.add(keeper.poll());
								try {
									Thread.sleep(20);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}	
							}
					}
				});
		}
		
		for (int i = 0; i < 2; i++) {
			threads[i].start();
		}
		
		System.out.println("Producers Made!");
		
		
		while(done == false) {
			System.out.println(IntQueue.size());
			if(IntQueue.size() > 19) {
		Thread a = new Thread(new Runnable() {
			 public void run() {
				 while(IntQueue.size() > 0)
				 {
				 IntQueue.poll();
				 System.out.println("Consumer 1 ate");
				 try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				 } 
				 System.out.println("Consumer 1 Done in: " + (System.currentTimeMillis()-startTime));
			 }
		});
		
		Thread b = new Thread(new Runnable() {
			 public void run() {
				 while(IntQueue.size() > 0) {
			     IntQueue.poll();
				 System.out.println("Consumer 2 ate");

				 try {
						Thread.sleep(1000);
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
				
				 while(IntQueue.size() > 0)
				 {

			     IntQueue.poll();
				 System.out.println("Consumer 3 ate");
				 try {
						Thread.sleep(1000);
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
				
				 while(IntQueue.size() > 0) {
			     IntQueue.poll();
			     System.out.println("Consumer 4 ate");
				 try {
						Thread.sleep(1000);
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
				 IntQueue.poll();
				 while(IntQueue.size() > 0) {

			     System.out.println("Consumer 5 ate");
				 try {
						Thread.sleep(1000);
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
