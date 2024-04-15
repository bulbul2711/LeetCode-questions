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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)
            return false;
        return path(root,targetSum,0);
    }
    public boolean path(TreeNode root, int targetSum, int sum){
        if(root==null)
            return false;
        sum+=root.val;
        if(root.left==null && root.right==null){
            if(targetSum==sum)
                return true;
            else
                return false;
        }
        boolean left=path(root.left,targetSum,sum);
        boolean right=path(root.right,targetSum,sum);
        if(left==true || right==true)
            return true;
        return false;  
    }
}