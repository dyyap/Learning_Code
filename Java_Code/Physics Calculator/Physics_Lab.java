package d140;
import java.util.Scanner;

public class Physics_Lab {
	public static void First() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		double g = 9.8;
		double Mc = .0057;
		double R = .0508;
		System.out.println("Please enter acceleration");
		double a = sc.nextDouble();
		System.out.println("Please enter Mass");
		double Ma = sc.nextDouble();
		double alpha = a/R;
		double Ts = (Mc + Ma)*(g-(alpha*R))*(R);
		System.out.println("This is the alpha acceleration: " + alpha );
		System.out.println("This is the torque: " + Ts);
		System.out.println("This is the acceleration: " + a );
		System.out.println("This is the Mass " + Ma);
		
	}
	public static void Second() {
		double M = 5.3;
		double L1 = .703;
		double L2 = .104;
		double L3 = .103;
		double R1 = .015;
		double R2 = .0508;
		double R3 = .102;
		double pi = Math.PI;
		double V1 = pi*(R1*R1)*L1;
		double V2 = pi*(R2*R2)*L2;
		double V3 = pi*(R3*R3)*L3;
	    double I = .5*M*((V1*(R1*R1))+(V1*(R1*R1))+(V2*(R2*R2))+(V3*(R3*R3))/(V1+V1+V2+V3));
		System.out.println(I);
		
	}
	public static void main(String[] args) {
		Second();
	}
}
