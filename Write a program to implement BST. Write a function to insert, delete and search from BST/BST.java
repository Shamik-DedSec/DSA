class BNode {
    int value;
    BNode left;
    BNode right;
    BNode(int v) { value=v; }
}

public class BST {
    BNode insert(BNode root, int v) {
        if(root==null) return new BNode(v);
        if(v < root.value) root.left = insert(root.left,v);
        else root.right = insert(root.right,v);
        return root;
    }

    BNode delete(BNode root, int v) {
        if(root==null) return null;
        if(v < root.value) root.left = delete(root.left,v);
        else if(v > root.value) root.right = delete(root.right,v);
        else {
            if(root.left==null) return root.right;
            if(root.right==null) return root.left;
            BNode t = root.right;
            while(t.left!=null) t = t.left;
            root.value = t.value;
            root.right = delete(root.right,t.value);
        }
        return root;
    }

    boolean search(BNode root, int v) {
        if(root==null) return false;
        if(root.value==v) return true;
        if(v < root.value) return search(root.left,v);
        return search(root.right,v);
    }
}
