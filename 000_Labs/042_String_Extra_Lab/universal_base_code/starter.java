/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);        
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();
        
         while(sentence.indexOf(" ") != -1){
            int space = sentence.lastIndexOf(" ");
            System.out.print(sentence.substring(space+1) + " ");
            sentence = sentence.substring(0, space);
        }
        System.out.print(sentence);

        
    }
}
