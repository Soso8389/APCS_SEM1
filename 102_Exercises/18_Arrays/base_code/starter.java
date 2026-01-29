/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int [] arr1 = new int [1000];
	    int i = 0; 
	    int x = 1;
	    while (i<arr1.length){
	      	arr1 [i]=(3*(x+1));
	      	System.out.println(arr1[i]);
	      	i++;
	      	
	      	x++;
	      	
	      }
	    System.out.println("__________________________________________________");
	    int [] arr2 = new int [1000];
	    int a = 0;
	    
	      
	      while (a<1000){
	      	arr2 [a]= (1000-a);
	      	a++;
	      }
	    while (a!=0){
	    	a--;
	    	System.out.println(arr2[a]);
	    }
	     
	      
	}
	
}
