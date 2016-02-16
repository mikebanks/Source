import java.util.Scanner;
public class AltSum {

	/**
	 * @This gets a set of numbers and computes an alternating sum.
	 * In a nut-shell this basically alternates the subtraction and addition symbol in the problem.
	 * Not really a real-life test case for which you would use this but its neat to see the answer.
	 */
	public static void main(String[] args)
    {
          System.out.println("Authored by: Michael Banks");
          int index = 0;
          int number = 0;
          int sum = 0;
          int[] numberList = new int[99];
          Scanner terminal = new Scanner(System.in);
         
          System.out.print("Input the set of numbers and end the set with -999:");
          number = terminal.nextInt();
          while(number != -999){
                numberList[index] = number;
                number = terminal.nextInt();
                index++;
          }      
          sum = numberList[0];
          for(int lcv = 0; lcv < index-1; lcv++){
                      if(lcv%2 == 0){
                            System.out.print(numberList[lcv]+"-");
                            sum = sum-numberList[lcv+1];
                      }
                      else{
                            System.out.print(numberList[lcv]+"+");
                            sum = sum+numberList[lcv+1];
                      }
          }
          System.out.print(numberList[index-1]+"="+ sum);
    }
}

