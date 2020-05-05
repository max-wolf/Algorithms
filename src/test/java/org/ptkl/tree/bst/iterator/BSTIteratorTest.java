package org.ptkl.tree.bst.iterator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class BSTIteratorTest {

    private static final Logger logger = LoggerFactory.getLogger(BSTIterator.class);

    TreeNode root = null;

    @BeforeEach
    void setUp() {
        root = new TreeNode(7);
        TreeNode p3 = new TreeNode(3);
        TreeNode p15 = new TreeNode(15);
        TreeNode p9 = new TreeNode(9);
        TreeNode p20 = new TreeNode(20);
        root.left = p3;
        root.right = p15;
        p15.left = p9;
        p15.right = p20;
    }

    @Test
    void demo() {
        BSTIterator obj = new BSTIterator(root);
        logger.info("next:{}", obj.next());
        logger.info("hasNext:{}", obj.hasNext());
        logger.info("next:{}", obj.next());
        logger.info("hasNext:{}", obj.hasNext());
        logger.info("next:{}", obj.next());
        logger.info("hasNext:{}", obj.hasNext());
        logger.info("next:{}", obj.next());
        logger.info("hasNext:{}", obj.hasNext());
        logger.info("next:{}", obj.next());
        logger.info("hasNext:{}", obj.hasNext());
    }

}