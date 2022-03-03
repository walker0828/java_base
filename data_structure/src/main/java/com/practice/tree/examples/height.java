package com.practice.tree.examples;

import com.practice.tree.TreeNode;

public class height {
    public static int height(TreeNode node) {
        if(node == null) {
            return 0;
        }else{
            int i = height(node.getLeft());
            int j = height(node.getRight());
            return (i < j) ? (j+1) : (i+1);
        }
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(0);
        node.setLeft(new TreeNode(1));
        node.setRight(new TreeNode(2));

        
        node.getRight().setLeft(new TreeNode(3));
        node.getRight().getLeft().setLeft(new TreeNode(4));
        node.getLeft().setLeft(new TreeNode(3));
        node.getLeft().getLeft().setLeft(new TreeNode(4));

        int result = height(node);
        System.out.println(result);
    }
}
