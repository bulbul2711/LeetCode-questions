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
    // ArrayList<Integer> al=new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
    //     if(root!=null){
    //         al.add(root.val);
    //         if(root.left!=null)
    //         preorderTraversal(root.left);
    //         if(root.right!=null)
    //         preorderTraversal(root.right);
    // }
    //  return al;
        
    
        List<Integer> al=new ArrayList<>();
        if(root==null)
            return al;
        Stack<TreeNode> st=new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            root=st.pop();
            al.add(root.val);
            if(root.right!=null)
                st.push(root.right);
            if(root.left!=null)
                st.push(root.left);
        }
        return al;
    }
}