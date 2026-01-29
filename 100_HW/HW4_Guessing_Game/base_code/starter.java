import java.util.Scanner;

class starter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to guess the phrase!");
        
        String phrase1 = "Bah weep granah weep nini bong";
        String phrase2 = "Antoine";
        String phrase3 = "Monsieur Piscine";
        String phraseR = "";
        String phraseG = "";
        
        int qNum = 1 + (int)(Math.random() * 3);

        if (qNum == 1) {
            phraseR = phrase1;
            System.out.println("The phrase is a greeting");
            System.out.println("Can you guess it?");
            
            phraseG = sc.nextLine();
            // I did not know that IgnoreCase was a thing. "The more you know"
            if (!phraseG.equalsIgnoreCase(phraseR)) {
                System.out.println("Sorry, that phrase was not correct, here is another hint");
                System.out.println("This greeting is universal");
                System.out.println("Can you guess it?");
                phraseG = sc.nextLine();
                
                if (!phraseG.equalsIgnoreCase(phraseR)) {
                    System.out.println("Sorry, that phrase was not correct, here is another hint");
                    System.out.println("It is from the 1986 Transformers movie");
                    System.out.println("Can you guess it?");
                    phraseG = sc.nextLine();
                    
                    if (!phraseG.equalsIgnoreCase(phraseR)) {
                        System.out.println("Sorry, that phrase was not correct");
                        System.out.println("You have run out of guesses, please try again later");
                    } else {
                        System.out.println("Correct! The phrase was: " + phraseR);
                    }
                } else {
                    System.out.println("Correct! The phrase was: " + phraseR);
                }
            } else {
                System.out.println("Correct! The phrase was: " + phraseR);
            }
        }

        if (qNum == 2) {
            phraseR = phrase2;
            System.out.println("This is a robot from team 589");
            System.out.println("Can you guess it?");
            
            phraseG = sc.nextLine();
            if (!phraseG.equalsIgnoreCase(phraseR)) {
                System.out.println("Sorry, that phrase was not correct, here is another hint");
                System.out.println("It is from the year 2025");
                System.out.println("Can you guess it?");
                phraseG = sc.nextLine();
                
                if (!phraseG.equalsIgnoreCase(phraseR)) {
                    System.out.println("Sorry, that phrase was not correct, here is another hint");
                    System.out.println("It starts with an A");
                    System.out.println("Can you guess it?");
                    phraseG = sc.nextLine();
                    
                    if (!phraseG.equalsIgnoreCase(phraseR)) {
                        System.out.println("Sorry, that phrase was not correct");
                        System.out.println("You have run out of guesses, please try again later");
                    } else {
                        System.out.println("Correct! The phrase was: " + phraseR);
                    }
                } else {
                    System.out.println("Correct! The phrase was: " + phraseR);
                }
            } else {
                System.out.println("Correct! The phrase was: " + phraseR);
            }
        }

        if (qNum == 3) {
            phraseR = phrase3;
            System.out.println("It is Mr. Poole's alter ego");
            System.out.println("Can you guess it?");
            
            phraseG = sc.nextLine();
            if (!phraseG.equalsIgnoreCase(phraseR)) {
                System.out.println("Sorry, that phrase was not correct, here is another hint");
                System.out.println("If Mr. Poole was French");
                System.out.println("Can you guess it?");
                phraseG = sc.nextLine();
                
                if (!phraseG.equalsIgnoreCase(phraseR)) {
                    System.out.println("Sorry, that phrase was not correct, here is another hint");
                    System.out.println("The last word is Piscine");
                    System.out.println("Can you guess it?");
                    phraseG = sc.nextLine();
                    
                    if (!phraseG.equalsIgnoreCase(phraseR)) {
                        System.out.println("Sorry, that phrase was not correct");
                        System.out.println("You have run out of guesses, please try again later");
                    } else {
                        System.out.println("Correct! The phrase was: " + phraseR);
                    }
                } else {
                    System.out.println("Correct! The phrase was: " + phraseR);
                }
            } else {
                System.out.println("Correct! The phrase was: " + phraseR);
            }
        }
    }
}
