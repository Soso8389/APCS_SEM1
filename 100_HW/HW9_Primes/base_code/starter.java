/*
 *  Author:
 *  Date:
 */

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter an integer : ");
	    int checkif = sc.nextInt();
	    
	    if (checkPrime(checkif)) {
		    System.out.println("Your number was a prime number");
	    } else {
	        System.out.println("Your number was not a prime number");
	    }
	    
	    printPrimes(checkif);
	}
	
	public static boolean checkPrime(int num1) {
        if (num1 <= 1) {
            return false;
        }

        int num2 = 2;
        while (num2 <= Math.sqrt(num1)) {
            if (num1 % num2 == 0) {
                return false;
            }
            num2++;
        }
        return true;
    }

	public static void printPrimes(int checkif) {
       int currentPrime = checkif;     
       int printyThingy = 2;          
       
       while (currentPrime >= printyThingy) {  
            if (checkPrime(currentPrime)) {
                System.out.println(currentPrime);
            }
            currentPrime--;
	   }
    }
}
