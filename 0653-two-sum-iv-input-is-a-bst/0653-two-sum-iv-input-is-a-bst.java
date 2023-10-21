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

class BSTIterator{
    Stack<TreeNode> st=new Stack<>();
    boolean reverse=true;
    BSTIterator(TreeNode root,boolean isReversed){
        reverse=isReversed;
        pushAll(root);
    }
    public void pushAll(TreeNode root){
        while(root!=null){
            st.push(root);
            if(!reverse){
                root=root.left;
            }
            else{
                root=root.right;
            }
        }
    }
    int next(){
        TreeNode node=st.pop();
        if(!reverse)
             pushAll(node.right);
        else
             pushAll(node.left);
        return node.val;
    }
    boolean hasNext(){
        return !st.isEmpty();
    }
}
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        BSTIterator l = new BSTIterator(root,false);
        BSTIterator r = new BSTIterator(root,true);
        int i=l.next();
        int j=r.next();
        while(i!=j){
            if(i+j==k)
                return true;
            else if(i+j<k)
                i=l.next();
            else
                j=r.next();
        }
        return false;
    }
}