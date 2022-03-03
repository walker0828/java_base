package com.practice.tree.examples;

import com.practice.tree.TreeNode;

public class isValidBST {
    public boolean isValidBST(TreeNode root) {
        return check(root);
    }

    private boolean check(TreeNode node) {
        if(node.getLeft() == null && node.getRight() == null) {
            return true;
        }else if(node.getLeft() != null && node.getRight() != null) {
            if(node.getLeft().getData() < node.getData() && node.getRight().getData() > node.getData()) {
                if(check(node.getLeft())) {
                    return check(node.getRight());
                }
            }else{
                return false;
            }
        }else{
            return false;
        }
        return false;
    }
}
