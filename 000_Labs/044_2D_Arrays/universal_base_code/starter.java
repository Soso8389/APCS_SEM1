/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int [][] arr = new int [10] [10];
		int totalSum = 0;
		for(int r = 0; r<arr.length;r++){
			for(int c = 0; c<arr.length;c++){
				arr[r][c]=((int)Math.random()*100);
			}
		}
		
		//add
		for(int r = 0; r<arr.length;r++){
			for(int c = 0; c<arr.length;c++){
				totalSum += arr[r][c];
			}
		}
		
		System.out.println("The average is: "+totalSum/10);




		
	}
}
