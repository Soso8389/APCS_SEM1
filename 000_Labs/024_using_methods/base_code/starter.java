/*
 *	Author:  
 *  Date: 
*/

import java.io.*;
import java.util.*;
import java.time.*;
import java.time.format.*;

class starter {
	static long startTime = 0;
	static ArrayList<String> arr = new ArrayList<String>();

	public static void main(String args[]) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		int game_mode = 0;
		System.out.println("Welcome to the type quest");
		System.out.println("The local time is currently : "+ getTime());
		System.out.println("You will be given a sentence, your goal is to type it as fast as possible!");
        System.out.println("    ");
        while(true){
        System.out.println("____________________________________________________");
        System.out.println("Choose your game mode!");
        System.out.println("1- Play random");
        System.out.println("2- Choose word");
        System.out.println("3. Quit");
        game_mode = sc.nextInt();
        if (game_mode==1){
        System.out.println("Your random sentence is:");	
        String original = (getSentence());
        System.out.println(original);
        countdown();
        startTimer();
        sc.nextLine();
        String typed = sc.nextLine();
        double passed_time = endTimer();
        
        System.out.println("    ");
        System.out.println("    ");
        System.out.println("Nice job!, here are your results :");
        System.out.println("_____________________________________________________");
        System.out.println("Time: "+passed_time);
        System.out.println("# of errors : "+ (compareSentences(original,typed)/100));
        System.out.println("Letters per minuite: "+ lpm(lettersInSentence(typed), passed_time));
        System.out.println("Words per minuite: "+ wpm(wordsInSentence(typed), passed_time));
        
        }
        else if (game_mode==2){
        System.out.println("Choose your sentence (1-100)");	
        int sentenceNum = sc.nextInt();
        String original = getSentence(sentenceNum);
        System.out.println(original);
        countdown();
        startTimer();
        sc.nextLine();
        String typed = sc.nextLine();
        double passed_time = endTimer();
        double wordsperminuite = wpm(wordsInSentence(typed),passed_time);
        double lettersperminuite = lpm(lettersInSentence(typed),passed_time);
        System.out.println("    ");
        System.out.println("    ");
        System.out.println("Nice job!, here are your results :");
        System.out.println("_____________________________________________________");
        System.out.println("Time: "+passed_time);
        System.out.println("# of errors : "+ (compareSentences(original,typed)/100));
        System.out.println("Letters per minuite: "+ lettersperminuite);
        System.out.println("Words per minuite: "+ wordsperminuite);	 
        }
        else{
        	System.out.println("Thanks for stopping by!");
        	break;
        }
        }
	}

	public static String getTime(){
		LocalTime now = LocalTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("hh:mm:ss a");
        return now.format(format);
	}

	public static void startTimer(){
		startTime = System.nanoTime();
	}

	public static double endTimer() throws InterruptedException{
		long endTime = System.nanoTime();
		long timeSeconds = ((endTime - startTime)/1000000);
		double decSeconds = timeSeconds/1000.0;
		return decSeconds;
	}

	public static void countdown(){
		System.out.println("Starting countdown...");
		for (int i = 0; i < 3; i++) {
			System.out.println(3-i);
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		System.out.println("Go!");
	}

	private static void populateArrayList(){
		File f = new File("sentences.txt");
		try(Scanner fsc = new Scanner(f)){
			while(fsc.hasNextLine()){
				arr.add(fsc.nextLine());
			}
		}
		catch(FileNotFoundException e){
			System.err.println("File not found: " + e.getMessage());
		}
	}

	public static String getSentence(){
		populateArrayList();
		int rand = (int)(Math.random()*100);
		return arr.get(rand);
	}

	public static String getSentence(int index){
		populateArrayList();
		return arr.get(index%100);
	}

	public static int lettersInSentence(String sent){
		return sent.length();
	}
	
	public static int wordsInSentence(String sent){
		int spaceCount = 0;
		while(sent.indexOf(" ") > -1){
			spaceCount++;
			sent = sent.substring(sent.indexOf(" ")+1);
		}
		return ++spaceCount;
	}

	public static int compareSentences(String given, String typed){
		int errors = 0;
		while(given.length() > 0 && typed.length() > 0){
			if(!given.substring(0,1).equals(typed.substring(0,1)))
				errors++;
			given = given.substring(1);
			typed = typed.substring(1);
		}
		return errors;
	}
	
	public static double wpm(int wordCount, double timeFinal){
		if (timeFinal == 0) return 0;
		double words_miniute = (wordCount / (timeFinal / 60));
		return words_miniute;
	}
	
	public static double lpm(int letterCount, double timeFinal){
		if (timeFinal == 0) return 0;
		double letters_miniute = (letterCount / (timeFinal / 60));
		return letters_miniute;
	}
}
