import java.util.Scanner;
public class Bank {

	/**
	 * This program gives the users the ability to be able to directly 
	 * deposit or withdraw money to their account. They can also view balance.
	 * 
	 * In this particular program it runs through the scenario starting off.
	 * It shows what its done and ends with giving you and opportunity to manipulate the already set up accounts.
	 */
	
	public static void main(String[] args) {
		BankAccount account1 = new BankAccount();
		BankAccount account2 = new BankAccount("Michael Banks",1359,2172010);
		BankAccount account3 = new BankAccount("John Doe",987654321);
		
		
		System.out.println(account1.getName() + " " + account1.getSsn() + " " + account1.getBalance());
		System.out.println(account2.getName() + " " + account2.getSsn() + " " + account2.getBalance());
		System.out.println(account3.getName() + " " + account3.getSsn() + " " + account3.getBalance());
		
		account1.deposit(500);
		account2.withdrawal(1000);
		account3.deposit(305);
		
		System.out.println(account1.getName() + " " + account1.getSsn() + " " + account1.getBalance());
		System.out.println(account2.getName() + " " + account2.getSsn() + " " + account2.getBalance());
		System.out.println(account3.getName() + " " + account3.getSsn() + " " + account3.getBalance());
		
		Scanner X = new Scanner(System.in);
		Scanner X2 = new Scanner(System.in);
		Scanner X3 = new Scanner(System.in);
		
		double m = 0;
		double m2 = 0;
		double m3 = 0;
				
		System.out.println("Enter the amout that will be withdrawn from Account 1:");
		m = X.nextDouble();
		System.out.println("Enter the amout that will be deposited into Account 2:");
		m2 = X2.nextDouble();
		System.out.println("Enter the amout that will be withdrawn from Account 3:");
		m3 = X3.nextDouble();
	
		double inputAmount = m;
		double inputAmount2 = m2;
		double inputAmount3 = m3;	

		account1.withdrawal(inputAmount);
		account2.deposit(inputAmount2);
		account3.withdrawal(inputAmount3);
		
		System.out.println(account1.getName() + " " + account1.getSsn() + " " + account1.getBalance());
		System.out.println(account2.getName() + " " + account2.getSsn() + " " + account2.getBalance());
		System.out.println(account3.getName() + " " + account3.getSsn() + " " + account3.getBalance());
		
		account1.deposit(inputAmount);
		account2.withdrawal(inputAmount2);
		account3.deposit(inputAmount3);
		
		System.out.println(account1.getName() + " " + account1.getSsn() + " " + account1.getBalance());
		System.out.println(account2.getName() + " " + account2.getSsn() + " " + account2.getBalance());
		System.out.println(account3.getName() + " " + account3.getSsn() + " " + account3.getBalance());				
				
		account1.deposit(account1.interest(inputAmount));
		account2.deposit(account2.interest(inputAmount2));
		account3.deposit(account3.interest(inputAmount3));
		
		System.out.println(account1.getName() + " " + account1.getSsn() + " " + account1.getBalance());
		System.out.println(account2.getName() + " " + account2.getSsn() + " " + account2.getBalance());
		System.out.println(account3.getName() + " " + account3.getSsn() + " " + account3.getBalance());	
		
		System.out.println("Authored by: Michael Banks");
	}
	

}
