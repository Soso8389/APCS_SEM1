/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

import java.util.Scanner;

class starter {
    public static void main(String args[]) {
        System.out.println("English or French");
        Scanner input = new Scanner(System.in);
        String language = input.nextline();

        if (language.equals("French")) {
            System.out.println("Qui anniversaire est ça?");
            String qui = input.nextLine();
            String joyeux = "joyeux anniversaire";
            String anniversaire = "joyeux anniversaire à ";
            System.out.println(joyeux);
            System.out.println(joyeux);
            System.out.println(anniversaire + qui);
            System.out.println(joyeux);
        }
        else if (language.equals("English")) {
            System.out.println("Whose birthday is it?");
            String who = input.nextLine();
			String happy = "happy birthday to you";
            String birthday = "happy birthday to ";
            System.out.println(happy);
            System.out.println(happy);
            System.out.println(birthday + who);
            System.out.println(happy);
        }

        input.close();
    }
}
