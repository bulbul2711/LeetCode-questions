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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer> inordermap = new HashMap<>();
        for(int i=0;i<inorder.length;i++)
            inordermap.put(inorder[i],i);
        TreeNode root=build(preorder, 0 , preorder.length-1,  inorder, 0 , inorder.length-1 , inordermap);
        return root;
    }
    TreeNode build(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd, Map<Integer,Integer> map){
        if(preStart>preEnd || inStart>inEnd)
            return null;
        TreeNode root = new TreeNode(preorder[preStart]);
        int inroot = map.get(root.val);
        int numsLeft = inroot-inStart;
        root.left = build(preorder, preStart+1, preStart+numsLeft,  inorder, inStart, inroot-1, map);
        root.right = build(preorder, preStart+numsLeft+1, preEnd,  inorder, inroot+1, inEnd, map);  
        return root;
    }
}