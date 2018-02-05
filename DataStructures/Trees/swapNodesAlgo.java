import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class swapNodesAlgo {
	static void swapAt(int children[][], int idx, int k, int depth) {
		if (children[idx][0] != -1) swapAt(children, children[idx][0] - 1, k, depth + 1);
		if (children[idx][1] != -1) swapAt(children, children[idx][1] - 1, k, depth + 1);
		if (depth % k == 0) {
			int tmp = children[idx][0];
			children[idx][0] = children[idx][1];
			children[idx][1] = tmp;
		}
	}
	
	static void inOrderTraversal(int children[][], int idx) {
		if (children[idx][0] != -1) inOrderTraversal(children, children[idx][0] - 1);
		System.out.print((idx + 1) + " ");
		if (children[idx][1] != -1) inOrderTraversal(children, children[idx][1] - 1);
	}
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int children[][] = new int[N][2];
        for(int i = 0; i < N; i++){
        	children[i][0] = in.nextInt();
        	children[i][1] = in.nextInt();
        }
        
        int T = in.nextInt();
        for(int i = 0; i < T; i++){
        	swapAt(children, 0, in.nextInt(), 1); 
        	inOrderTraversal(children, 0);
        }
        System.out.println();
    }
}
