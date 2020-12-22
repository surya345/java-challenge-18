import java.io.*;
import java.util.Scanner;
public class Task18 {
    public static String[] A = {
        "#S###########",
        "# # # #     #",
        "# #   # ### #",
        "#   ###     #",
        "# #     ### #",
        "# # ### #   #",
        "# # #   ### #",
        "# # ### # # #",
        "#         #E#",
        "#############"
    };
    static int count = 0;
 
    private static int PUZZLE_SIZE = 10;
    private static int rows, cols;
 
    public static void main(String[] args) {
        System.out.println("\tThe maze skeleton");
        System.out.println("\t-----------------");
 
        char[][] maze = new char[PUZZLE_SIZE][];
        for(int i = 0 ;i < PUZZLE_SIZE; i += 1){
            maze[i] = A[i].toCharArray();
        }
 
        for(int i = 0 ;i < PUZZLE_SIZE; i += 1){
            System.out.print("\t");
            System.out.println(maze[i]);
        }
 
        rows = maze.length;
        cols = maze[0].length;
        solveMaze(maze);
        System.out.println(count);
    }
    
    public static void solveMaze(char[][] maze) {
        int x = 0;
        int y = 0;
        
        outer:
        for(int i = 0; i < rows; i += 1){
            for(int j = 0 ;j < cols; j += 1){
                if(maze[i][j] == 'S'){
                    x = i;
                    y = j;
                    break outer;
                }
            }
        }
 
        boolean[][] visited = new boolean[rows][cols];
        helperSolve(x, y, maze, visited);
    }
 
    public static void helperSolve(int x, int y, char[][] maze, boolean[][] visited) {
        if(x < 0 || x >= rows || y < 0 || y >= cols || maze[x][y] == '#'){
            return;
        }
        if(maze[x][y] == 'E'){
            visited[x][y] = true;
            printMaze(maze);
            count += 1;
            return;
        }
 
        if(visited[x][y] == false){
            char temp = maze[x][y];
            maze[x][y] = '*';
            visited[x][y] = true;
 
            helperSolve(x-1, y, maze, visited); //for North direction
            helperSolve(x+1, y, maze, visited); //for south direction
            helperSolve(x, y+1, maze, visited); //for east direction
            helperSolve(x, y-1, maze, visited); //for west direction
 
            maze[x][y] = temp;
            visited[x][y] = false;
        }
 
    }
 
    public static void printMaze(char[][] maze) {
        System.out.println("\n\t The solved maze ");
        System.out.println("\t-----------------");
        for(int i = 0; i < rows; i += 1){
            System.out.print("\t");
            System.out.println(maze[i]);
        }
    }
    
}
 

