/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
         int[] arr = new int[20];
         System.out.println("----------------------------------------------------------------------");
         System.out.println("These are the 20 numbers");
         int b = 0;
         for (int i = 0; i < arr.length; i++){
             arr[i] = ((int)(Math.random()*10)+1);
             System.out.print(arr[i] + " ,");
         }

         System.out.println("    ");
         System.out.println("----------------------------------------------------------------------");
         System.out.println("    ");

         int targetNum = ((int)(Math.random()*10)+1);
         System.out.println("----------------------------------------------------------------------");
         System.out.println("The target number is " + targetNum);

         for (int i = 0; i < arr.length; i++) {
             if (arr[i] == targetNum) {
                 b++;
                 System.out.println("Duplicate found at index: " + i);
             }
         }

         System.out.println("Total number of duplicates for " + targetNum + " is " + b);
         System.out.println("----------------------------------------------------------------------");
         System.out.println("    ");
         System.out.println("----------------------------------------------------------------------");
         System.out.println("Looking for two in a row:");

         boolean isFound = false;
         for (int i = 0; i < arr.length - 1; i++) {
             if (arr[i] == arr[i + 1]) {
                 System.out.println("Two in a row found at indexes " + i + " and " + (i + 1) + ". The number is " + arr[i]);
                 isFound = true;
             }
         }

         if (!isFound) { 
             System.out.println("None found");
         }

         System.out.println("    ");
         System.out.println("----------------------------------------------------------------------");
	}
}
