import java.util.Scanner;
public class FindingTax {

	/**
	 * Authored by: Michael D. Banks
	 * This program calculates the tax on a given price.
	 */
	public static void main(String[] args) {
		System.out.println("Authored by: Michael D. Banks");
		
		double bill;
		Scanner terminal = new Scanner(System.in);
		System.out.println("Input the bill amount without the dollar sign ($)");
		bill = terminal.nextFloat();
		System.out.println("\n\nThe 15% tax on a bill of $" + bill +" is $" + (bill*.15));
		System.out.println("The 18% tax on a bill of $" + bill +" is $" + (bill*.18));
		System.out.println("The 20% tax on a bill of $" + bill +" is $" + (bill*.20));

	}

}
