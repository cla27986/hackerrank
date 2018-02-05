import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class ctciMakingAnagrams {
    public static int numberNeeded(String first, String second) {
        Hashtable ht = new Hashtable<Character, Integer>();
        Character cur ;
        Integer value;
        for(int i = 0; i < first.length(); i++) {
            cur = first.charAt(i);
            value = (Integer)ht.get(cur);
            if (value == null) value = 0;
            ht.put(cur, value + 1);
        }
        
        for(int i = 0; i < second.length(); i++) {
            cur = second.charAt(i);
            value = (Integer)ht.get(cur);
            if (value == null) value = 0;
            ht.put(cur, value - 1);
        }
        int sum = 0;
        Collection<Integer> vals = ht.values();
        for (Integer e : vals) {
            if (e < 0) e = -e;
            sum += e;
        }
        
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
