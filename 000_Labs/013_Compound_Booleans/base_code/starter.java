/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me a number");
		int x = sc.nextInt();
		System.out.println("Give me another number");
		int y = sc.nextInt();
		System.out.println("Give me a third number");
		int z = sc.nextInt();
		
		if ( x > y && x > z){
			System.out.println("X is the largest number");
			System.out.println("The value of X is "+ x);
		}
		if ( y > x && y > z){
			System.out.println("Y is the largest number");
			System.out.println("The value of Y is "+ y);
		}
		if ( z > x && z > y){
			System.out.println("Z is the largest number");
			System.out.println("The value of Z is "+ z);
		}
		
		


	}
}
