package sdfghjk;
//Daniel Yap
//CS240
//Assignment1
//4/19/2018

public class TaskA {


	public static void main(String arg[]) {
		ResizableArrayBag<String> groceryBag = new ResizableArrayBag<String>();
		groceryBag.add("cup");
		groceryBag.add("soup");
		
		for (int c = 0; c< groceryBag.getCurrentSize(); c++) {
			if (groceryBag.contains("soup")){
				int soupcounter = 0;
				groceryBag.remove("soup");
				soupcounter++;
				System.out.print(soupcounter);
					
			}
		}
	}
}