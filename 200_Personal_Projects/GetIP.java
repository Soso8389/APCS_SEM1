import java.net.*;
import java.util.Scanner;

class GetIP {
    public static void main(String[] args) throws Exception {
        InetAddress localHost = InetAddress.getLocalHost();
        Scanner input = new Scanner(System.in);

        System.out.println("Want to play a game?");
        System.out.println("What is the best robotics team?");

        int answer = input.nextInt();

        if (answer != 589) {
            System.out.println("Sorry, that was the wrong answer.");
            System.out.println("But I won't leave you empty handed.");
            System.out.println("I have a memory game for you to play!");
            System.out.println("Just making sure you remember where you live...");
            System.out.println("Host Name: " + localHost.getHostName());
            System.out.println("IP Address: " + localHost.getHostAddress());
        } else {
            System.out.println("You answered correctly, you are safe for now...");
        }

        input.close();
    }
}
