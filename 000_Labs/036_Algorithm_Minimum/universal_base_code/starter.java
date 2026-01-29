/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int[] arr = new int[((int)(Math.random()*150)+51)];
         
         for (int i = 0; i < arr.length; i++){
             arr[i]=((int)(Math.random()*100)+1);
         }
         int min = Integer.MAX_VALUE;
         for (int i = 0; i < arr.length; i++){
             if (arr[i]<min){
                 min = arr[i];
             }
         }
         int max = Integer.MIN_VALUE;

         for (int i = 0; i < arr.length; i++) {
         if (arr[i] > max) {
            max = arr[i];
           }
       }
        
       int sum = 0;

         for (int i = 0; i < arr.length; i++) {
          sum += arr[i];
         }

         int average = sum / arr.length; // integer division gives int result

   

        
        
        
        
        System.out.println("The elements are:");
        System.out.println("________________________________________");
        for (int i = 0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
      }
        System.out.println("");
        System.out.println("________________________________________");
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println("Average: " + average);

         
	}
}
         
         
        // minimum
        



		


