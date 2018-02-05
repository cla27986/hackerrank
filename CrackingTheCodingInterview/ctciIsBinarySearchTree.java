
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ctciIsBinarySearchTree {
	/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

	The Node class is defined as follows:
	    class Node {
	        int data;
	        Node left;
	        Node right;
	     }
	*/
	boolean checkBST(Node root) {
	    return helper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	boolean helper(Node root, int min, int max) {
	    if (root == null) return true;
	    return (root.data > min && root.data < max) && 
	        helper(root.right, root.data, max) && helper(root.left, min, root.data);
	}
}

