
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ctciConnectedCellInAGrid {
    
    public static int helper(int[][] matrix, int i, int j) {
        if (i < 0 || j < 0 || i > matrix.length - 1 || j > matrix[i].length - 1 || matrix[i][j] != 1) return 0;
        matrix[i][j] = -1;
        return 1 + 
            helper(matrix, i - 1, j - 1) + 
            helper(matrix, i - 1, j) + 
            helper(matrix, i - 1, j + 1) + 
            helper(matrix, i, j - 1) + 
            helper(matrix, i, j + 1) + 
            helper(matrix, i + 1, j - 1) + 
            helper(matrix, i + 1, j) + 
            helper(matrix, i + 1, j + 1);
    }
    
    public static int getBiggestRegion(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < matrix.length; i++) 
            for(int j = 0; j < matrix[i].length; j++) 
                max = Math.max(max, helper(matrix, i, j));
        
            
        return max;
        
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int grid[][] = new int[n][m];
        for(int grid_i=0; grid_i < n; grid_i++){
            for(int grid_j=0; grid_j < m; grid_j++){
                grid[grid_i][grid_j] = in.nextInt();
            }
        }
        System.out.println(getBiggestRegion(grid));
    }
}

