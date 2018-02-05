import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class treeHeightOfABinaryTree {
	static int height(Node root) {
        Node tmp = root;
        int ret = 1;
        int left = 0, right = 0;
        if (tmp.left != null)
            left = height(root.left);
        if (tmp.right != null)
            right = height(root.right);
        if ((tmp.left == null) && (tmp.right == null))
            return 0;
        ret += Math.max(left, right);
        return ret;
    }
}
