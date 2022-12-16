package parallel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;



public class Reverse {
	static StringBuilder r = new StringBuilder();
	public static ArrayList<String> WordParse(String a, ArrayList<String> Backwards) {
		char[] form = a.toCharArray();
		
		for (int i = 0; i< a.length(); i++) {
			r.append(form[i]);
			if(Character.isWhitespace(form[i])) {
				Backwards.add(r.toString());
			}
			
		}
		return Backwards;
	}
	
	public static void WriteBackwards(ArrayList<String> Science) {
		
		
	}
	

	
	public static void RPSThreadMaker(int ThreadCounter) {
		 
		Thread[] threads = new Thread[ThreadCounter];
				for (int i = 1; i < ThreadCounter; i++) {
					threads[i] = new Thread(new Runnable() {
						public void run() {
							
						}
					});
				}
				
		
	}
	

	

	public static void main(String[] args) throws FileNotFoundException {
		int LineCounter = 0;
		ArrayList<String> Backwards = new ArrayList<>();
		ArrayList<String> Parser = new ArrayList<>();
		Scanner scanner = new Scanner(new File("C:/Users/bwom123/Downloads/DeclatationIndependence.txt"));

		while (scanner.hasNextLine()) {
			   String line = scanner.nextLine();
			   Parser.add(line);
			   LineCounter++; //this shows how many lines there are
			}
		while(!Parser.isEmpty()) {
			for(int i = 0; i< Parser.size(); i++) {
				Backwards = WordParse(Parser.get(i), Backwards);
				System.out.println(Backwards.size());
				
			}
			
		}
		RPSThreadMaker(LineCounter);
		
		
	}

}

