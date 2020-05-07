package org.ptkl.tree.completebinarytree;

/*
leetcode 222.完全二叉树的节点个数
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class CountNode {

    /**
     * 二叉树计算节点通用解法
     * @param root
     * @return
     */
    public int countNodes(TreeNode root) {
        return root == null ? 0 : 1 + countNodes(root.left) + countNodes(root.right);
    }

    /**
     * 利用完全二叉树的特点
     * @param root
     * @return
     */
    public int countNodes1(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = countHeight(root.left);
        int rightHeight = countHeight(root.right);
        if (leftHeight == rightHeight) {
            return (int) Math.pow(2, leftHeight) + countNodes1(root.right);
        } else {
            return (int) Math.pow(2, rightHeight) + countNodes1(root.left);
        }
    }

    /**
     * 计算高度，仅适用于完全二叉树和满二叉树
     * @param root
     * @return
     */
    private int countHeight(TreeNode root) {
        int h = 0;
        while (root != null) {
            h++;
            root = root.left;
        }
        return h;
    }
}
