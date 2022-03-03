package com.practice.tree.examples;

import com.practice.tree.TreeNode;

public class minDepth {
    public int minDepth (TreeNode root) {
        if(root == null) {
            return 0;
        }
        if(root.getLeft() == null && root.getRight() == null) {
            return 1;
        }
        int ans = Integer.MAX_VALUE;
        if(root.getLeft() != null) {
            ans = Math.min(minDepth(root.getLeft()), ans);
        }

        if(root.getRight() != null) {
            ans = Math.min(minDepth(root.getRight()), ans);
        }
        return ans + 1;
    }
}
