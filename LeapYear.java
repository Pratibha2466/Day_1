//To check wether given year is leap year or not.

import java.util.Scanner;

public class LeapYear 
{
	public static void main(String[] args) 
	{
		int y; // Integer variable to hold the int value to take a inpute as a year.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Year :"); //printing the statement to the output window
		y = sc.nextInt(); // To take the year 
		
		if(y%4==0) // Condition to check whether it is leap year or not.
			System.out.println(y+ " is Leap year.");
		else
			System.out.println(y+ " is not leap year.");
		sc.close(); // Closing the Scanner class object.
	}
}
