/*
 *	Author:  
 *  Date: 
*/


import java.util.*;

class starter {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word to hide: ");
        String word = sc.nextLine().toLowerCase();

        int size = word.length() + 5;
        String[][] jumble = new String[size][size];

        String[] letters = {
            "a","b","c","d","e","f","g","h","i","j",
            "k","l","m","n","o","p","q","r","s","t",
            "u","v","w","x","y","z"
        };

        boolean flag = Math.random() < 0.5;
        if (flag) {
            String temp = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                temp += word.charAt(i);
            }
            word = temp;
        }

        int direction = (int)(Math.random() * 3);

        int row = 0;
        int col = 0;

        if (direction == 0) {
            row = (int)(Math.random() * size);
            col = (int)(Math.random() * (size - word.length()));
        } else if (direction == 1) {
            row = (int)(Math.random() * (size - word.length()));
            col = (int)(Math.random() * size);
        } else {
            row = (int)(Math.random() * (size - word.length()));
            col = (int)(Math.random() * (size - word.length()));
        }

        for (int i = 0; i < word.length(); i++) {
            if (direction == 0) {
                jumble[row][col + i] = word.substring(i, i + 1);
            } else if (direction == 1) {
                jumble[row + i][col] = word.substring(i, i + 1);
            } else {
                jumble[row + i][col + i] = word.substring(i, i + 1);
            }
        }

        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                if (jumble[r][c] == null) {
                    int random1 = (int)(Math.random() * letters.length);
                    jumble[r][c] = letters[random1];
                }
            }
        }

        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                System.out.print(jumble[r][c] + " ");
            }
            System.out.println();
        }

        
    }
}
