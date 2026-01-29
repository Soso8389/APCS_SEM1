	/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int answer = (int)(Math.random() * 1000) + 1;
		System.out.println("Enter a gamemode to start or click enter");
		String secrets = sc.nextLine();
		String secret = "1-877-KARS-4-KIDS";
				if (secrets.equals(secret)){
			System.out.println("The answer is  " + answer);
				}
		while (true){
		System.out.println("Guess a random number between (1 - 1000) :");
		int num = sc.nextInt();

		
		
		if (num == answer){
			System.out.println("Congradulations!, you got the number correct! you are a great guesser!");
			break;
		}
		else{
			if (answer > num){
				System.out.println("wrong, the number was greater than your guess.");
			}
			else{
				if (num > answer){
					System.out.println("wrong, the number was lower than your guess.");	
				}
			}
			
		}	
		}
		
	}
}

	

