
public class Account {
	
	
	private String firstName;
	private String lastName;
	private int pin;
	private double balance = 0;
	
	public Account(String firstName2, String lastName2, int pin2,
			double balance2) {
		firstName = firstName2;
		lastName = lastName2;
		pin = pin2;
		balance = balance2;

	}

	public String getName(){
		return firstName + " " + lastName;
	}

	public int getPin(){
		return pin;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void deposit(double depositAmount){
		balance = balance + depositAmount;
	}
	
	public void withdrawal (double withdrawalAmount){
		balance = balance - withdrawalAmount;
	}
}
