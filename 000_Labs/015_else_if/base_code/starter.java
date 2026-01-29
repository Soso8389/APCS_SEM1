	/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Guess a random number between (1 - 1000) :");
		int num = sc.nextInt();
		int answer = (int)(Math.random() * 1000) + 1;
		
		if (num == answer){
			System.out.println("Congradulations!, you got the number correct! you are a great guesser!");
		}
		else{
			if (answer > num){
				System.out.println("wrong, the number was greater than your guess. \n The number was "+ answer);
			}
			else{
				if (num > answer){
					System.out.println("wrong, the number was lower than your guess. \n The number was "+ answer);	
				}
			}
			
		}
	}
}

	

