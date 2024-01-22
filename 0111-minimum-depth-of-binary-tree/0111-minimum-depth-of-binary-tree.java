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
    public int minDepth(TreeNode root) {
        //====DFS====//
       // if(root==null)
       //     return 0;
       //  if(root.left==null && root.right==null)
       //      return 1;
       //  if(root.left==null)
       //      return 1+minDepth(root.right);
       //  if(root.right==null)
       //      return 1+minDepth(root.left);
       //  return 1+Math.min(minDepth(root.left),minDepth(root.right));
        
        //==BFS==//
        if(root==null)
            return 0;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int depth=1;
        while(!q.isEmpty()){
            int size=q.size();
            while(size-- > 0){
                TreeNode node=q.poll();
                if(node.left==null && node.right==null)
                    return depth;
                if(node.left!=null)
                    q.add(node.left);
                if(node.right!=null)
                    q.add(node.right);
            }
            depth++;
        }
        return 0;
    }
}