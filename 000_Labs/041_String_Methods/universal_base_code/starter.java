/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("What is your Full Name? (First, Last)");
		String fName = sc.nextLine();
		int startPos = fName.indexOf(" ") + 1;  
		int endPos = fName.length();          
		System.out.println("Your last name is: " + fName.substring(startPos, endPos));

	
	}
}
