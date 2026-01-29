import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter an interger:");
	int int1=sc.nextInt();
	System.out.println("Enter another integer:");
	int int2=sc.nextInt();
	if (int1 % 2 == 0){
	    System.out.println(int1 + ", is an even number");
	}
	else {
	    System.out.println(int1 + ", is an odd number");
	}
	if (int2 % 2 == 0){
	    System.out.println(int2 + ", is an even number");
	}
	else {
	    System.out.println(int2 + ", is an odd number");
	}
	
	if ((int1 % 3) == 0 && (int1 % 4) == 0 && (int1 % 5) == 0){
		System.out.println(int1 + ", is divisible by 3, 4, and 5!");
	}
	else if ((int1 % 3) != 0 && (int1 % 4) != 0 && (int1 % 5) != 0){
		System.out.println(int1 + ", is not divisible by 3, 4, and 5!");
	}
	
	if ((int2 % 3) == 0 && (int2 % 4) == 0 && (int2 % 5) == 0){
		System.out.println(int2 + ", is divisible by 3, 4, and 5!");
	}
	else if ((int2 % 3) != 0 && (int2 % 4) != 0 && (int2 % 5) != 0){
		System.out.println(int2 + ", is not divisible by 3, 4, and 5!");
	}
		
	}
}
