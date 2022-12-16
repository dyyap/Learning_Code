package cs241;
import java.util.Scanner;


public class Heap_Driver {

private static int sum;
private static int sum2;
private static String j; 
	public static int genRandom() {
	    // generate random int value between 1 and 1000
	    int random = 1 + (int) (Math.random() * ((1000 - 1) + 1));
	    return random;
	}

	@SuppressWarnings("unused")
	public static boolean containsDuplicates(int[] arr) {
	    // check to see if positions have matching values
		for (int i = 0; i <100; i++) {
			for (int j = 0; j < 100; j++) {
				if (arr[i] == arr[j]){
	        shuffle(arr);}
			}
	        return true;
	    }
	  
	    return false;
	}

	public static void shuffle(int[] arr) {
	    for (int i = 0; i < arr.length; i++) {
	        arr[i] = genRandom();
	    }
	}


	public static void main(String args[])
	{
		System.out.println("Please select how to test the program:\n(1) 20 sets of 100 randomly generated integers\n(2) Fixed integer values 1-100\nEnter choice:");
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int[] alpha = new int[10];
		for(int j=0;j<10;j++) {
			int[] mixer = new int[100];
			Integer[] mixer2 = new Integer[100];
				if (d == 1) {
					BinaryMaxHeap2 F = new BinaryMaxHeap2();
					F.SetSize(100);
						for (int i = 0; i<100; i++) {
								mixer[i] = genRandom();
								containsDuplicates(mixer);
									}
							for (int i = 0; i<100; i++) {
									mixer2[i] = mixer[i];
									int e = mixer[i];
									F.insert(e);
								}
			
			
			MaxHeap<Integer> E = new MaxHeap<Integer>(mixer2);
			alpha[j] = E.getreheapcounter();
			sum2 = F.getSwapCounter();
			
			for (int i = 0; i<10;i++) {
				 sum += alpha[i];
			}
			
				
			}
		}System.out.println("The number of swaps for the optimal method is " + sum/10);
		 System.out.println("The number of swaps for the optimal method is " + sum2);
			
			
		if (d == 2) {
			Integer[] heap = new Integer[100];
			BinaryMaxHeap2 F = new BinaryMaxHeap2();
			F.SetSize(100);
			for (int i = 0; i<100; i++) {
				
				heap[i] = i+1;
					}
			for (int i = 0; i<100; i++) {
				F.insert(i+1);
			}
			
			F.readHeap();
			System.out.println("\nNumber of swaps is: " + F.getSwapCounter());
			
			for(int j = 0; j<10; j++) {
				F.removeMax();
			}
			F.readHeap();
			
			System.out.println("\n\n");
			MaxHeap<Integer> E = new MaxHeap<Integer>(heap);
			E.readHeap();
			E.getreheapcounter2();
			for(int j = 0; j<10; j++) {
				
				E.removeMax();
			}
			E.readHeap();
		
			
		}
		
		
	}
}
