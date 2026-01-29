import java.util.Scanner;

class Starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            words[i] = toPigLatin(words[i]);
        }

        System.out.println(String.join(" ", words));
        
    }

    public static String toPigLatin(String word) {
        String vowels = "aeiouAEIOU";
        int i = 0;
        while (i < word.length() && vowels.indexOf(word.charAt(i)) == -1) i++;
        if (i == 0) return word + "-way";
        if (i == word.length()) return word + "-ay";
        return word.substring(i) + "-" + word.substring(0, i) + "ay";
    }
}
