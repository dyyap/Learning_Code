package parallel;

import java.util.ArrayList;
import java.util.Random;

public class RockPaperScissors {
	static int ThreadCountBuffer = 0;
	static int ThreadCount = 500;
	
	static ArrayList<RPS> Hand = new ArrayList<RPS>();
	static Thread[] threadglobal;
	
	// memoization
	
	static RPS LoseState;
	
	enum RPS{
		ROCK, PAPER, SCISSORS;
		static Random random = new Random();

		public static void SetWinState() {
			LoseState = values()[random.nextInt(values().length)];
		}
		
		public synchronized static void Done() {
			ThreadCountBuffer++;
		}
		
		
		public synchronized static RPS getRandHand() {
			RPS hand = values()[random.nextInt(values().length)];
			return hand;
		}
		
		}

	public static void WaitAll(Thread[] thread2) throws InterruptedException {
		for (int i = 0; i < thread2.length; i++) {
			thread2[i].interrupt();
	}
	}
		
	public static Thread[] RPSThreadMaker(int ThreadCounter) throws InterruptedException {
		Thread[] threads = new Thread[ThreadCounter];
				for (int i = 0; i < ThreadCounter; i++) {
					threads[i] = new Thread(new Runnable() {
						public void run() {
							{
							RPS Handcheck = RPS.getRandHand();
							Hand.add(Handcheck);
							}
							
							}
						
							
						});
				}
				
				
		for(int i = 0; i < ThreadCounter; i++) {
			threads[i].start();
		}
		
		return threads;
	}

	public static void main(String[] args) throws InterruptedException {
		
		ThreadCountBuffer = 10;
		ArrayList<Integer> Loser = new ArrayList<Integer>();
		Random r = new Random();
	
	 
		Thread WinThread = new Thread(new Runnable() {
		
				public void run() {
					while(true) {
							if(Hand.size() == ThreadCountBuffer) {
								for(int i = 0; i < ThreadCountBuffer; i++) {
									if(Hand.get(i) == LoseState) {
										Loser.add((i));
									}
								 }
							System.out.println("Player Eliminated");
							Hand.clear();
							threadglobal[Loser.get(r.nextInt(Loser.size()))].interrupt();
						    
						      }    
					      }
				      }
		         });

		
		for(int i = ThreadCountBuffer; i > 0 ; i--) {
			RPS.SetWinState();
			threadglobal = RPSThreadMaker(i);
			WinThread.start();
			WaitAll(threadglobal);
			Thread.sleep(100);
		}
	
		
	} 
		
		 }
		
	



