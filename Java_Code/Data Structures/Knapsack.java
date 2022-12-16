package Knapsacks;

public class Knapsack {
	private int numofItems;
	private int cap;
	private int [] [] table;
	private int [] benefits;
	private int [] weights;
	private int [] values;
	private int benefit;

	public Knapsack(int numofItems, int cap, int[] weights, int[] values) {
		this.numofItems = numofItems; // number of items
		this.cap = cap; // capacity
		this.weights = weights; // weights
		this.values = values; // values
		this.table = new int[numofItems + 1][cap + 1]; // table
	}
	
	public int solve() {
		int[][] set = new int[numofItems+1][cap+1]; // creates new 2d array 
		for(int i = 0; i <= cap; i++) {
			set[0][i] = 0; // sets the first column to zero
			
		}
		
		for(int i = 1; i <= numofItems; i++) { // goes through the number of items
			for(int j = 0; j <= cap; j++) { // goes through all of the weights
				if(weights[i-1] > j) { // I don't like negatives
					set[i][j] = set[i-1][j];
				}
				else {
					
					//finds the max
					set[i][j] = Math.max(set[i-1][j], (set[i-1][j-weights[i-1]] + values[i-1]));
				}
			}
		}
		//returns the max
		return set[numofItems][cap];
	}
}
