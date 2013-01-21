import java.util.Scanner;
public class Deviation {

	/**
	 * this program calculates the standard division and the mean deviation 
	 * of given input values
	 */
	public static void main(String[] args) {
		System.out.println("Authored by: Michael Banks");
		Scanner terminal = new Scanner(System.in);
		double x1;
		double total = 0;
		int counter = 0;
		double deviation=0;
		
		System.out.println("Input a number");
		System.out.println("Input -999 to stop input.");		
		x1 = terminal.nextDouble();
		
		while (x1 != -999){
			total=total+x1;
			counter++;
			x1 = terminal.nextDouble();
			deviation=Math.sqrt(((Math.pow(total, 2)-(1/counter)*(Math.pow(total, 2)))/(counter-1)));
			System.out.println(deviation);
		}
// Regular Division		
		System.out.println("The average of " + counter + " values");
		System.out.println(" is " + total/counter);
//Mean Deviation
		System.out.println("The Mean Deviation is: ");
		System.out.print(deviation);
	}
}
