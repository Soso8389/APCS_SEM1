/* 
    Lecture note example - Methods
*/

import java.util.Scanner;
class LectureMethod{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number 1");
        int num1 = sc.nextInt();
        System.out.println("Number 2");
        int num2 = sc.nextInt();
	
        add(num1,num2);
        int y = square(num2);
        int x = absolute(num1);
    }
	
	
	public static int absolute (int value){
	    int absValue = 0; 
	    
	    if (value<0){
	        absValue=value*-1;
	        System.out.println("The absolute value of " + value + " is " + absValue);
	        return absValue;
	    }
	    else {
	        System.out.println("The absolute value of " + value + " is " + value);
	        return value;
	        
	    }
	}
	
	
	public static int square (int a){
	    int sq = a*a;
	    System.out.println(a + " squared is " + sq);
	    return sq;
	}
	
	public static void add(int a, int b){
	    int sum = a + b;
	    System.out.println("The sum is : " + sum);
	    return;
	}
	
	
}