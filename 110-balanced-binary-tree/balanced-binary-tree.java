/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxHeight(TreeNode root) {
        if (root == null) return 0;
        int left = 1 + maxHeight(root.left);
        int right = 1 + maxHeight(root.right);
        return Math.max(left, right);
    }
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;

        if (Math.abs(maxHeight(root.left) - maxHeight(root.right)) > 1) return false;
        
        boolean left = isBalanced(root.left);
        boolean right = isBalanced(root.right);
        return left && right;
    }
}