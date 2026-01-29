/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name? / Comment tu t'appeles?");
		String name = sc.nextLine();
		System.out.println("How many times would you like it printed/ Combien de fois voulez-vous que votre nom soit copié ?");
		int times = sc.nextInt();
		int sum = 0;
		
		while(true){
			if (sum == times){
				break;
			}
			System.out.println(name);
			sum += 1;
		}
		



		
	}
}
