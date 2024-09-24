package Algorithms;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bbknapsack 
{
	static class Item 
	{
		double weight; // How it's sorted
		int value; // What we want
		
		public Item(double a, int b) 
		{
			this.weight = a;
			this.value = b;
		}	
	}
	
	public static class Node
	{
		int Profit, Level, Bound;
		double weight;
	}
	
	static int Bound(Node node, int number, int Weight, Item[] items) 
	{
		if(node.weight > Weight)
		{
			return 0;  //I cannot carry it in my knapsack
		}

		int Profit = node.Profit; // grab the profit of the item
		int Level = node.Level + 1; //start at 1 not zero
		double NodeWeight = node.weight; //grab the weight
		
		while((Level < number) && NodeWeight + items[Level].weight <= Weight) 
		{
			// I have stuff left and I can still carry things
			NodeWeight += items[Level].weight; //carry the weight
			Profit += items[Level].value;//add my profits
			Level++; //go to the next level
		}
				
		if(Level < number) 
		{		// if I have extra
			Profit += (Weight - NodeWeight) * items[Level].value/items[Level].weight; //add the rest
		}
		return Profit; // return everything profitted
	}
	
	static int knapsack(Item[] items, int number, int Weight)
	{
		Queue<Node> NodeQueue = new LinkedList<>();
		Node a = new Node(), b = new Node(); // place holders for references
		
		//create the header node
		a.Level = -1;
		a.Profit = 0;
		a.weight = 0;
		int ALLDAPROFITS = 0;

		while(!NodeQueue.isEmpty())
		{
			b = NodeQueue.peek();
			NodeQueue.poll();
			
			//If it is the header
			if(a.Level == -1)
			{
				b.Level = 0;
			}

			b.Level = a.Level + 1; //Increment and traverse
			b.weight = a.weight + items[a.Level].weight; //add the weights at the level that we are at
			b.Profit = a.Profit + items[a.Level].value; // add the profits and travers
			
			if(b.weight <= Weight && b.Profit > ALLDAPROFITS)
			{
				ALLDAPROFITS = b.Profit; // If i have room and the money won't weigh me down add up
			}

			b.Bound = Bound(b, number, Weight, items); // get the upper bound
			if (b.Bound > ALLDAPROFITS) 
			{
				NodeQueue.add(b); // add if I can add it
			}
			
			b.Profit = a.Profit;
			b.weight = a.weight; // check the child
			b.Bound = Bound(b, number, Weight, items);
			if(b.Bound > ALLDAPROFITS)
			{
				NodeQueue.add(b);
			}
		}
		return ALLDAPROFITS;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input Weight");
		int Weight = sc.nextInt();
		Item a = new Item(1,10);
		Item b = new Item(2,20);
		Item c = new Item(3,30);
		Item d = new Item(4,40);
		Item e = new Item(5,50);
 		Item[] alpha = new Item[] {a,b,c,d,e};
		System.out.println(knapsack(alpha, alpha.length, Weight));
	}
	
}

