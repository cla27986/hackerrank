import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class treePostorderTraversal {
	void postOrder(Node root) {
	    Node tmp = root;
	    if (tmp.left != null)
	        postOrder(root.left);
	    if (tmp.right != null)
	        postOrder(root.right);
	    System.out.print(root.data + " ");
	    
	}
}
