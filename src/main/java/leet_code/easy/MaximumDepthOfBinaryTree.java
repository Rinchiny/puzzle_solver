package leet_code.easy;

import leet_code.common.TreeNode;

/**
 * This class provides solution for a puzzle described <a href="https://leetcode.com/problems/maximum-depth-of-binary-tree/">here</a>
 */
public class MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        return root == null
                ? 0
                : 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
