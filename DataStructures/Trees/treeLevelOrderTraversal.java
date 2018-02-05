import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class treeLevelOrderTraversal {
	/* 
	class Node 
	    int data;
	    Node left;
	    Node right;
	*/
	void levelOrder(Node root) {
	    LinkedList<Node> save = new LinkedList<Node>();
	    save.addLast(root);
	    while(!save.isEmpty()) {
	        Node x = save.removeFirst();
	        System.out.print(x.data + " ");
	        if (x.left != null)
	            save.addLast(x.left);
	        if (x.right != null)
	            save.addLast(x.right);
	    }

	}
}
