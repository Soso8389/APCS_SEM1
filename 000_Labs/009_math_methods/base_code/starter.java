/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		/* 0riginal code
		
		System.out.println("Maximum = " + Math.max(13 - 6 * 11, 30 % 7 * (-2)));
		System.out.println("Square root = " + Math.sqrt(3 * 8 + 31 % 7));
		System.out.println("Power = " + Math.pow(37 / 3, 35 % 21));
		System.out.println("Max = " + Math.max(Math.pow(2, 14 % 3), Math.sqrt(2 * 6)));
		*/
		
		// Extra code ↓↓↓
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a double");
		double X = input.nextDouble();
		System.out.println("Enter another double");
		double Y = input.nextDouble();
		System.out.println("The maximum of " + X + " and "+ Y + " is "+Math.max(X,Y));
		System.out.println("The square root of " + X + " and "+ Y + " is "+Math.sqrt(Y));
		System.out.println( X + "  to the power of  "+ Y + " is "+Math.max(X,Y));
		

		
		
		
		
	}
}
