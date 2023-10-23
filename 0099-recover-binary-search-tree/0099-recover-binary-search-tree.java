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
    TreeNode first,mid,last,prev;
    private void inorder(TreeNode root){
        if(root==null)
            return;
        inorder(root.left);
        if(prev.val>root.val){
            if(first==null){
                first=prev;
                mid=root;
            }
            else
                last=root;
        }
        prev=root;
        inorder(root.right);
    }
    public void recoverTree(TreeNode root) {
        first=null;mid=null;last=null;
        prev=new TreeNode(Integer.MIN_VALUE);
        inorder(root);
        if(first!=null && last!=null){
            int t=first.val;
            first.val=last.val;
            last.val=t;
        }
        else if(first!=null && mid!=null){
            int t=first.val;
            first.val=mid.val;
            mid.val=t;
        }
    }
}