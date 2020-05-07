package org.ptkl.tree.completebinarytree;

import java.util.List;

/**
 * 通过数组构造二叉树，#表示空节点
 * 数组形式为["9","5","10","3","8","#","#","1","4","7","#","#","#","#","#"]
 */
public class TreeCreation {

    private static int listLen = -1;

    public static TreeNode createTree(List<String> list, int index) {
        if (listLen == -1) {
            listLen = list.size();
        }
        TreeNode treeNode = null;
        if (index < listLen) {
            if ("#".equals(list.get(index))) {
                return null;
            } else {
                int val = Integer.parseInt(list.get(index));
                treeNode = new TreeNode(val);
                treeNode.left = createTree(list, 2 * index + 1);
                treeNode.right = createTree(list, 2 * index + 2);
                return treeNode;
            }
        }
        return treeNode;
    }

}
