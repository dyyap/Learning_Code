package Algorithms;
import java.util.Arrays;
import java.util.*;


class Dynamic {
	final int[][] array, copy;
	final int m, n;

	Dynamic(int[][] a) {
	    this.array = a;
	    this.m = a.length;
	    this.n = a[0].length;
	    this.copy = new int[2 * m - 2][m];
	}

	int cost() {
	    Arrays.fill(copy[fx(m - 1)], 0);
	    for (int i = n - 1; i >= 0; i--) {
	      for (int j = 0; j < m; j++) {
	        copy[fx(0)][j] = array[j][i] + copy[fx(m - 1)][j];
	      }
	      for (int f = 1; f < m - 1; f++) {
	        for (int j = 0; j < m; j++) {
	          copy[fx(-f)][j] = max(copy[fx(0)][j], array[j][i] + copy[fx(-f + 1)][ix(j - 1)]);
	          copy[fx(f)][j] = max(copy[fx(0)][j], array[j][i] + copy[fx(f - 1)][ix(j + 1)]);
	        }
	      }
	      for (int j = 0; j < m; j++) {
	        copy[fx(m - 1)][j] = max(copy[fx(0)][j],
	            array[j][i] + copy[fx(m - 2)][ix(j + 1)],
	            array[j][i] + copy[fx(-m + 2)][ix(j  - 1)]);
	      }
	    }
	    return max(copy[fx(m - 1)]);
	}
	int fx(int f) {
		return f + m - 2; 
		}
	int ix(int i) {
		return (i + m) % m; 
		}
	
	static int max(int ... x) {
		return Arrays.stream(x).max().getAsInt(); }
	}
public class DynamicPathFinder{		
		public static void main(String[] args) {
			
			long Starttime = System.nanoTime();
			int size = 9;
			Random rand = new Random();
		        
			int[][] Map = new int[size][size];
			
			for(int i = 0; i < size; i++) {
				for(int j = 0; j < size; j++) {
					Map[i][j] = rand.nextInt();
				}
			}
		    System.out.println(new Dynamic(Map).cost());
		    long endtime = System.nanoTime();
		    System.out.println("Time is: "  + (endtime - Starttime));
		}
	}


