package pkg;
import java.util.Scanner;
import java.util.Random;

public class Map {
    int [][] map;
    int treasureX;
    int treasureY;
    int posX;
    int posY;


    public Map(int row, int column){
        map = new int[row][column];
        posX = 0;
        posY = 0;
        map[posX][posY] = 2;
        generateTreasure();
    }

    public void generateTreasure(){
    treasureX = (int)(Math.random() * map.length);
    treasureY = (int)(Math.random() * map[0].length);

    while (treasureX == 0 && treasureY == 0) {
        treasureX = (int)(Math.random() * map.length);
        treasureY = (int)(Math.random() * map[0].length);
    }
    
    
    
}


    public boolean move(int m){
        int newX = posX;
        int newY = posY;

        if (m == 1) newX--;         
        else if (m == 2) newX++;    
        else if (m == 3) newY--;     
        else if (m == 4) newY++;     
        else if (m == 5) { newX--; newY--; } 
        else if (m == 6) { newX--; newY++; } 
        else if (m == 7) { newX++; newY--; } 
        else if (m == 8) { newX++; newY++; } 
        else return false;

        return move(newX, newY);
    }

    public boolean move(int row, int col){
        if (row < 0 || row >= map.length){ 
        return false;
        }
        if (col < 0 || col >= map[0].length){ 
        return false;
        }

        map[posX][posY] -= 2; 

        posX = row;
        posY = col;

        map[posX][posY] += 2; 

        return true;
    }

    public boolean dig(){
        if (map[posX][posY] % 2 == 1)
            return false;

        map[posX][posY] += 1;

        if (posX == treasureX && posY == treasureY)
            return true;

        return false;
    }

    
    public void printTreasureLoc(){
        System.out.println(treasureX + ", " + treasureY);
    }

    public void printMap(){
    for (int r = 0; r < map.length; r++) {
        for (int c = 0; c < map[r].length; c++) {

            if (r == treasureX && c == treasureY && map[r][c] % 2 == 1) {
                System.out.print("5 ");
            }
            else {
                System.out.print(map[r][c] + " ");
            }

        }
        System.out.println();
    }
}

}
