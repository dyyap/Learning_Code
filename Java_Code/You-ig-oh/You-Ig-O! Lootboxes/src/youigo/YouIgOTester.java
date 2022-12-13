package youigo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public final class YouIgOTester {

	private static boolean running=true;
	
	private static final Random rand= new Random();
	
	private static final ArrayList<Card> allCards=new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Preforming setup...");
		loadCards();
		ProbabilityGrid grid = new ProbabilityGrid(5, 5, "probabilites.txt");
		while(!grid.isReady()) {} //Hold while loading the grid (WILL FAIL LOUDLY)
		System.out.println("Setup complete!");
		
		do {
			int packLevel=-1;
			do {
				System.out.println("What level of Pack would you like?");
				packLevel=s.nextInt();
			}while(packLevel<=0||packLevel>5);
			
			//Minus 1 to have users see 1-5 but computer see 0-4
			BoosterPack pack = new BoosterPack(packLevel-1, rand, grid, allCards);
			
			//Open and display
			pack.print();
			
			//Go again?
			System.out.println("Would you like to try again?");
			boolean validEntry=false;
			do {
				String in = s.nextLine().toLowerCase();
				if(in.contains("y")) {
					running=true;
					validEntry=true;
				}else if(in.contains("n")) {
					running=false;
					validEntry=true;
				}
				
			}while(!validEntry);
		}while(running);
		s.close();
	}

	private static void loadCards() {
		
		try {
			final Scanner cardReader = new Scanner(new File("cards.txt"));
			//Use the pipe '|' to separate the values
			cardReader.useDelimiter("|");
			do {
				String name=cardReader.next();
				int level=cardReader.nextInt();
				double value=cardReader.nextDouble();
				
				Card c=new Card(name,level,value);
				
				allCards.add(c);
				
			}while(cardReader.hasNext());
			cardReader.close();
		} catch (FileNotFoundException e) {
			System.err.println("Could not load the list of cards!");
		}
		
	}

}
