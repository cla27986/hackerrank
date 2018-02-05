def insert(root, val):
    # Normal BST insertion
    if root is None:
        return Node(val)
    else :
        if root.data < val:
            root.right = insert(root.right, val)
        elif root.data > val:
            root.left = insert(root.left, val)
        else :
            return root
    return root
