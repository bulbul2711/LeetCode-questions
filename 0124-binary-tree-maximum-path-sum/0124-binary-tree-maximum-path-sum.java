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
    int maxi=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        //int value=root.val;
        heightSum(root);
        return maxi;
    }
    int heightSum(TreeNode root){
        if(root==null) return 0;
        int lsum=Math.max(0,heightSum(root.left));
        int rsum=Math.max(0,heightSum(root.right));
        maxi=Math.max(maxi,root.val+lsum+rsum);
        return root.val+Math.max(lsum,rsum);
    }
}