
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ctciArrayLeftRotation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        int idx = k % n;
        for(int i = 0; i < n; i++) {
            System.out.print(a[idx] + " ");
            idx = (idx + 1) % n;
        }
          

        System.out.println();

    }
}
