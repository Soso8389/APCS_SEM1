/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);	
		System.out.println("What is your name?"); 
		String name = input.nextLine();
		System.out.println("How old are you?");
		int age = input.nextInt();
		System.out.println("What month were you born in? 1-12?");
		int month = input.nextInt();
		System.out.println("What day were you born on? 1-31");
		int day = input.nextInt();
		System.out.println("What year were you born?");
		int year = input.nextInt();
		System.out.println("What is the best robotics team? There is only one answer 🔪🔪🔪");
		int team = input.nextInt();
		
		System.out.println("If I had a nickle for every question I have asked you, how much money would I have?");
		double nickles = input.nextDouble();
		
		
		System.out.println("Hello,  "+ name + "you are   " + age + "  years old" + "You were born on   " + month+"/"+day+"/"+year);
		System.out.println("The best robotics team in your humble and not threatened opinion is  "+team);
		System.out.println("If I had a nickle for every question I asked you, I would have  "+nickles+"   , which isnt alot but it is weird that it happend"+nickles+" times");
		
		
		
	}
}
