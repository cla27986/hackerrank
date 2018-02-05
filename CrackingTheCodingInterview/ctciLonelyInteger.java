
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ctciLonelyInteger {
	public static int lonelyInteger(int[] a) {
        Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
        for (int i = 0; i < a.length; i++) {
            if (ht.containsKey(a[i])) ht.remove(a[i]);
            else ht.put(a[i], 1);
        }
        Set<Integer> s = ht.keySet();
        Integer res [] = new Integer[1];
        res = s.toArray(res);
        return res[0];
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        System.out.println(lonelyInteger(a));
    }
}
