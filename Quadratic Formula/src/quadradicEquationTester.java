import java.util.Scanner;
public class quadradicEquationTester {
	/**
	 * This program calculates and solves the quadratic formula by inputting 3 coefficients. 
	 */
	public static void main(String[] args) {
		System.out.println("Authored by: Michael Banks");

		Double a;
		Double b;
		Double c;
		
		Scanner Teach = new Scanner(System.in);
		System.out.println("Enter Coefficients for A, B, & C:");
		System.out.println("A=");
		a=Teach.nextDouble();
		System.out.println("B=");
		b=Teach.nextDouble();
		System.out.println("C=");
		c=Teach.nextDouble();
		
		quadraticEquation Problem = new quadraticEquation(a,b,c);
		Problem.getSolution();
	}

}
