import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class treePreorderTraversal {
	void preOrder(Node root) {
	    Node tmp = root;
	    System.out.print(root.data + " ");
	    if (tmp.left != null)
	        preOrder(root.left);
	    if (tmp.right != null)
	        preOrder(root.right);
	}
}
