package d141;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

public class Card { 
	

		public void CardLookup(int choice) throws IOException {
			
			Random rand = new Random();
			List<String> CardList = Files.readAllLines(Paths.get("C:/Users/bwom123/Desktop/card.txt"));
			List<String> PriceList = Files.readAllLines(Paths.get("C:/Users/bwom123/Desktop/price.txt"));
		if (choice == 1) {
			String [][] data = new String[9][9];
			
			for (int c = 0; c<9; c++) {
				int g = rand.nextInt(52);
				System.out.println(CardList.get(g) + "   -   " + PriceList.get(g));
				}
			
			}
		
		if (choice == 2) {
			for (int c = 0; c<6; c++) {
			int g = rand.nextInt(52);
			System.out.println(CardList.get(g) + "   -   " + PriceList.get(g));
			}
			for (int c = 0; c<3; c++) {
				int g = rand.nextInt(42) + 5;
				System.out.println(CardList.get(g) + "   -   " + PriceList.get(g));
				}
				
			}
		if (choice == 3) {
			for (int c = 0; c<6; c++) {
			int g = rand.nextInt(52);
			System.out.println(CardList.get(g) + "   -   " + PriceList.get(g));
			}
			for (int c = 0; c<3; c++) {
				int g = rand.nextInt(42) + 10;
				System.out.println(CardList.get(g) + "   -   " + PriceList.get(g));
				}
				
			}
		if (choice == 4) {
			int ExtraCard = rand.nextInt(32) + 20;
			for (int c = 0; c<6; c++) {
				int g = rand.nextInt(52);
				System.out.println(CardList.get(g) + "   -   " + PriceList.get(g));
				}
				for (int c = 0; c<2; c++) {
					int g = rand.nextInt(52-15) + 15;
					System.out.println(CardList.get(g) + "   -   " + PriceList.get(g));
					}
				System.out.println(CardList.get(ExtraCard) + "   -   " + PriceList.get(ExtraCard));
					
		}
		if (choice == 5) {
			for (int c = 0; c<6; c++) {
				int g = rand.nextInt(52);
				System.out.println(CardList.get(g) + "   -   " + PriceList.get(g));
				}
				for (int c = 0; c<3; c++) {
					int g = rand.nextInt(52-20) + 20;
					System.out.println(CardList.get(g) + "   -   " + PriceList.get(g));
					}
					
		}}}
			
		

	
