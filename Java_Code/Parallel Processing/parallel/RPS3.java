package parallel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.TimeUnit;



public class RPS3 {
	
	static int NameGen = 0;
	
	public static Thread[] RPSThreadMaker(int ThreadCounter) {
		System.out.println("Making Threads");
		Thread[] threads = new Thread[ThreadCounter];
				for (int i = 0; i < ThreadCounter; i++) {
					threads[i] = new Thread(new Runnable() {
						public void run() {
							RPS Handcheck = RPS.getRandHand();
							RPS.AddHandshake(Handcheck);
							RPS.AddName(NameGen);
							System.out.println("test");
							
						}
					});
				}	
				return threads;
} 
	
	static HashMap<RPS, Integer> PlayerList = new HashMap<>();
	static ArrayList<RPS> Hand = new ArrayList<RPS>();
	static ArrayList<Integer> Player = new ArrayList<>();
	
	// Synchronized
	static int Tally;
	static RPS DrawState;
	
	static class Hand {
		
		
	}
	
	enum RPS{
		ROCK, PAPER, SCISSORS;
		static Random random = new Random();
		
		public synchronized static void AddName(int Name) {
			Player.add(Name);
		}

		public void SetWinState() {
			DrawState = values()[random.nextInt(values().length)];
		}
		
		public synchronized static void AddHandshake(RPS Handcheck) {
			Hand.add(Handcheck);
		}
		
		public static RPS getRandHand() {
			return values()[random.nextInt(values().length)];
		}
		
		public static RPS Play(RPS opponent, RPS me) {
			if (me == ROCK && opponent == SCISSORS) {
				return me;
			}
			
			if (me == PAPER && opponent == SCISSORS) {
				return opponent;
			}
			
			if (me == ROCK && opponent == PAPER) {
				return opponent;
			}
			
			if (me == SCISSORS && opponent == PAPER) {
				return me;
			}
			
			if(me == PAPER && opponent == ROCK) {
				return me;
			}
			
			if(me == SCISSORS && opponent == ROCK) {
				return opponent;
				
			}
			{
				RPS.Play(ROCK, PAPER);
			}
			return me;
		}
		
		}
	
	public synchronized void Increment(int Hand) {
		if(DrawState == RPS.ROCK) {
			
		}
		
	}
	
	public static void StartAllThreads(Thread[] threads) {
		for (int i = 0; i < threads.length; i++) {
			threads[i].start();
		}
	}
	
	public static ArrayList<RPS> RPSBattle(ArrayList<RPS> playerList, int PlayerCount, Random r) {
	ArrayList<RPS> Subzero = new ArrayList<>();
	ArrayList<RPS> Scorpion = new ArrayList<>();
	ArrayList<RPS> Winners = new ArrayList<>();

	for (int i = 0; i < playerList.size()/2; i++) {
		Scorpion.add(playerList.get(r.nextInt(playerList.size())));
		Subzero.add(playerList.get(r.nextInt(playerList.size())));
	}
	for(int i = 0; i< playerList.size()/2; i++) {
		Winners.add(RPS.Play(Scorpion.get(i), Subzero.get(i)));
	}
	return Winners;
	
	
	}
	public static void main(String[] args) throws InterruptedException {
		Random r = new Random();
		ArrayList<RPS> Winner = new ArrayList<>();
		Thread[] starter;
		int PlayerCount = 8;
		starter = RPSThreadMaker(8);
		StartAllThreads(starter);
		TimeUnit.SECONDS.sleep(5);
		System.out.println(Hand.size());
		Winner = RPSBattle(Hand, PlayerCount, r);
		PlayerCount = PlayerCount/2;
		do{
		System.out.println(Winner.size());
		if(Winner.size() == 1 || Winner.size() == 0) {
			break;
		}
		Winner = RPSBattle(Winner, PlayerCount, r);
		PlayerCount = PlayerCount/2;
		
		
		}while(Winner.size() != 0);
		
		
		
		System.out.println(Winner.size());
		
		

		
		
		
		
		
		
	}
} 