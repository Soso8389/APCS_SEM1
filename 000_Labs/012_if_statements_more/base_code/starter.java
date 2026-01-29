/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);	
	System.out.println("Enter a number");
	int num1 = sc.nextInt();
	System.out.println("Enter another number");
	int num2 = sc.nextInt();
	System.out.println("The first value is " + num1);
	System.out.println("The second value is  "+ num2);
	if (num1 == num2) {
		System.out.println("the values are equal");
	}
	if (num1 != num2) {
		System.out.println("the values are not equal");
	}
	
		
	}
}
