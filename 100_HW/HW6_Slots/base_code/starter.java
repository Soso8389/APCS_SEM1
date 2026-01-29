import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		System.out.print("Slot Machine Rules:\n1. Each player starts with $100.\n2. Input a wager less than your total amount of money or go all in, i dont care.\n3. The slot machine will roll 3 emojis ⚰️🎃👻 .\na. If two emojis match, you double your money.\nb. If all three match, you triple your money.\nc. If none match, you lose your money, womp to the womp.\n--------------------------------------------------\n");
		Scanner sc = new Scanner(System.in);

		String emoji1 = "⚰️";
		String emoji2 = "👻";
		String emoji3 = "🎃";
		int money = 100;

		System.out.println("🎰 Welcome to Spooky Slots!");
		System.out.println("Would you like to play? (Yes,yes,Y,y or No,no,N,n)");
		String wimp = sc.nextLine();
		int wager = 0;

		if (wimp.equals("Yes") || wimp.equals("yes") || wimp.equals("Y") || wimp.equals("y")) {
			while (money > 0) {
				System.out.println("\nYou currently have $" + money);
				System.out.print("Enter your wager (or 0 to quit): ");
				wager = sc.nextInt();

				if (wager == 0) {
					System.out.println("You quit while you were ahead with $" + money + ". See you next time!");
					break;
				}

				if (wager > money) {
					System.out.println("You're too broke to bet that much. You only have $" + money);
					continue;
				}

				System.out.println("You have bet $" + wager + " dollars");

				int rand1 = (int)(Math.random() * 3 + 1);
				int rand2 = (int)(Math.random() * 3 + 1);
				int rand3 = (int)(Math.random() * 3 + 1);

				System.out.println("Your First emoji was:");
				System.out.println(rand1 == 1 ? emoji1 : rand1 == 2 ? emoji2 : emoji3);

				System.out.println("Your Second emoji was:");
				System.out.println(rand2 == 1 ? emoji1 : rand2 == 2 ? emoji2 : emoji3);

				System.out.println("Your Third emoji was:");
				System.out.println(rand3 == 1 ? emoji1 : rand3 == 2 ? emoji2 : emoji3);

				if (rand1 == rand2 && rand2 == rand3) {
					System.out.println("Congradulations! 🎉 You hit the JACKPOT!!!.");
					money += wager * 3;
					System.out.println("You have tripled your money!!! \nYour new balance is: " + money);
				} else if (rand1 == rand2 || rand1 == rand3 || rand2 == rand3) {
					System.out.println("Congradulations! 🎉 You got a match.");
					money += wager * 2;
					System.out.println("You have doubled your money!!! \nYour new balance is: " + money);
				} else {
					System.out.println("Womp Womp, You did not win this time");
					money -= wager;
					System.out.println("You have lost $" + wager + " \nYour new balance is: " + money);
				}

				if (money <= 0) {
					System.out.println("\nYou're bankrupt! Have you ever heard of 'The house always wins'?");
				}
			}
			sc.close();
		} else if (wimp.equals("No") || wimp.equals("no") || wimp.equals("N") || wimp.equals("n")) {
			System.out.println("No worries, come back anytime. We will always take your money!");
		}
	}
}
