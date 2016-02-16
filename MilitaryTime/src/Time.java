import java.util.Scanner;
public class Time {

	/**
	 * This program calculates the total number of hours and minutes between times.
	 */
	public static void main(String[] args) {
		int hh1;
		int mm1;	
		int hh2;
		int mm2;
		int hh3;
		int mm3;
		int time1;
		int time2;
		
		System.out.println("Authored by: Michael Banks");
		
		Scanner clock = new Scanner(System.in);
		System.out.println("Please Enter The First Time:");
		time1 = clock.nextInt();
		System.out.println("Please Enter The Second Time:");
		time2 = clock.nextInt();
		
		hh1 = time1 / 100;		
		mm1 = time1 - hh1 * 100;		
		hh2 = time2 / 100;
		mm2 = time2 - hh2 * 100;
		
		if (mm1 > mm2){
			mm2=mm2+60;
			hh2 = hh2-1;
		}
		mm3 = mm2 - mm1;
		
		if (hh1 > hh2){
			hh2 = hh2 + 24;
		}
		hh3 = hh2 - hh1;
		
		System.out.println("You have " + hh3 + " Hours " + mm3 + " Minutes from " + time1);
		
	}
}
