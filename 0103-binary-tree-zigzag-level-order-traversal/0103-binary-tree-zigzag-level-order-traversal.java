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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode> queue=new ArrayDeque<>();
        if(root==null)
            return res;
        queue.offer(root);
        boolean LeftToRight=true;
        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node=queue.poll(); //works like pop in stack
                if (LeftToRight)
                    list.add(node.val);
                else
                    list.add(0, node.val);
                
                if(node.left!=null)
                    queue.offer(node.left); //works like push in stack
                if(node.right!=null)
                    queue.offer(node.right);
            }
            res.add(list);
            LeftToRight=!LeftToRight;
        }
        return res;
    }
}