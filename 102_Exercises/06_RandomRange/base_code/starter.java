/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter an int");
	int min = sc.nextInt();
	System.out.println("Enter another int , bigger than the last");
	int max = sc.nextInt();
	while (max<= min){
	System.out.println("That number was smaller");
	System.out.println("Enter an int , bigger than the last");
	max = sc.nextInt();		
	}
	
	System.out.println(" ");
	System.out.println("Your range was " + "("+ min +","+ max +")");
	System.out.println("Here are 5 random numbers in that range");
	// PRINTING OF DOOM
	System.out.println((int)(Math.random()* (max - min) + min));
	System.out.println((int)(Math.random()* (max - min) + min));
	System.out.println((int)(Math.random()* (max - min) + min));
	System.out.println((int)(Math.random()* (max - min) + min));
	System.out.println((int)(Math.random()* (max - min) + min));
	

	}
}
