import java.util.*;

class starter {
    public static void main(String[] args){
        System.out.println("Welcome to Minesweeper!");
        System.out.println("On the grid, 9 means untouched space.");
        System.out.println("Any other number means how many bombs are adjacent to the square.");
        System.out.println("Clear all empty spots and don't touch the bombs!");
        System.out.println();
        
        System.out.println("How difficult would you like the game?");
        System.out.println("1 - Easy (10 bombs)");
        System.out.println("2 - Medium (25 bombs)");
        System.out.println("3 - Hard (40 bombs)");
        System.out.println("4 - EMOTIONAL DAMAGE (99 bombs)");
        
        Scanner sc = new Scanner(System.in);
        int diff = sc.nextInt();
        
        int[][] guessGrid = new int[10][10];
        for(int i = 0; i < guessGrid.length; i++){
            for(int j = 0; j < guessGrid[0].length; j++){
                guessGrid[i][j] = 9;
            }
        }
        
        int[][] bombProxGrid = new int[10][10];
        mapSetUp(diff, bombProxGrid);
        printGrid(guessGrid);
        System.out.println("-------------------------------------");

        boolean alive = true;
        while(alive){
            System.out.print("Please enter a row: ");
            int r = sc.nextInt();
            System.out.print("Please enter a col: ");
            int c = sc.nextInt();
            
            boolean boom = move(r, c, bombProxGrid);
            if(boom){
                System.out.println("-------------------------------------");
                System.out.println("You've hit a bomb! Better luck next time!");
                printGrid(bombProxGrid);
                break;
            }
            reveal(r, c, guessGrid, bombProxGrid);
            System.out.println("-------------------------------------");
            if(checkWin(guessGrid, bombProxGrid)){
                System.out.println("You won! Congratz!");
                break;
            }
        }
    }

    public static void mapSetUp(int diff, int [][] bombProxGrid){
        int bombs = 0;
        if(diff == 1) bombs = 10;
        else if(diff == 2) bombs = 25;
        else if(diff == 3) bombs = 40;
        else bombs = 99;

        Random rand = new Random();
        int placed = 0;

        while(placed < bombs){
            for(int r = 0; r < 10; r++){
                for(int c = 0; c < 10; c++){
                    if(placed >= bombs) break;
                    if(bombProxGrid[r][c] != 9){
                        if(rand.nextInt(10) == 0){
                            bombProxGrid[r][c] = 9;
                            placed++;
                        }
                    }
                }
            }
        }

        for(int r = 0; r < 10; r++){
            for(int c = 0; c < 10; c++){
                if(bombProxGrid[r][c] == 9){
                    for(int dr = -1; dr <= 1; dr++){
                        for(int dc = -1; dc <= 1; dc++){
                            addAdj(r + dr, c + dc, bombProxGrid);
                        }
                    }
                }
            }
        }
    }

    public static void addAdj(int r, int c, int [][] bombProxGrid){
        if(r < 0 || r >= 10 || c < 0 || c >= 10) return;
        if(bombProxGrid[r][c] == 9) return;
        bombProxGrid[r][c]++;
    }

    public static boolean move(int r, int c, int [][] bombProxGrid){
        return bombProxGrid[r][c] == 9;
    }

    public static void reveal(int r, int c, int [][] guessGrid, int[][] bombProxGrid){
        for(int dr = -1; dr <= 1; dr++){
            for(int dc = -1; dc <= 1; dc++){
                int nr = r + dr;
                int nc = c + dc;
                if(nr >= 0 && nr < 10 && nc >= 0 && nc < 10){
                    guessGrid[nr][nc] = bombProxGrid[nr][nc];
                }
            }
        }
        printGrid(guessGrid);
    }

    public static boolean checkWin(int [][] guessGrid, int [][] bombProxGrid){
        for(int r = 0; r < 10; r++){
            for(int c = 0; c < 10; c++){
                if(bombProxGrid[r][c] != 9 && guessGrid[r][c] == 9){
                    return false;
                }
            }
        }
        return true;
    }

    public static void printGrid(int [][] grid){
        System.out.println("_________________________________________");
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                System.out.print("| " + grid[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.println("_________________________________________");
    }
}
