
public class FibonacciGenerator {

	int firstNumber=1;
	int secondNumber=1;
	int newNumber;
	
	public int nextNumber(){		
		newNumber = firstNumber + secondNumber;						
				firstNumber=secondNumber;
				secondNumber=newNumber;			
		return newNumber;
	}
}
