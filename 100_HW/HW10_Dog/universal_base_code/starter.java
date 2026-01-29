/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("What is this dogs name?");
		String name = sc.nextLine();

		System.out.println("What age should " + name + " be?");
		int age = sc.nextInt();

		Dog a = new Dog(name,age);
		

		Dog b = new Dog();

		System.out.println(a.getName() + " is a " + a.getBreed() + " that is " + a.getAge() + " years old");
		System.out.println(b.getName() + " is a " + b.getBreed() + " that is " + b.getAge() + " years old");

		boolean asleep = a.isSleeping();
		if(asleep) {
			System.out.println(a.getName() + " is sleeping!");
		} else {
			a.bark();
		}

		boolean bSleep = b.isSleeping();
		if(bSleep) {
			if(!asleep) {
				b.bark();
			} else {
				System.out.println(b.getName() + " is sleeping!");
			}
		} else {
			if(!asleep) {
				b.bark();
			} else {
				System.out.println(b.getName() + " isn't sleeping!");
			}
		}
	}
}
