import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class treeTopView {
	/* 

    class Node 
       int data;
       Node left;
       Node right;
   */
	void topView(Node root) {
	    helper(root, 0);
	}
	
	void helper(Node root, int x) {
	    if (root == null) return;
	    if (x == 0) {
	        helper(root.left, -1);
	        System.out.print(root.data + " ");
	        helper(root.right, 1);
	    }
	    else if (x == 1){
	        System.out.print(root.data + " ");
	        helper(root.right, x);
	    }
	    else {
	        helper(root.left, x);
	        System.out.print(root.data + " ");
	    }
	    
	
	}
}
