import java.util.Scanner;
public class FibonacciRunner {

	/**
	 * @This program finds and prints the number correspondent to the Fibonacci sequence.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Authored by: Michael Banks");
		System.out.println("Enter n: N being the nuber of the Fibonacci Sequence you would like to see.");
		int n = in.nextInt();
		
		FibonacciGenerator fg = new FibonacciGenerator();
		System.out.println("1\n1 ");
		for(int I = 3; I <= n; I++){
			System.out.println(fg.nextNumber());
		}
	}

}
