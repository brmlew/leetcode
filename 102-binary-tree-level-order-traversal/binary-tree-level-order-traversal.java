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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        List<Integer> rootVal = new ArrayList<>();
        rootVal.add(root.val);
        result.add(rootVal);
        if (root.left != null) {
            List<List<Integer>> left = levelOrder(root.left);
            for (int i = 0; i < left.size(); i++) {
                result.add(left.get(i));
            }
        }

        if (root.right != null) {
            List<List<Integer>> right = levelOrder(root.right);
            for (int i = 0; i < right.size(); i++) {
                if (result.size() > i + 1) {
                    for (int j = 0; j < right.get(i).size(); j++) {
                        result.get(i + 1).add(right.get(i).get(j));
                    }
                } else {
                    result.add(right.get(i));
                }
                
            }
        }

        return result;
    }
}