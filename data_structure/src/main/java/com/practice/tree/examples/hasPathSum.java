package com.practice.tree.examples;

import com.practice.tree.TreeNode;

public class hasPathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) {
            return false;
        }
        if(root.getLeft() == null && root.getRight() == null) {
            if(root.getData() == targetSum) {
                return true;
            }
            return false;
        }
        return hasPathSum(root.getLeft(),targetSum - root.getLeft().getData())
                || hasPathSum(root.getRight(),targetSum - root.getRight().getData());

    }
}
