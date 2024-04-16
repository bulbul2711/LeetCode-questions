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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1){
            TreeNode node=new TreeNode(val);
            node.left=root;
            return node;
        }
        return dfs(root,val,depth,1);
    }
    public TreeNode dfs(TreeNode root, int val, int depth, int currDepth){
        if(root==null)
            return null;
        if(currDepth==depth-1){
            TreeNode l=root.left;
            TreeNode r=root.right;
            root.left=new TreeNode(val);
            root.right=new TreeNode(val);
            root.left.left=l;
            root.right.right=r;
            return root;
        }
        TreeNode left=dfs(root.left, val, depth, currDepth+1);
        TreeNode right=dfs(root.right, val, depth, currDepth+1);
        return root;
    }
}