import java.util.Scanner;
public class Machine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Terminal = new Scanner(System.in);
		Scanner Terminal2 = new Scanner(System.in);
		int choice1;
		int choice2;
		int pin = 0;
		int pinCheck;
		double balance = 0;
		double deposit;
		double withdrawal;
		String firstName = null;
		String lastName = null;
		
		System.out.println("Welcome to Mike Banks Automated Teller Machine...");
		System.out.println("Do you already have an account set up?");
		System.out.println("Enter 1: Yes");
		System.out.println("Enter 2: No");
		choice1 = Terminal.nextInt();
		
		if(choice1 == 2){
			System.out.println("Enter Your First Name:");
			firstName = Terminal2.nextLine();
			System.out.println("Enter Your Last Name:");
			lastName = Terminal2.nextLine();
			System.out.println("Enter a 4 Digit Pin.");
			pin = Terminal.nextInt();
			System.out.println("Enter a starting balance. ex~ 123.45");
			balance = Terminal.nextDouble();
			
		}
		Account user = new Account(firstName, lastName, pin, balance);
		
		System.out.println("Verify your Pin:");
		pinCheck = Terminal.nextInt();
		
		if(pinCheck == user.getPin()){
			System.out.println("What would you like to do?");
			System.out.println("Enter 1: Check your Balance.");
			System.out.println("Enter 2: Make a Deposit.");
			System.out.println("Enter 3: Make a Withdrawal.");
			System.out.println("Enter 6: LogOut");
			choice2 = Terminal.nextInt();
		
			while(choice2 != 6){
				if(choice2 == 1){
					System.out.println("Your current balance is: $" + user.getBalance());		
				}
				
				if(choice2 == 2){
					System.out.println("Enter the amount you wish to deposit. ex~ 123.45");
					deposit = Terminal.nextDouble();
					if(deposit < 0){
						System.out.println("Your Transaction cannot be processed");
					}
					else{
						user.deposit(deposit);
						System.out.println("Your transaction completed successfully");
					}
					
				}
				
				if(choice2 == 3){
					System.out.println("Enter the amount you wish to withdraw. ex~ 123.45");
					withdrawal = Terminal.nextDouble();
					
					if(withdrawal < 0){
						System.out.println("Your Transaction cannot be processed");
					}
					else if(withdrawal > user.getBalance()){
						System.out.println("You don't have that much money in your account.");
						System.out.println("Your Transaction cannot be processed. ");
					}
					else{
					user.withdrawal(withdrawal);
					System.out.println("Your transaction completed successfully");
					}
				}							
				
				System.out.println("What would you like to do now?");
				System.out.println("Enter 1: Check your Balance.");
				System.out.println("Enter 2: Make a Deposit.");
				System.out.println("Enter 3: Make a Withdrawal.");
				System.out.println("Enter 6: LogOut");
				choice2 = Terminal.nextInt();			
			}
			
		}
		else{
			System.out.println("The Pin you entered is incorrect.");
		}
		
		System.out.println("Thank you for your service. Goodbye!");
	}
	
	
}
