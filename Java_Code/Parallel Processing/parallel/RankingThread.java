package parallel;


import java.lang.Runnable;
import java.util.Random;
import java.util.HashMap; 



public class RankingThread {
	final static StringBuilder s = new StringBuilder();
	static int maxRank = 0;
	static int RankStater = 0;
	
	
	static class Official {
		final String Name;
		final int rank;
		
		public Official(String Name, int rank) {
			this.Name = Name;
			this.rank = rank;
			
		}
		
		public synchronized void StateSelf() {
			System.out.println("My name is " + Name + " my rank is " + rank + " and I am the leader ");
		}
		
		public String ReturnName() {
			return this.Name;
		}
		
		public int ReturnRank() {
			return this.rank;
		}

		
	}
	
	static class Ranker {
		
		public synchronized void Rank(HashMap<Integer, String> O) {
			if (RankStater > maxRank) {
				maxRank = RankStater;
				System.out.println("Excuse me but " + O.get(maxRank) + " is the leader"); 
			}
			
			
		}
		
	}
	
	public static String Name() {
		s.append("a");
		return s.toString();		
	}
	
	
	public static void main(String[] args) {
		final Random r = new Random();
		int ThreadCount;	ThreadCount = r.nextInt(100) + 1;
		Thread[] threads = new Thread[ThreadCount];
		HashMap<Integer, String> OfficialList = new HashMap<>();
		Ranker s = new Ranker();
		
	
	 for (int i = 0; i < ThreadCount; i++) {
		 
	     threads[i] = new Thread(new Runnable() {
	         public void run() {
	        	 Official O = new Official(Name(), r.nextInt()); // creates officials
	        	 OfficialList.put(O.ReturnRank(), O.ReturnName());
	        	 O.StateSelf();
	        	 RankStater = O.ReturnRank();
	        		 try {
	                     Thread.sleep(5000);
	        		 } catch (InterruptedException ie) {
	                     Thread.currentThread().interrupt();
	                 }  
	         }
	     });
	     
	     Thread ranker= new Thread(new Runnable() {
	         public void run() {
	        	 while(true) {
	        		 s.Rank(OfficialList);
	        	 }    
	         }
	     });
	     ranker.start();
	     threads[i].start();
	 }
	}
}


