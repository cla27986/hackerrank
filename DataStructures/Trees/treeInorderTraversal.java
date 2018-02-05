import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class treeInorderTraversal {
	void inOrder(Node root) {
	    Node tmp = root;
	    if (tmp.left != null)
	        inOrder(root.left);
	    System.out.print(root.data + " ");
	    if (tmp.right != null)
	        inOrder(root.right);
	    
	}
}
