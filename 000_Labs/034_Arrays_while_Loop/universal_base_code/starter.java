/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int [] boorito = new int [10000];
	    int i = 0;
	    
	      
	      while (i<1000){
	      	boorito [i]= (int)(Math.random()*10000-1);
	      	i++;
	      }
	    while (i!=0){
	    	i--;
	    	System.out.println(boorito[i]);
	    }


		
	}
}
