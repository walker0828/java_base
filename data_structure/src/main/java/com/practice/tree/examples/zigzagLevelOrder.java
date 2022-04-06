package com.practice.tree.examples;

import com.practice.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 给你二叉树的根节点 root ，返回其节点值的 锯齿形层序遍历 。
 * （即先从左往右，再从右往左进行下一层遍历，以此类推，层与层之间交替进行）。
 */
public class zigzagLevelOrder {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        processZigzagLevelOrder(result,root);
        return result;
    }

    private List<List<Integer>> processZigzagLevelOrder(List<List<Integer>> result, TreeNode root) {
        List<Integer> zzLevel = new ArrayList<Integer>();
        zzLevel.add(root.getData());
        result.add()
    }

}
