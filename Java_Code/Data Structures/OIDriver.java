package Knapsacks;

import java.util.Scanner;

public class OIDriver {
	

	static int capacity = 0;
	static int size = 0;
	
	public void Start() {
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("What is your Capacity");
	capacity = scanner.nextInt();
	System.out.println("How many objects do you have");
	
	size = scanner.nextInt();
	int[] weight = new int[size];
	int[] values = new int[size];

	System.out.println("Please tell me your weights");
	for(int i = 0; i < size; i++) {
		weight[i] = scanner.nextInt();
	}
	
	System.out.println("Please tell me your values");
	for(int i = 0; i< size; i++) {
		values[i] = scanner.nextInt();
	}
	
	Knapsack a = new Knapsack(size, capacity, weight, values); // loads in everything

	
	System.out.println("This is maximum Profit: " + a.solve());

	
}

}
