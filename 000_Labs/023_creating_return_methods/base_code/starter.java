import java.util.Scanner;

public class starter {

    public static int power(int base_boost, int ive_got_the_power) {
        int result = 1;
        for (int i = 0; i < ive_got_the_power; i++) {
            result *= base_boost;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Give me a base :  ");
        int base_boost = sc.nextInt();

        System.out.println("Give me an exponent :  ");
        int ive_got_the_power = sc.nextInt();

        int forty_two = power(base_boost, ive_got_the_power);

        System.out.println("The answer to l̶i̶f̶e̶ ̶t̶h̶e̶ ̶u̶n̶i̶v̶e̶r̶s̶e̶ ̶a̶n̶d̶ ̶e̶v̶e̶r̶y̶t̶h̶i̶n̶g̶ this problem is :  " + forty_two);

        sc.close();
    }
}
