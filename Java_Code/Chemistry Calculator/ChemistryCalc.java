package d140;
import java.util.Scanner;


public class ChemistryCalc {
	public static void main(String[] args) {
		
	
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Which option would you like (1 = calculating molarity with solute mols,"); // pv = nrt
		int choice = sc.nextInt();
		switch (choice) {
			case 1: 
			System.out.println("Please enter amount of ml");
			double ml = sc.nextDouble() * .001;
			System.out.println("please enter the amount of umol");
			double umol = sc.nextDouble();
			System.out.println("Which mol are you going to 1 = mol, 2 = mmol, 3 =  stays the same");
			
			switch (choice) {
			case 1: double umol2 = umol * .000001;
			double ans = umol2/ml;
			System.out.println(ans);
			break;
			case 2: double umol3 = umol * .001;
			double ans2 = umol3/ml;
			System.out.println(ans2);
			break;
			case 3: double ans4 = umol/ml;
			System.out.println(ans4);
			
			}
				
			
		
		
	}

	}}
