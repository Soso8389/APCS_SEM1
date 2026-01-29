import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		System.out.println("Slot Machine Rules:\n1. Each player starts with $100.\n2. Input a wager less than your total amount of money or go all in, i dont care.\n3. The slot machine will roll 3 emojis ⚰️🎃👻 .\na. If two emojis match, you double your money.\nb. If all three match, you triple your money.\nc. If none match, you lose your money, womp to the womp.\n--------------------------------------------------\n");
		Scanner sc = new Scanner(System.in);

		String emoji1 = "⚰️";
		String emoji2 = "👻";
		String emoji3 = "🎃";
		int money = 100;

		System.out.println("🎰 Welcome to Spooky Slots!");
		System.out.println("Would you like to play? (Yes,yes,Y,y or No,no,N,n)");
		String wimp = sc.nextLine();
		int wager = 0;

		boolean loanTaken = false;
		int loanAmount = 0;

		if (wimp.equals("Yes") || wimp.equals("yes") || wimp.equals("Y") || wimp.equals("y")) {
			while (money > 0) {
				// Loan option if money is less than 100 and loan hasn't been taken yet
				if (money < 100 && !loanTaken) {
					System.out.print("Your balance is below $100. Would you like to call your mom for a loan? (Yes/No): ");
					String loanResponse = sc.nextLine().trim();
					if (loanResponse.equalsIgnoreCase("yes") || loanResponse.equalsIgnoreCase("y")) {
						System.out.print("How much would you like to borrow? ");
						loanAmount = sc.nextInt();
						sc.nextLine(); // consume newline
						money += loanAmount;
						loanTaken = true;
						System.out.println("Your mom loves you and trusts that you can be responisble with that money. She lent you $" + loanAmount + ". Your new balance is $" + money + ".");
					}
				}

				System.out.println("\nYou currently have $" + money);
				System.out.print("Enter your wager (or 0 to quit): ");
				wager = sc.nextInt();
				sc.nextLine(); // consume newline

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

					if (money <= 0 && loanTaken) {
						System.out.println("You lost your mom's money. Get ready to be whipped");
						break;
					}
				}

				if (loanTaken && money > 0) {
					int repay = loanAmount / 2;
					if (money >= repay) {
						money -= repay;
						System.out.println("You repaid half of your loan ($" + repay + "). Your new balance is $" + money + ".");
						loanTaken = false;
					} else {
						System.out.println("You can't repay your mom. She kills you. Game over.");
						break;
					}
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
