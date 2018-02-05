import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class treeHuffmanDecoding {

	/*  
	   class Node
	      public  int frequency; // the frequency of this tree
	       public  char data;
	       public  Node left, right;
	    
	*/ 

	void decode(String S ,Node root)
	{
	    Node tmp = root;
	    char c;
	    for(int i = 0; i < S.length(); i++) {
	        c = S.charAt(i);
	        if (c == '0'){ 
	            tmp = tmp.left;
	        }
	        else{ 
	            tmp = tmp.right;
	        }
	        
	        if (tmp.data != '\0') {
	            System.out.print(tmp.data);
	            tmp = root;
	        }
	    } 
	    System.out.println();
	    
	}
}
