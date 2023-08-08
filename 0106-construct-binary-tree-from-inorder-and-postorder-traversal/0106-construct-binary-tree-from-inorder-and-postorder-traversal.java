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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length;i++)
            map.put(inorder[i],i);
        TreeNode root=build(inorder,0,inorder.length-1, postorder,0,postorder.length-1, map);
        return root;
    }
    TreeNode build(int[] inorder,int inS,int inE, int[] postorder,int poS,int poE, Map<Integer,Integer> map){
        if(inS>inE && poS>poE)
            return null;
        int inroot=map.get(postorder[poE]);
        TreeNode root=new TreeNode(inorder[inroot]);
        int numsRight=inE-inroot;
        root.left = build(inorder,inS,inroot-1, postorder,poS,poE-numsRight-1, map);
        root.right=build(inorder,inroot+1,inE, postorder,poE-numsRight,poE-1, map);
        return root;
    }
}