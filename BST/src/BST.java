
class TreeNode {
    int data;
    TreeNode parent;
    TreeNode left;
    TreeNode right;
    public TreeNode(int data) {
        this.data = data;
        this.parent = null;
        this.left = null;
        this.right = null;
    }
}

public class BST {
    public TreeNode getMin(TreeNode root) {
        if(root == null) return null;
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public TreeNode getMax(TreeNode root) {
        if(root == null) return null;
        while (root.right != null) {
            root = root.right;
        }
        return root;
    }

    public TreeNode preNode(TreeNode root, TreeNode x) {
        //no preNode
        if(root == null || x == null || x == getMin(root)) return null;
        //x has left child
        if(x.left != null) {
            return getMax(x.left);
        }
        //x has no left child and x is right child
        TreeNode p = x.parent;
        if(p != null && p.right == x) return p;
        //x has no left child and x is left child
        while (p != null && p.left == x) {
            x = p;
            p = p.parent;
        }
        return p;
    }

    public TreeNode postNode(TreeNode root, TreeNode x) {
        if(root == null || x == null || x == getMax(root)) return null;
        if(x.right != null) {
            return getMin(x);
        }
        TreeNode p = x.parent;
        if(p != null && p.left == x) return p;
        while (p != null && p.right == x) {
            x = p;
            p = p.parent;
        }
        return p;
    }

    public TreeNode search(TreeNode root, int val) {
        if(root == null) return null;
        while (root != null) {
            if(val < root.data) {
                root = root.left;
            } else if(val > root.data) {
                root = root.right;
            } else return root;
        }
        return root;
    }

    public TreeNode insert(TreeNode root, TreeNode x) {
        if(root == null) {
            root = x;
            return root;
        }
        TreeNode p = null;
        while (root != null) {
            p = root;
            if(x.data < root.data) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
        x.parent = p;
        if(x.data < p.data)
            p.left = x;
        else p.right = x;
        return root;
    }

    public void delete(TreeNode root, int val) {

    }

    public void inorder(TreeNode root) {
        if(root == null) return;
        if(root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        int[] a = {3,9,23,8,2,7,5};
        TreeNode root = null;
        BST bst = new BST();
        for(int i : a) {
            TreeNode x = new TreeNode(i);
            root = bst.insert(root, x);
        }
        bst.inorder(root);
    }
}