import java.util.Scanner;

public class starter {


    public void toString(String cheese) {
        System.out.println(cheese);// Lol I was hungry while coding
    }

    // Print a combined string
    public void toStringCombined(String cheese1, String cheese2) {
        System.out.println(cheese1 + " " + cheese2); // got some motzerlla sticks!!
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Please enter a sentence: ");
        String cheese3= sc.nextLine();

        
        System.out.println("Please enter another sentence");
        String cheese4 = sc.nextLine();

        starter st = new starter();

        
        st.toString("This code has its methods of using methods!");

        
        st.toString(cheese3);

        
        st.toStringCombined(cheese3, cheese4); // I am sticking to the bit even if it is confusing

        sc.close();
    }
}
