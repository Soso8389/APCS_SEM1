import java.util.Scanner;

class starter {
    public static void main(String args[]) {
        System.out.println("English or French");
        Scanner input = new Scanner(System.in);
        String language = input.nextLine();

        if (language.equals("French")) {
            System.out.println("Qui anniversaire est ça?");
            String qui = input.nextLine();

            System.out.println("Joyeux anniversaire");
            System.out.println("Joyeux anniversaire");
            System.out.println("Joyeux anniversaire à " + qui);
            System.out.println("Joyeux anniversaire");
        }
        else if (language.equals("English")) {
            System.out.println("Whose birthday is it?");
            String who = input.nextLine();

            System.out.println("Happy birthday to you");
            System.out.println("Happy birthday to you");
            System.out.println("Happy birthday to " + who);
            System.out.println("Happy birthday to you");
        }

        input.close();
    }
}
