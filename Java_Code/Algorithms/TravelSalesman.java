package Algorithms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class TravelSalesman {
	static int shortest = 10000000;
	static int[] pathF;
	static boolean[] Visited;
	public static void Travel(int Number) {
		Visited = new boolean[Number];
		pathF = new int[Number+1]; // need to figure out how long my final path is
	}
	static int FirstMinimum(int cities[][], int Placement, int Number, int Max) {
		int min =0;
		for(int i = 0; i < Number; i++) {
			if (cities[Placement][i] < Max && Placement != Number) {
				min = cities[Placement][i];
			}
			
		}
		return min; // Go through the First street
	}
	
	static int SecondMinimum(int[][] cities, int Placement, int numbers, int Fmax, int Smax) {
		for(int i = 0; i < numbers; i++) {
			if(cities[Placement][i] <= Fmax) {
				Smax = Fmax;
				Fmax = cities[Placement][i]; // if I find something smaller grab it 
				
			}
			else if(cities[Placement][i] <= Smax && cities[Placement][i] != Fmax) {
					Smax = cities[Placement][i]; // if the second is true then make it the max
			}
			
		}
		return Smax;
	}
	static void Copy(int[] path, int Number) {
		for(int i = 0; i < Number; i++) {
			pathF[i] = path[i];
		pathF[Number] = path[0];
		}
	}
	static void Check(int[][] cities, int Bound, int Weight, int Level, int[] path, int Number, int Max, int Fmax, int Smax) {
		if(Level == Number) {
			if (cities[path[Level-1]][path[0]] != 0) {
				int TotWeight = Weight + cities[path[Level-1]][path[0]];
				if(TotWeight < shortest) {
					Copy(path, Number);
					shortest = TotWeight;
				}
			}
		}	
		
	
	 for (int i = 0; i < Number; i++) 
     { 
         if (cities[path[Level-1]][i] != 0 && 
                 Visited[i] == false) 
         { 
             int temp = Bound; 
             Weight += cities[path[Level - 1]][i];  
             if (Level == 1) 
            	 Bound -= ((FirstMinimum(cities, path[Level - 1],Number, Max) + 
                             FirstMinimum(cities, i, Number, Max))/2); 
             else
            	 Bound -= ((SecondMinimum(cities, path[Level - 1],Number, Fmax, Smax) + 
                             FirstMinimum(cities, i,Number, Max))/2); 

             if (Bound + Weight < shortest) 
             { 
                 path[Level] = i; 
                 Visited[i] = true; 

                 // Check for the next level 
                 Check(cities, Bound, Weight, Level + 1, 
                     path, Number, Max, Fmax, Smax); 
             } 

    
             Weight -= cities[path[Level-1]][i]; 
             Bound = temp; 

             // Also reset the visited array 
             Arrays.fill(Visited,false); 
             for (int j = 0; j <= Level - 1; j++) 
                 Visited[path[j]] = true; 
         } 
     } 
 } 


 static void TraveSalesProblem(int cities[][], int Number, int Max, int Fmax, int Smax) 
 { 
     int Path[] = new int[Number + 1]; 
     int Bound = 0; 
     Arrays.fill(Path, -1); 
     Arrays.fill(Visited, false); 

     // Compute initial bound 
     for (int i = 0; i < Number; i++) 
         Bound += (FirstMinimum(cities, i, Number, Max) + 
                     SecondMinimum(cities, i, Number, Fmax, Smax)); 

     // Rounding off the lower bound to an integer 
     Bound = (Bound==1)? (Bound/2 + 1 ): Bound/2; 
     Visited[0] = true; 
     Path[0] = 0; 
     Check(cities, Bound, 0, 1, Path, Number, Max, Fmax, Smax); 
 } 
 
 public static void main(String[] args) throws FileNotFoundException {
	 Scanner sc = new Scanner(new BufferedReader(new FileReader("C://Users/bwom123/Desktop/test.txt")));
     int rows = 9;
     int columns = 9;
     int [][] myArray = new int[rows][columns];
     while(sc.hasNextLine()) {
        for (int i=0; i<myArray.length; i++) {
           String[] line = sc.nextLine().trim().split(" ");
           for (int j=0; j<line.length; j++) {
              myArray[i][j] = Integer.parseInt(line[j]);
           }
        }
        Travel(9);
        TraveSalesProblem(myArray, 9, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
        System.out.println("Minimum cost : "+ shortest); 
        System.out.printf("Path Taken : "); 
        for (int i = 0; i <= 9; i++)  
        { 
            System.out.printf("%d ", pathF[i]); 
        } 
     }
 }
}
