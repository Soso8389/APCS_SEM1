/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Warrior[] warriors = new Warrior[100];
        Wizard[] wizards = new Wizard[100];
        int WarriorNum = 0;
        int WizardNum = 0;
         
         for (int i = 0; i < 100 ; i++){
             warriors[i]= new Warrior();
         }
         
         for (int i = 0; i < 100; i++){
             wizards[i]= new Wizard();
         }
        boolean fight = true;
        while (fight = true) {
         wizards[WizardNum].attack(warriors[WarriorNum]);
         if (warriors[WarriorNum].isDead()) {
         	WarriorNum++;
         	if (warriors[99].isDead()){
          	fight = false;
          	System.out.println();
          	System.out.println("The Wizards have won the war with "+ (100 - WizardNum) +" Wizards remaining.");
          	break;
          }
         }
         
         warriors[WarriorNum].attack(wizards[WizardNum]);
         
         if (wizards[WizardNum].isDead()) {
         	WizardNum++;
         	if (wizards[99].isDead()){
          	fight = false;
          	System.out.println();
          	System.out.println("The Warriors have won the war with "+ (100 - WarriorNum) +" Warriors remaining.");
          	break;
          }
         }
          
          
        	
        }
       
      
	}
}
