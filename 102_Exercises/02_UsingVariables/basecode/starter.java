/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		testHello();
		System.out.println();
		System.out.println(" ");
		testAbba();
		System.out.println();
		System.out.println("----------------------------");
		testPythag();
	}

	public static void helloName(String name){
		// Your Code Goes here!
		System.out.println( "Hello" + " " + name + "!");
	}
	
	public static void makeAbba(String a, String b){
		System.out.println(a+b+b+a);
		/*Jo, jo, vid Waterloo Napoleon fick ge sig.
		men, men, sitt öde kan man möta.
		på så många skilda sätt.
		själv känner jag sen jag mött dig.
		historien upprepar sig.
		Waterloo – jag är besegrad, nu ger jag mig.
		Waterloo – lova mej nöjet att älska dig.
		Waterloo – allting känns rätt, och det är min tro.
		Waterloo – du är mitt öde, mitt Waterloo.
		Wa wa wa wa Waterloo – du är mitt öde, mitt Waterloo. 
		*/
		
	}
	
	public static void pythag(int a, int b){
		System.out.println(a*a+b*b);
	}
	
	
	public static void testHello(){
		helloName("Bob");
		helloName("Alice");
		helloName("X");
		helloName("");
		helloName("Omega");
		helloName("Hello");
	}
	
	public static void testAbba(){
		makeAbba("Hi", "Bye");
		makeAbba("Yo", "Ben");
		makeAbba("What", "Up");
		makeAbba("6", "7");
		makeAbba("x", "y");
		makeAbba("x", "");
		makeAbba("", "y");
		makeAbba("Ya", "Ya");
	}
	
	public static void testPythag(){
		pythag(1, 1);
		pythag(2, 3);
		pythag(100, 200);
		pythag(67,41);
		pythag(589, 6417);
		pythag(214325728, 1242745810);
	}
}

