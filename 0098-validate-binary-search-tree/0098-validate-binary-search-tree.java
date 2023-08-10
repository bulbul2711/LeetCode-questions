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
    public boolean isValidBST(TreeNode root) {
        return isBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    boolean isBST(TreeNode root, long minval, long maxval){
        if(root==null)
            return true;
        if(minval>=root.val || maxval<=root.val)
            return false;
        return (isBST(root.left,minval,root.val) 
                && isBST(root.right,root.val,maxval));
    }
}