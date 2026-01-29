import java.util.*;
import pkg.*;

class Starter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose difficulty (1 = Easy, 2 = Medium, 3 = Hard): ");
        int difficulty = sc.nextInt();
        sc.nextLine();

        if (difficulty == 1) easyMode(sc);
        else if (difficulty == 2) mediumDamage(sc);
        else if (difficulty == 3) EMOTIONAL_DAMAGE(sc);
        else System.out.println("Invalid choice.");
    }
// ------------------------ EASY -----------------------------------------
    public static void easyMode(Scanner sc){
        int roundNumber = 1;

        while (true){
            String[] colorSequence = createSequence(roundNumber);

            for (int i = 0; i < colorSequence.length; i++) {
                Colors.println(colorSequence[i]);
            }

            Colors.println("Memorize!");
            countdownSeconds(5);
            clearScreen();

            if (!checkUserSequence(colorSequence, sc)){
                Colors.println("Incorrect! Correct sequence:");
                displaySequence(colorSequence);
                break;
            }

            Colors.println("Correct! Next round!");
            roundNumber++;
        }
    }
//------------------------------SLIGHT DAMAGE-----------------------------------
    public static void mediumDamage(Scanner sc){
        int roundNumber = 1;

        while (true){
            String[] colorSequence = createSequence(roundNumber);

            for (int i = 0; i < roundNumber; i++){
                int colorStyle = (int)(Math.random() * 2); // 0 or 1

                if (colorStyle == 0) Colors.println(colorSequence[i]);
                else Colors.println(colorSequence[i], "BRIGHT_" + colorSequence[i]);
            }

            Colors.println("Memorize!");
            countdownSeconds(5);
            clearScreen();

            if (!checkUserSequence(colorSequence, sc)){
                Colors.println("Incorrect! Correct sequence:");
                displaySequence(colorSequence);
                break;
            }

            Colors.println("Correct! Next round!");
            roundNumber++;
        }
    }
// -----------------------EMOTIONAL DAMAGE------------------------------------
    public static void EMOTIONAL_DAMAGE(Scanner sc){
        int roundNumber = 1;

        while (true){
            String[] colorSequence = createSequence(roundNumber);

            for (int i = 0; i < roundNumber; i++){
                int colorStyle = (int)(Math.random() * 3); // 0, 1, or 2
                String brightVersion = "BRIGHT_" + colorSequence[i];
                String backgroundVersion = "BG_" + colorSequence[i];

                if (colorStyle == 0) Colors.println(colorSequence[i]);
                else if (colorStyle == 1) Colors.println(colorSequence[i], brightVersion);
                else Colors.println(colorSequence[i], "BRIGHT_White", backgroundVersion);
            }

            Colors.println("Memorize!");
            countdownSeconds(5);
            clearScreen();

            if (!checkUserSequence(colorSequence, sc)){
                Colors.println("Incorrect! Correct sequence:");
                displaySequence(colorSequence);
                break;
            }

            Colors.println("Correct! Next round!");
            roundNumber++;
        }
    }

    //---------------------Methods-----------------------------------------

    public static String[] createSequence(int roundNumber){
        String[] sequence = new String[roundNumber];
        for (int i = 0; i < roundNumber; i++) sequence[i] = randomColor();
        return sequence;
    }

    public static boolean checkUserSequence(String[] colorSequence, Scanner sc){
        for (int i = 0; i < colorSequence.length; i++){
            System.out.print("Answer #" + (i+1) + ": ");
            String userAnswer = sc.nextLine().trim();
            if (!userAnswer.equalsIgnoreCase(colorSequence[i])) return false;
        }
        return true;
    }

    public static String randomColor(){
        int randomNumber = (int)(Math.random() * 5);
        if(randomNumber == 0) return "Purple";
        if(randomNumber == 1) return "Red";
        if(randomNumber == 2) return "Green";
        if(randomNumber == 3) return "Yellow";
        return "Blue";
    }

    public static void displaySequence(String[] colorSequence){
        for (int i = 0; i < colorSequence.length; i++){
            System.out.print(colorSequence[i] + " ");
        }
        System.out.println();
    }

    public static void countdownSeconds(int seconds){
        for (int i = seconds; i > 0; i--){
            System.out.println(i);
            for (int j = 0; j < 3; j++){
                System.out.print("."); 
            }
            System.out.println();
        }
    }


    public static void clearScreen(){
        for (int i = 0; i < 30; i++) System.out.println();
    }
}
