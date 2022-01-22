package leet_code.easy;

import leet_code.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * This class provides solution for a puzzle described <a href="https://leetcode.com/problems/binary-tree-inorder-traversal/">here</a>
 */
public class BinaryTreeInorderTraversal {

    private final List<Integer> result = new ArrayList<>();

    public List<Integer> inorderTraversalRecursive(TreeNode root) {
        if (root == null) return result;
        inorderTraversalRecursive(root.left);
        result.add(root.val);
        inorderTraversalRecursive(root.right);
        return result;
    }
}



