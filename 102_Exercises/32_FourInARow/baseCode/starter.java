/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;
import java.util.Random;

class starter {
    public static void main(String args[]) {
        String[][] board = {{"O", "O", "O", "O", "O", "O", "O"},
                            {"O", "O", "O", "O", "O", "O", "O"},
                            {"O", "O", "O", "O", "O", "O", "O"},
                            {"O", "O", "O", "O", "O", "O", "O"},
                            {"O", "O", "O", "O", "O", "O", "O"},
                            {"O", "O", "O", "O", "O", "O", "O"}};

        printBoard(board);

        Scanner sc = new Scanner(System.in);

        boolean playerTurn = true;

        int gameOver = 0;
        while(gameOver == 0){
            System.out.println("Please enter a column to place your piece: ");
            int col = sc.nextInt();
            sc.nextLine();

            if(col < 0 || col >= board[0].length){
                System.out.println("Invalid input, please try again.");
                continue;
            }

            if(!board[0][col].equals("O")){
                System.out.println("That column is full, try another");
                continue;
            }

            int row = 0;
            while(row < board.length && board[row][col].equals("O")){
                row++;
            }
            row--;

            if(playerTurn){
                board[row][col] = "A";
            }
            else{
                board[row][col] = "B";
            }

            playerTurn = !playerTurn;
            printBoard(board);

            gameOver = checkGameStatus(board);
        }

        if(gameOver == 1){
            System.out.println("A won the game");
        }
        else if(gameOver == 2){
            System.out.println("B won the game!");
        }
    }

    public static int checkGameStatus(String[][] board){
        int checkV = checkVertical(board);
        int checkH = checkHorizontal(board);
        int checkD = checkDiagonal(board);
        if(checkV == 1 || checkH == 1 || checkD == 1)
            return 1;
        else if(checkV == 2 || checkH == 2 || checkD == 2)
            return 2;
        else
            return 0;
    }

    public static int checkVertical(String[][] board){
        for(int r = 0; r < board.length - 3; r++){
            for(int c = 0; c < board[0].length; c++){
                if(board[r][c].equals("O")) continue;
                if(board[r][c].equals(board[r+1][c]) &&
                   board[r][c].equals(board[r+2][c]) &&
                   board[r][c].equals(board[r+3][c])){
                    if(board[r][c].equals("A")) return 1;
                    else return 2;
                }
            }
        }
        return 0;
    }

    public static int checkHorizontal(String[][] board){
        for(int r = 0; r < board.length; r++){
            for(int c = 0; c < board[0].length - 3; c++){
                if(board[r][c].equals("O")) continue;
                if(board[r][c].equals(board[r][c+1]) &&
                   board[r][c].equals(board[r][c+2]) &&
                   board[r][c].equals(board[r][c+3])){
                    if(board[r][c].equals("A")) return 1;
                    else return 2;
                }
            }
        }
        return 0;
    }

    public static int checkDiagonal(String[][] board){
        for(int r = 0; r < board.length - 3; r++){
            for(int c = 0; c < board[0].length - 3; c++){
                if(board[r][c].equals("O")) continue;
                if(board[r][c].equals(board[r+1][c+1]) &&
                   board[r][c].equals(board[r+2][c+2]) &&
                   board[r][c].equals(board[r+3][c+3])){
                    if(board[r][c].equals("A")) return 1;
                    else return 2;
                }
            }
        }

        for(int r = 3; r < board.length; r++){
            for(int c = 0; c < board[0].length - 3; c++){
                if(board[r][c].equals("O")) continue;
                if(board[r][c].equals(board[r-1][c+1]) &&
                   board[r][c].equals(board[r-2][c+2]) &&
                   board[r][c].equals(board[r-3][c+3])){
                    if(board[r][c].equals("A")) return 1;
                    else return 2;
                }
            }
        }

        return 0;
    }

    public static void printBoard(String [][] board){
        System.out.println("_________________________________________");
        for(int i = 0; i < board.length;i++){
            for(int j = 0; j < board[0].length;j++){
                System.out.print("| " + board[i][j] + " | ");
            }
            System.out.println("");
        }
        System.out.println("_________________________________________");
    }
}
