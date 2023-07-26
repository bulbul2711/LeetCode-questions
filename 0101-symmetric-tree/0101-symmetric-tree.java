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
    public boolean isSymmetric(TreeNode root) {
        return symmetric(root.left,root.right);
    }
    boolean symmetric(TreeNode Left,TreeNode Right){
        if(Left==null || Right==null)
            return Left==Right;
        if(Left.val!=Right.val)
            return false;
        return (symmetric(Left.left,Right.right) 
                && symmetric(Left.right,Right.left));
    }
}