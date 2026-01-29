/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);	
		Double F = 0.0;
		Double C = 0.0;
		
		System.out.println("Would you like to convert freedom units to celsius?");
		System.out.println("Enter a tempreature in freedom units");
		F = input.nextDouble();
		C=(F-32.0)/1.8;
		C= (double) Math.round(C);
		System.out.println("The tempreature is "+C+"°C");
	}
}
