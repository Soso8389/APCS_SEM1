/*
 * Author:  
 * Date: 
*/

import java.util.Scanner;

class starter {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // starter questions, assign points, pick role
        int points = 20;
        int new_points = points;
        int invStrength = 0;
        int RIZZ = 0;
        int invDexterity = 0;
        int IQ = 0;

        System.out.println("Good evening traveler, I will accompany you on your quest!");

        System.out.println("Pick a name for your character:");
        String name = sc.nextLine();

        System.out.println("Now pick a title for your character:");
        String title = sc.nextLine();

        System.out.println("Now pick a role for your character, the options are: \n 1. Wizard \n 2. Rogue \n 3. Knight");
        String role = sc.nextLine();


        // role check
        if (role.equals("Wizard") || role.equals("Rogue") || role.equals("Knight")) {

            System.out.println("Good evening, " + name + " " + title + ". You are a " + role + " in the city of Edinburgh.");
            System.out.println(name + ", let's start by picking your abilities. You have 20 skill points to use. Remember:");
            System.out.println("- You can't invest more than 10 points in a given skill.");
            System.out.println("- Spend wisely!");
            System.out.println("You can choose between: \n 1. Strength \n 2. Dexterity \n 3. RIZZ \n 4. Intelligence");

            // Strength
            System.out.println("How many points would you like to invest in Strength?");
            invStrength = sc.nextInt();
            if (invStrength > 10) {
                System.out.println("You can't spend more than 10 points per skill. 5 points have been automatically invested.");
                invStrength = 5;
            }
            new_points -= invStrength;

            // Dexterity
            System.out.println("How many points would you like to invest in Dexterity?");
            invDexterity = sc.nextInt();
            if (invDexterity > 10) {
                System.out.println("You can't spend more than 10 points per skill. 5 points have been automatically invested.");
                invDexterity = 5;
            }
            new_points -= invDexterity;

            // RIZZ
            System.out.println("How many points would you like to invest in RIZZ?");
            RIZZ = sc.nextInt();
            if (RIZZ > 10) {
                System.out.println("You can't spend more than 10 points per skill. 5 points have been automatically invested.");
                RIZZ = 5;
            }
            new_points -= RIZZ;

            // Intelligence
            System.out.println("How many points would you like to invest in Intelligence?");
            IQ = sc.nextInt();
            if (IQ > 10) {
                System.out.println("You can't spend more than 10 points per skill. 5 points have been automatically invested.");
                IQ = 5;
            }
            new_points -= IQ;

            // End of game
            System.out.println("##################################");
            System.out.println("Player details");
            System.out.println("Name: " + name);
            System.out.println("Title: " + title);
            System.out.println("Role: " + role);
            System.out.println("##################################");
            System.out.println("Skills purchased:");
            System.out.println("Strength level: " + invStrength);
            System.out.println("Dexterity level: " + invDexterity);
            System.out.println("RIZZ level: " + RIZZ);
            System.out.println("Intelligence level: " + IQ);
            System.out.println("##################################");
            System.out.println("Points left: " + new_points);

        } else {
            System.out.println("That is not a valid role.");
        }
    }
}
