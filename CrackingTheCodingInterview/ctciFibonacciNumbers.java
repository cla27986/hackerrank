
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ctciFibonacciNumbers {

	public static int fibonacci(int n) {
        // Complete the function.
        if (n <= 2) return 1;
        return fibonacci(n-1) + fibonacci(n-2);
      
      
    }
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
    }
}