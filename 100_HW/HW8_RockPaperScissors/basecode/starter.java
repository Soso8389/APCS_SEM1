/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import java.util.Scanner;

class starter {
    public static void main(String[] args) {
    String player1 = "";
    String player2 = "";
    int fois = 0;
    int fois1 = 0;
    int fois2 = 0;
    int fois3 = 0;
    int sum = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Would you like to play Rock Paper Scissors? \n 1.Yes \n 2.No (computer vs computer)\n 3.Quit");
    int gamemode = sc.nextInt();
   
    if (gamemode==1){
        System.out.println("Pick Rock, Paper, or Scissors:");
        sc.nextLine();
        player1=sc.nextLine();
        player2 = getObject();
        
        if (compare2(player1,player2) == 1){
         System.out.println("You won!");
        }
        else if (compare2(player1,player2) == 0){
         System.out.println("It was a tie");
        }
        else{
         System.out.println("Player 2 wins!");
        }
        
        
    }
     else if (gamemode == 2){
         System.out.println("How many times would you like the computer to play itself?");
         fois = sc.nextInt();
         while(fois != sum){
         player1 = getObject();
         player2 = getObject();
         int winner = compare2(player1,player2);
         if (winner == 1){
          fois1 ++;
          sum++;
         }
         else if (winner ==2){
          fois2 ++;
          sum++;
         }
         else{
          fois3++;
          sum++;
         }
         }
         System.out.println("In "+fois+" games, player 1 won "+fois1+" times and player 2 won "+fois2+" times.\n" +"The game tied "+ fois3 +" times.");
         
         
         
         
         
         
         
         
     } 
     else{
         System.out.println("____________________________________________");
         System.out.println("Thanks for playing!");
     }
     
     
    }
    public static String getObject(){
         String compplay="";
         int compplayed = ((int)(Math.random()*4)-1);
         if (compplayed == 1){
             compplay = "Rock";
             return compplay;
         }
         else if (compplayed==2){
          compplay = "Paper";
          return compplay;   
         }
         else {
          compplay = "Scissors";
          return compplay;   
         }
    }
    public static int compare2(String player1,String player2){
     int win = 0;
     
     if (player1.equals(player2)){
      win = 0;
      return win;
     }
     else if (!player1.equals(player2)&&player1.equals("Rock")&&player2.equals("Paper")){
      win = 2;
      return win;
     }
     else if (!player1.equals(player2)&&player1.equals("Rock")&&player2.equals("Scissors")){
      win = 1;
      return win;
     }
     else if (!player1.equals(player2)&&player1.equals("Paper")&&player2.equals("Scissors")){
      win = 2;
      return win;
     }
     else if (!player1.equals(player2)&&player1.equals("Paper")&&player2.equals("Rock")){
      win = 1;
      return win;
     }
     else if (!player1.equals(player2)&&player1.equals("Scissors")&&player2.equals("Rock")){
      win = 2;
      return win;
     }
     else if (!player1.equals(player2)&&player1.equals("Scissors")&&player2.equals("Paper")){
      win = 1;
      return win;
     }
     
     return -1;
    }
     }
  
