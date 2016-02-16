
public class BankAccount {

	/**
	 * @Authored by: Michael Banks
	 */

	private String name;
	private int ssn;
	private double balance;
	public double interest;
	
	BankAccount(){
		this.name = "";
		this.ssn = 0;
		this.balance = 0;
	}
	
	BankAccount(String name, int ssn, double balance){
		this.name = "Michael Banks";
		this.ssn = 1359;
		this.balance = 2172010;
	}
	
	BankAccount (String name, int ssn){
		this.name = "John Doe";
		this.ssn = 987654321;
		this.balance = 0;
	}
	
	public String getName(){
		return name;
	}
	
	public int getSsn(){
		return ssn;
	}
	
	public double getBalance(){
		return balance;
	}

	public void deposit(double amount){
		balance = balance + amount;		
	}
	
	public void withdrawal(double amount){
		balance = balance - amount;
	}
	
	public double interest (double interest){
		 double free;
		 free=balance * .0125/12;
		return free;
	}
}

