import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class binarySearchTreeLowestCommonAncestor {

/* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;

    */

	static Node lca(Node root,int v1,int v2)
	{
	    //System.out.println(root.data);
	    if (root.data > v1 && root.data > v2) return lca(root.left, v1, v2);
	    else if (root.data < v1 && root.data < v2) return lca(root.right, v1, v2);
	    return root;
	}
}
