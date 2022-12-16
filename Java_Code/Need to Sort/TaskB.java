package sdfghjk;
//Daniel Yap
//CS240
//Assignment1
//4/19/2018

public class TaskB {
	private static int NumbA = 0;
	private static int NumbE = 0;
	private static int NumbI = 0;
	private static int NumbO = 0;
	private static int NumbU = 0;

	public static void main(String args[]) {
		int NumberofVowels = 0;
	
		ResizableArrayBag<String> letters = new ResizableArrayBag<String>();
		ResizableArrayBag<String> vowels = new ResizableArrayBag<String>();
		String [] Letters = letters.toArray();
		for (int c = 0; c<letters.getCurrentSize(); c++) {
			if (letters.contains("a") || letters.contains("e") || letters.contains("i") || letters.contains("o") || letters.contains("u")) {
				vowels.add(Letters[c]);
				NumberofVowels++;
				if(letters.contains("a")) {
					NumbA++;
				}
				if(letters.contains("e")) {
					NumbE++;
				}
				if(letters.contains("i")) {
					NumbI++;
				}
				if(letters.contains("o")) {
					NumbO++;
				}
				if(letters.contains("u")) {
					NumbU++;
				}
			}System.out.println(NumbA + "," + NumbE + "," + NumbI + ","+ NumbO + "," + NumbU);
			System.out.println(NumberofVowels);
		}
		
	
}
}
