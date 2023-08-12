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
    public TreeNode bstFromPreorder(int[] preorder) {
        int i=0;
        return consBST(preorder, new int[]{0}, Integer.MAX_VALUE);
    }
    TreeNode consBST(int[] A, int i[], int bound){
        if(i[0]==A.length || A[i[0]]>bound) return null;
        TreeNode root=new TreeNode(A[i[0]++]);
        root.left=consBST(A,i,root.val);
        root.right=consBST(A,i,bound);
        return root;
    }
}