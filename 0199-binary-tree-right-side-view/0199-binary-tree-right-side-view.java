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
class pair{
    TreeNode node;
    int level;
    pair(TreeNode node,int level){
        this.node=node;
        this.level=level;
    }
}
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> res=new ArrayList<>();
        if(root==null) return res;
        Queue<pair> q=new LinkedList<>();        //(Node,level)
        Map<Integer,Integer> map=new TreeMap<>(); //(level,Node.data)
        q.offer(new pair(root,0));
        while(!q.isEmpty()){
            pair p=q.poll();
            TreeNode temp=p.node;
            int level=p.level;
            if(!map.containsKey(level))
               map.put(level,temp.val);
            if(temp.right!=null)
               q.offer(new pair(temp.right,level+1));
            if(temp.left!=null)
               q.offer(new pair(temp.left,level+1));
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet())
           res.add(entry.getValue());
        return res;
    }
}