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
        Queue<TreeNode> queue=new LinkedList<>();
        if(root==null)
            return res;
        queue.offer(root);
        boolean LeftToRight=true;
        while(!queue.isEmpty()){
            int size=queue.size();
           // System.out.println(size);
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node=queue.poll();
                // int index = LeftToRight ? i:size-1-i;
                // list.add(index,node.val);
                
                if (LeftToRight) {
                    list.add(node.val);
                } else {
                    list.add(0, node.val); // Insert at the beginning for zigzag order
                }
                if(node.left!=null)
                    queue.offer(node.left);
                if(node.right!=null)
                    queue.offer(node.right);
            }
            res.add(list);
            LeftToRight=!LeftToRight;
        }
        return res;
    }
}