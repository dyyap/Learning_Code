package d141;

import java.io.IOException;
import java.util.Scanner;

public final class YouIgO {

	private static boolean running=true;
	
	public static void main(String[] args) throws IOException {
		Scanner sc =  new Scanner(System.in);
		BoosterPack a = new BoosterPack();
		do {
		//What level to buy?
			System.out.println("What Level do you want to puchase?");
			int choice = sc.nextInt();
			a.Booster(choice);
	
		
		//Do you want to do again?
		}while(running);
	
	}

		
	}


