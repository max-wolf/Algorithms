package org.ptkl.tree.completebinarytree;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CountNodeTest {

    CountNode countNode = new CountNode();

    @Before
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