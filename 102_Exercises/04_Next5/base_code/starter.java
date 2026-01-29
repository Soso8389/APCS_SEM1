/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int num = sc.nextInt();
		if (num == 67) {
			System.out.println("YOU HAVE MADE THE WRONG CHOICE IN LIFE!");
			System.out.println("DO YOU REALLY THINK I WOULD ACCEPT 67 AS AN ANSWER!!!");
			System.out.println("YOU WERE DEAD WRONG 🔪🔪🔪");
			System.exit(0);
		}
		System.out.println("Here are the next 5 numbers!");
		System.out.println((num) + ", " + (num + 1) + ", " + (num + 2) + ", " + (num + 3) + ", " + (num + 4) + ", " + (num + 5));
		System.out.println("Here are the next five multiples of " + num + "!");
		System.out.println( (num)  + ", " + (num * 2) + ", " + (num * 4) + ", " + (num * 8) + ", " + (num * 16) + ", " + (num * 32));
		System.out.println("Here is "+ num + " divided by 100!");
		double num2 = (double) num/100;
		double num3 = (double) num/10;
		System.out.println(num2);
		System.out.println("Here is " + num + " divided by 10!");
		System.out.println(num3);
		
		
		
	}
}
