

import java.util.Scanner;


class starter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the adventure game, traveler!"); 
        System.out.println("Before we start, traveler, pick your name :");
        String name = sc.nextLine();
        System.out.println("Well hello there, " + name + ", now let's find you a role!");
        System.out.println("What would you like to be? The choices are:\nRogue\nWizard\nKnight");
        String role = sc.nextLine();

        if (role.equals("Rogue")) {
        System.out.println("You made a good choice! Hello, " + name + ", You are a Radical Rogue!");
        } 
        else if (role.equals("Wizard")) {
        System.out.println("You made a good choice! Hello, " + name + ", You are a Wacky Wizard!");
        }
    	
        else if (role.equals("Knight")) {
        System.out.println("You made a good choice! Hello, " + name + ", You are a Knowledgeable Knight!");
        }
        
         
        else {
        System.out.println("Sorry " + name + ", That is not a valid role. Please try again later!");
        }
    }
}
