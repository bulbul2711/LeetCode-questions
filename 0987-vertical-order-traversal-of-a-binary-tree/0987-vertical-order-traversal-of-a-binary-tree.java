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
class Tuple{
    TreeNode node;
    int vert;
    int level;
    Tuple(TreeNode node, int vert, int level){
        this.node=node;
        this.vert=vert;
        this.level=level;
    }
}
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Queue<Tuple> q=new LinkedList<>();
        Map<Integer, Map<Integer,PriorityQueue<Integer>>> map=new TreeMap<>();
        q.add(new Tuple(root,0,0));
        while(!q.isEmpty()){
            Tuple t=q.poll();
            TreeNode node=t.node;
            int vert=t.vert;
            int level=t.level;
            if(!map.containsKey(vert))
                map.put(vert,new TreeMap<>());
            if(!map.get(vert).containsKey(level))
                map.get(vert).put(level,new PriorityQueue<>());
            map.get(vert).get(level).offer(node.val);
            if(node.left!=null)
                q.add(new Tuple(node.left, vert-1, level+1));
            if(node.right!=null)
                q.add(new Tuple(node.right, vert+1, level+1));
        }
        List<List<Integer>> list=new ArrayList<>();
        for(Map<Integer,PriorityQueue<Integer>> m:map.values()){
            list.add(new ArrayList<>());
            for(PriorityQueue<Integer> v:m.values()){
                while(!v.isEmpty()){
                    list.get(list.size()-1).add(v.poll());
                }
            }
         }
        return list;
    }
}