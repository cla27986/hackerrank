
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ctciRecursiveStaircase {
	public static long possibleWays(int n, long [] memo) {
        if (n < 0) {//System.out.println("1");
            return 0;}
        if (n > memo.length) {//System.out.println("2");
            return 0;}
        if (memo[n] < 0) {//System.out.println("3");
            memo[n] = possibleWays(n-1, memo) + possibleWays(n-2, memo) + possibleWays(n-3, memo);}
        //System.out.println("4 " + memo[n]);
        return memo[n];
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        
        long memo[] = new long[40];
        for(int a0 = 0; a0 < memo.length; a0++){
            memo[a0] = -1;
        }
        memo[0] = 1;
        
        for(int a0 = 0; a0 < s; a0++){
            
            int n = in.nextInt();
            System.out.println(possibleWays(n, memo));
        }
    }
}
