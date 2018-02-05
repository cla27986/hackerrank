import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class isBinarySearchTree {
	boolean utilCheck(Node root, int min, int max) {
	    if (root != null) {
	        if (root.data >= max || root.data <= min) return false;
	        else return utilCheck(root.left, min, root.data) & utilCheck(root.right, root.data, max);
	    }
	    else return true;
	}

    boolean checkBST(Node root) {
        return utilCheck(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}
