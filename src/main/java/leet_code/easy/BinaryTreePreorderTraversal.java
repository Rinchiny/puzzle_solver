package leet_code.easy;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {

    private final List<Integer> result = new ArrayList<>();

    public List<Integer> preorderTraversal(BinaryTreeInorderTraversal.TreeNode root) {
        if (root == null) return result;
        result.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return result;
    }
}
