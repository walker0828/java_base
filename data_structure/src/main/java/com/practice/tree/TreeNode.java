package com.practice.tree;

import lombok.Data;
import sun.reflect.generics.tree.Tree;

/**
 * 树，一般用于搜索 查找
 *
 * 常用函数：
 * 1. 获得树的最大高度 height() 获得树的最小高度
 * 2. 获得树的节点数 size()
 * 3. 三种遍历方式
 * 4. 判断是否为二叉搜索树
 * 5. 镜像二叉树
 * 6.
 */
@Data
public class TreeNode<T> {
    private int data;
    TreeNode left;
    TreeNode right;

    public TreeNode getLeft() {
        return this.left;
    }

    public TreeNode getRight() {
        return this.right;
    }

    public TreeNode(int data) {
        this.data = data;
    }

    public int height(TreeNode<T> node) {
        if(node == null) {
            return 0;
        }else{
            int i = height(node.getLeft());
            int j = height(node.getRight());
            return (i < j) ? (j+1) : (i+1);
        }
    }

    public int size(TreeNode node) {
        if(node == null) {
            return 0;
        }else{
            return 1 + size(node.getLeft()) + size(node.getRight());
        }
    }

    public void destroy(TreeNode node) {
        if(node != null) {
            destroy(node.getLeft());
            destroy(node.getRight());
            node = null;
        }
    }

    public void preOrder(TreeNode node) {
        System.out.println(node.getData());
        preOrder(node.getLeft());
        preOrder(node.getRight());
    }

    public void inOrder(TreeNode node) {

    }

    public void postOrder(TreeNode node) {

    }

}
