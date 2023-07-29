/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode,TreeNode> parentTrack=new HashMap<>();
        markParent(root,parentTrack);
        Queue<TreeNode> q=new ArrayDeque<>();
        Map<TreeNode,Boolean> visited=new HashMap<>();
        q.offer(target);
        visited.put(target,true);
        int curLevel=0;
        while(!q.isEmpty()){
            int size=q.size();
            if(curLevel==k)
                break;
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                if(curr.left!=null && !visited.containsKey(curr.left)){
                    q.offer(curr.left);
                    visited.put(curr.left,true);
                }
                if(curr.right!=null && !visited.containsKey(curr.right)){
                    q.offer(curr.right);
                    visited.put(curr.right,true);
                }
                if(parentTrack.containsKey(curr) && !visited.containsKey(parentTrack.get(curr))){
                    q.offer(parentTrack.get(curr));
                    visited.put(parentTrack.get(curr),true);
                }
            }
            curLevel++;
        }
        List<Integer> res=new ArrayList<>();
        while(!q.isEmpty()){
            res.add(q.poll().val);
        }
        return res;
    }
    void markParent(TreeNode root,Map<TreeNode,TreeNode> parentTrack){
        Queue<TreeNode> q=new ArrayDeque<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode curr=q.poll();
            if(curr.left!=null){
                q.offer(curr.left);
                parentTrack.put(curr.left,curr);
            }
            if(curr.right!=null){
                q.offer(curr.right);
                parentTrack.put(curr.right,curr);
            }
        }
    }
}