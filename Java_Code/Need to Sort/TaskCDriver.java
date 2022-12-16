package sdfghjk;
//Daniel Yap
//CS240
//Assignment1
//4/19/2018

public class TaskCDriver {

	public static void main(String args[]) {
		PileOfTextbooks<String> pile = new PileOfTextbooks<String>();
		pile.add("MathBook");
		pile.add("NewBook");
		pile.getTopBook();
		pile.remove();
		pile.getTopBook();
		pile.add("newBook");
		
		
		
	}
}
