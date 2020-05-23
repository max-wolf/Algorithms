package org.ptkl.tree.completebinarytree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class CountNodeTest {

    CountNode countNode = new CountNode();

    @BeforeEach
    public void setUp() throws Exception {
    }

    @Test
    public void countNodes1() {
        List<String> list = Arrays.asList("9","5","10","3","8","#","#","1","4","7","#","#","#","#","#");
        TreeNode treeNode = TreeCreation.createTree(list, 0);
        int nodes1 = countNode.countNodes1(treeNode);
        System.out.println(nodes1);
    }
}