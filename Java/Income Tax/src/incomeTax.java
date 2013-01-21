import java.util.Scanner;
public class incomeTax {

	/**
	 * This program takes the income tax that is inputed and calculates the 
	 * tax determined on how much it is.
	 */
	public static void main(String[] args) {
		System.out.println("Authored by: Michael Banks");
		double income;
		double total = 0;
		Scanner government = new Scanner(System.in);
		System.out.println("Please enter the amount of your income tax:");
		income = government.nextDouble();
		
		if(income <= 250000 ){
			total=.01*50000 + .02*25000 + .03*25000 + .04*(income-100000);
					
			
				if(income <= 100000){
				total=.01*50000 + .02*25000 + .03*(income-75000);
					
					if(income <= 75000){
						total=.01*50000 + .02*(income-50000);
						
						if(income <= 50000){
						total=.01*income;	
						}
					}
				}
		}

		else if(income <=500000){
			total=.01*50000 + .02*25000 + .03*25000 + .04*150000 + .05*(income-250000);
		}
		else if(income > 500000) {
		total=.01*50000 + .02*25000 + .03*25000 + .04*150000 + .05*250000 + .06*(income-500000);				
		}
	
		System.out.println("Your interest on: " + income +" equals: " + total);
	}
}
	


