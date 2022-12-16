package Knapsacks;
import java.util.Scanner;

public class OverhaulDriver {

	public static void main(String[] args) {
		int decision = 0;
		Scanner choice = new Scanner(System.in);
		System.out.println("Which one do you want?\n1 = fractional knapsack\n2 = 0/1 Knapsack");
		
		decision = choice.nextInt();
		
		if(decision == 1) {
			FracDriver a = new FracDriver();
			a.Start();
		}
		
		if(decision == 2) {
			OIDriver b = new OIDriver();
			b.Start();
		}
	}
}
