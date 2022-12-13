package Algorithms;


class Node1 { 
	int TaskName;
	int Time = 0;
	int ES = 0, EF = 0, LS = 0, LF = 0;
	
	Node1(int Taskname) {
		this.TaskName = Taskname;
	}
	
	void Compare(Node1 other, int j) {
		this.EF = this.ES + j;
		if(other.ES < j + this.ES) {
			other.ES = 0;
		}
		if(other.ES > j + this.ES) {
			//Do nothing
		}
		else {
		other.ES += j + this.ES;	
	}
	}
	
	void FindLS(Node1 other, int j) {
		if(this.LF > other.LS || this.LF == 0) {
		this.LS = other.LS- j;
		this.LF = other.LS;
}
	}
	
	String CheckForSlack() {
		if((this.LS - this.ES) == 0) {
			return(" Slack: 0 - This is a critical Path");
		}
		else
			return(" Slack: "+ (String.valueOf((this.LS-this.ES))));
			
	}
}



public class CPM {
	
	public static void CriticalPathMethod(Node1[] T, int[][] G) {
		int Arrsize = T.length;
		for(int i = 0; i < Arrsize; i++) {
			for(int j = 0; j < Arrsize; j++) {
				if(G[i][j] != 0) {
					T[i].Compare(T[j], G[i][j]);
				}
			}
		}
		
		T[8].LS = 26; // update the last part
		
		for(int i = Arrsize - 1; i >= 0; i--) {
			for(int j = Arrsize - 1; j >= 0; j--) {
				if(G[i][j] != 0) {
				T[i].FindLS(T[j], G[i][j]);
			}
			}
		}
		
		for(int i = 0; i < Arrsize; i++) {
			System.out.println("Task: "+ (i + 1) + " ES: " + T[i].ES + " EF:  " + T[i].EF + " LS: " + T[i].LS + " LF: " + T[i].LF + T[i].CheckForSlack());
		}
		
		
	}
	
	
	public static void main(String[] args) {
		int Arrsize = 9;
		Node1[] T = new Node1[Arrsize];
		
		for(int i = 0; i < Arrsize; i++) {
			T[i] = new Node1(i);
		}
		int[][] G =        {{0,0,5,5,5,0,0,0,0},
		                    {0,0,0,0,0,0,0,6,0},
		                    {0,0,0,0,0,0,0,4,0},
		                    {0,0,0,0,0,0,3,0,0},
		                    {0,0,0,0,0,1,0,0,0},
		                    {0,0,0,0,0,0,4,0,0},
		                    {0,0,0,0,0,0,0,0,14},
		                    {0,0,0,0,0,0,0,0,12},
				            {0,0,0,0,0,0,0,0,2}};
		
		CriticalPathMethod(T, G);
	}
	
}