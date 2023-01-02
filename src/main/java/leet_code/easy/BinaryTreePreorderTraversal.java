package leet_code.easy;

import java.util.ArrayList;
import java.util.List;
import leet_code.common.TreeNode;

/**
 * This class provides solution for a puzzle described <a href="https://leetcode.com/problems/binary-tree-preorder-traversal/">here</a>
 */
public class BinaryTreePreorderTraversal {

    private final List<Integer> result = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) return result;
        result.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return result;
    }
}
