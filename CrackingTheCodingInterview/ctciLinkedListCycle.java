public class ctciLinkedListCycle {
	/*
	Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

	A Node is defined as: 
	    class Node {
	        int data;
	        Node next;
	    }
	*/

	boolean hasCycle(Node head) {
	    Set<Node> set = new HashSet<Node>();
	    Node tmp = head;
	    while(tmp != null) {
	        if (set.contains(tmp)) return true;
	        set.add(tmp);
	        tmp = tmp.next;
	    }
	    return false;
	}
}

