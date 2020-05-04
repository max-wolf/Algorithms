package org.ptkl.tree.bst.bstiterator;

import java.util.Stack;

/*
leetcode 173.二叉搜索树迭代器
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class BSTIterator {

    private Stack<TreeNode> stack;

    public BSTIterator(TreeNode root) {
        TreeNode t = root;
        stack = new Stack<>();
        while (t != null) {
            stack.push(t);
            t = t.left;
        }
    }

    /**
     * @return the next smallest number
     */
    public int next() {
        TreeNode t = stack.pop();
        int res = t.val;
        TreeNode p = t.right;
        if (t.right != null) {

        }
        return 0;
    }

    /**
     * @return whether we have a next smallest number
     */
    public boolean hasNext() {
        return false;
    }
}
