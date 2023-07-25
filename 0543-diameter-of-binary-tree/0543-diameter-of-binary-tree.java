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
    int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
        check(root);
        return max;
    }
    int check(TreeNode root){
        if(root==null)
            return 0;
      
        int lh=check(root.left);
        int rh=check(root.right);
       // System.out.println(lh+" "+rh);
          max=Math.max(lh+rh,max);
        return 1+Math.max(lh,rh);
      
}
}