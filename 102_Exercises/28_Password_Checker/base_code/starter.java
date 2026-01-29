import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]) throws Exception {
		//Creating File instance to reference text file in Java
        File text = new File("./passwords.txt");			// This file must be in the same folder as your java/class files.
     
        //Creating Scanner instance to read File in Java
        Scanner numLines = new Scanner(text);			// Scanner for counting number of lines
        Scanner sc = new Scanner(text);					// New Scanner for taking in the lines.
     
	 	// Count number of lines in text file.
		int count = 0; 
        while(numLines.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
			numLines.nextLine();
            count++;
        }  
		
		String [] passwords = new String[count];		// This is the array you will be using.

        //Reading each line of the file using Scanner class
		int i = 0;
        while(sc.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
            String line = sc.nextLine();
            passwords[i] = line;
			i++;
        }  

		/* ----------------------------------------------------------------------------------------- */
		// Start here, use the array passwords
int eightMore = 0;
int eightLess = 0;
int count2 = 0;
int count3 = 0;
int count4 = 0;
int count5 = 0;


for (int k = 0; k < count; k++) {
    String p = passwords[k].trim();  
    passwords[k] = p;

    if (p.length() >= 8) {
        eightMore++;
    } else {
        eightLess++;
    }
}


for (int k = 0; k < count; k++) {
    String p = passwords[k];

    if (p.contains("!") || p.contains("@") || p.contains("#") || p.contains("$") ||
        p.contains("%") || p.contains("^") || p.contains("&") || p.contains("*") ||
        p.contains("(") || p.contains(")") || p.contains("_") || p.contains("-") ||
        p.contains("+") || p.contains("=")) {

        count2++;
    }
    else{
        count3++;
    }
}

for (int k = 0; k < count; k++) {
    String p = passwords[k];

    if ((p.contains("!") || p.contains("@") || p.contains("#") || p.contains("$") ||
        p.contains("%") || p.contains("^") || p.contains("&") || p.contains("*") ||
        p.contains("(") || p.contains(")") || p.contains("_") || p.contains("-") ||
        p.contains("+") || p.contains("=")) && p.length() >= 8) {

        count4++;
    }
    else{
        count5++;
    }
}


System.out.println("-------------------------");
System.out.println(eightMore + " passwords out of " + count + " have eight characters or more");
System.out.println(eightLess + " passwords out of " + count + " do not have eight characters or more");
System.out.println("-------------------------");
System.out.println("-------------------------");
System.out.println(count2 + " passwords out of " + count + " have 1 symbol or more");
System.out.println(count3 + " passwords out of " + count + " do not have any symbols");
System.out.println("-------------------------");
System.out.println("-------------------------");
System.out.println(count4 + " passwords out of " + count + " meet both levels of security");
System.out.println(count5 + " passwords out of " + count + " do not meet both levels of security");
System.out.println("-------------------------");
	}
}