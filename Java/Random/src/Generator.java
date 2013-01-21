import java.util.Random;
public class Generator {

	/**
	 * Authored by: Michael D. Banks
	 * This is a random number generator that generates 6 random numbers.
	 * It can easily be manipulated to change the desired digits of number desired.
	 */
	public static void main(String[] args) {
		Random X = new Random();
		System.out.println("Play This Combination and you will never have to work again.");
		System.out.println((1+X.nextInt(6))+" "+(1+X.nextInt(6))+ " "+(1+X.nextInt(6))+" "+(1+X.nextInt(6))+" "+(1+X.nextInt(6))+" "+(1+X.nextInt(6)));
	}
}