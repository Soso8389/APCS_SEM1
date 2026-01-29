/*
	Author:
	Date:
	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Tell me the duck story");
		System.out.println("Bum bum bum, ba-dum ba-dum");
		System.out.println("The duck walked up to the lemonade stand and he said to the man running the stand");
		System.out.println("Hey! (Bum bum bum)");
		String gg = input.nextLine();
		if (gg.equals("got any grapes?")){
			System.out.println("The man said no we just sell lemonade, but it's cold and its fresh and it's all homemade");
			System.out.println("Can I get you a glass?");
			String ill = input.nextLine();
			if (ill.equals("I'll pass")){
				System.out.println("Till the very next day, bum bum bum bum bum ba-dum");
				System.out.println("When the duck walked up to the lemonade stand, and he said to the man running the stand");
				System.out.println("Hey! (Bum bum bum)");
				gg = input.nextLine();
				if (gg.equals("got any grapes?")){
					System.out.println("The man said, No, like a said yesterday, we sell lemonade, ok,  why not give it a try ");
					System.out.println("The duck said");
					String g = input.nextLine();
					if (g.equals("Goodbye")){
						System.out.println("Then he waddled away, waddle waddle, then we waddled away, waddle waddle, then he waddled away, waddle waddle.");
						System.out.println("Till the very next day, bum bum bum bum bum ba-dum");
					}
				}
			
			}
		}
	}

}
