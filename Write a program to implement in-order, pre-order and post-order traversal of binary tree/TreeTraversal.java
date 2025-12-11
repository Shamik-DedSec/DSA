class TNode {
    int value;
    TNode left;
    TNode right;
    TNode(int v) { value = v; }
}

public class TreeTraversal {
    void inorder(TNode root) {
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.value+" ");
        inorder(root.right);
    }
    void preorder(TNode root) {
        if(root==null) return;
        System.out.print(root.value+" ");
        preorder(root.left);
        preorder(root.right);
    }
    void postorder(TNode root) {
        if(root==null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.value+" ");
    }
}
