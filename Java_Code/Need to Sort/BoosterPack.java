package d141;

import java.io.IOException;

public class BoosterPack {

	public void Booster(int choice) throws IOException {
		Card a = new Card();
		switch (choice) {
		case 1: a.CardLookup(choice); 
		break;
		case 2: a.CardLookup(choice); break;
		case 3: a.CardLookup(choice); break;
		case 4: a.CardLookup(choice); break;
		case 5: a.CardLookup(choice); break;
		default: System.out.println("Please enter another number");}
		
		
	}
	
	public void print() {}

}