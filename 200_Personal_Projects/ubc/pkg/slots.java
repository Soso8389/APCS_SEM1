import java.util.Random;
import java.util.Scanner;

public class slots {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int money = 100;
        System.out.println("Slot Machine Rules:");
        System.out.println("1. Each player starts with $100.");
        System.out.println("2. Input a wager less than or equal to your total amount of money.");
        System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
        System.out.println("   a. If two numbers match, you double your wager.");
        System.out.println("   b. If three numbers match, you triple your wager.");
        System.out.println("   c. If none match, you lose your wager.");
        System.out.println("--------------------------------------------------");

        while (money > 0) {
            System.out.print("Would you like to play the slots? (Yes/yes/Y/y): ");
            String answer = scanner.nextLine().trim();

            if (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y"))) {
                System.out.println("Sad to see you go! You still have $" + money + " left. Come again soon! Thanks!");
                break;
            }

            System.out.print("You have $" + money + ". How much would you like to wager? ");
            int wager = scanner.nextInt();
            scanner.nextLine(); // consume newline

            // Validate wager
            while (wager <= 0 || wager > money) {
                if (wager <= 0) {
                    System.out.print("Sneaky! No negatives or 0! Please enter a positive wager: ");
                } else {
                    System.out.print("You only have $" + money + "! Please enter a smaller number: ");
                }
                wager = scanner.nextInt();
                scanner.nextLine(); // consume newline
            }

            System.out.println("Great! Let's play!!!");
            int roll1 = rand.nextInt(10) + 1;
            int roll2 = rand.nextInt(10) + 1;
            int roll3 = rand.nextInt(10) + 1;

            System.out.println("Your rolls are: ");
            System.out.println("_______________________");
            System.out.println("| " + roll1 + " | " + roll2 + " | " + roll3 + " |");
            System.out.println("_______________________");

            if (roll1 == roll2 && roll2 == roll3) {
                System.out.println("JACKPOT! Your wager has now been tripled!");
                money += wager * 10; // Net gain is +2*wager
            } else if (roll1 == roll2 || roll2 == roll3 || roll1 == roll3) {
                System.out.println("You won! Your wager has now been doubled!");
                money += wager; // Net gain is +wager
            } else {
                System.out.println("Didn't win this time, better luck next time!");
                money -= wager;
            }

            if (money <= 0) {
                System.out.println("You've run out of money! Thanks for coming! Come back soon!");
                break;
            } else {
                System.out.println("You now have $" + money + ".");
            }
        }

        scanner.close();
    }
}
