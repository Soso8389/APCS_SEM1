package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spooderman {
	String actor;		// What's the actors name?
	int age;			// What's the age of the actor?
	String villain;		// Who's the arch nemesis of this Spiderman?

	
	public Spooderman() {		// Default Constructor
		actor = "unknown";
		age = 0;
		villain = "unknown";
	}
	public Spooderman(String n){		
		actor = n;
		age = 0;
		villain = "unknown";
	}
	public Spooderman(int a){		
		actor = "unknown";
		age = a;
		villain = "unknown";
	}
	public Spooderman(String n, int a){		
		actor = n;
		age = a;
		villain = "unknown";
	}
	public Spooderman(String n, int a, String v){		
		actor = n;
		age = a;
		villain = v;
	}
	
	
	
	
	
	public String getActor(){						
		return actor;
	}

	public int getAge(){			
		return age;
	}

	public String getVillian(){			
		return villain;
	}
	
 

	// ---------------------------------------
	public void fight(){
		System.out.println("Spidey shoots his web at " + villain);
	}

	public static void printArt(){				// Prints out Spidey!
	System.out.println("           :              ");  
    System.out.println("           ;              ");   
    System.out.println("          :               ");   
    System.out.println("          ;               ");   
    System.out.println("         /                ");   
    System.out.println("       o/                 ");   
    System.out.println("     ._/\\___,             ");    
    System.out.println("         \\                ");   
    System.out.println("         /    			  "); 
	}
}
