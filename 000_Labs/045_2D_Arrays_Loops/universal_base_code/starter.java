/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;

class starter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many rows do you want in your 2d array?");
        int rows = sc.nextInt();

        System.out.println("How many columns do you want in your 2d array?");
        int columns = sc.nextInt();

        int[][] arr = new int[rows][columns];

        
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                arr[r][c] = (int)(Math.random() * 10);
            }
        }

        int divide = rows * columns;

        printArr(arr);
        System.out.println("    ");
        System.out.println("-------------------------------");
        System.out.println("Average of whole array: " + returnAVG(arr, divide));
        System.out.println("The row average is: "+ returnRowAVG(arr));
    }

    public static void printArr(int[][] arr) {
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                System.out.print(arr[r][c] + " ");
            }
            System.out.println();
        }
    }

    public static double returnAVG(int[][] arr, int divide) {
        int addition = 0;

        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                addition += arr[r][c];
            }
        }

        return (double)addition / divide;
    }
    

    	public static double returnRowAVG(int[][] arr) { 
    	Scanner sc = new Scanner(System.in); 
    	System.out.println("Which row do you want the average of? (remember we start counting at 0)"); 
    	int r = sc.nextInt();  
    	int sum = 0; 
    	for (int c = 0; c < arr[r].length; c++) { 
    		sum += arr[r][c]; 
    		
    	} 
    	return (double) sum / arr[r].length; 
    		
    	}
    }

