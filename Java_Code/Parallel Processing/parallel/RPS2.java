package parallel;
import java.util.ArrayList;
import java.util.Random;

public class RPS2 {

		static ArrayList<RPS> Hand = new ArrayList<RPS>();
		
		// Synchronized
		static int Tally;
		static RPS DrawState;
		
		static class Hand {
			
			
		}
		
		enum RPS{
			ROCK, PAPER, SCISSORS;
			static Random random = new Random();

			public void SetWinState() {
				DrawState = values()[random.nextInt(values().length)];
			}
			
			public static RPS getRandHand() {
				return values()[random.nextInt(values().length)];
			}
			
			
			}
		
		public synchronized void Increment(int Hand) {
			if(DrawState == RPS.ROCK) {
				
			}
			
		}
		public static void RPSThreadMaker(int ThreadCounter) {
			 
			Thread[] threads = new Thread[ThreadCounter];
					for (int i = 1; i < ThreadCounter; i++) {
						threads[i] = new Thread(new Runnable() {
							public void run() {
								RPS Handcheck = RPS.getRandHand();
								Hand.add(Handcheck);
								
							}
						});
					}
					
			for(int i = 0; i < ThreadCounter; i++) {
				threads[i].start();
			}
		}
		public static void main(String[] args) {
			int ThreadCount = 50000;
			ArrayList<Integer> Loser = new ArrayList<Integer>();
			Random r = new Random();
			
		
		 
			Thread WinThread = new Thread(new Runnable() {
					public void run() {
						while(true) {
								if(Hand.size() == ThreadCount) {
									for(int i = 0; i < ThreadCount; i++) {
										if(Hand.get(i) == DrawState) {
											Loser.add((i));
										}
									 }
							      }    
						      }
					      }
			         });

			WinThread.start();
			RPSThreadMaker(ThreadCount);
			
			
		} 
			
			 }


