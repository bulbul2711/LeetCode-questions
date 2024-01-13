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
    //     Map<Integer,Integer> map=new HashMap<>();
    //     for(int i=0;i<inorder.length;i++)
    //         map.put(inorder[i],i);
    //     TreeNode root=build(inorder,0,inorder.length-1, postorder,0,postorder.length-1, map);
    //     return root;
    // }
    // TreeNode build(int[] inorder,int inS,int inE, int[] postorder,int poS,int poE, Map<Integer,Integer> map){
    //     if(inS>inE || poS>poE)
    //         return null;
    //     TreeNode root=new TreeNode(postorder[poE]);
    //     int inroot=map.get(postorder[poE]);
    //     int numsLeft=inroot-inS;
    //     root.left = build(inorder,inS,inroot-1, postorder,poS,poS+numsLeft-1, map);
    //     root.right=build(inorder,inroot+1,inE, postorder,poS+numsLeft,poE-1, map);
    //     return root;
        
          if (postorder.length == 0 || inorder.length == 0) {
            return null;
        }

        TreeNode root = new TreeNode(postorder[postorder.length-1]);
        int mid = findIndex(inorder, postorder[postorder.length-1]);
        root.left = buildTree(Arrays.copyOfRange(inorder, 0, mid),
                              Arrays.copyOfRange(postorder, 0, mid));
        root.right = buildTree(Arrays.copyOfRange(inorder, mid + 1, inorder.length),Arrays.copyOfRange(postorder, mid, postorder.length-1));

        return root;
    }

    private int findIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }
}