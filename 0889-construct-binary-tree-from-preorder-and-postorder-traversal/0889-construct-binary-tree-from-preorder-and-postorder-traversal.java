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
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
         if (preorder.length == 0 || postorder.length == 0) {
            return null;
        }
        if(preorder.length == 1 && postorder.length == 1)
            return new TreeNode(preorder[0]);

        TreeNode root = new TreeNode(preorder[0]);
        int mid = findIndex(postorder, preorder[1]);

root.left = constructFromPrePost(Arrays.copyOfRange(preorder, 1, mid + 2),
                              Arrays.copyOfRange(postorder, 0, mid+1));
        root.right = constructFromPrePost(Arrays.copyOfRange(preorder, mid + 2, preorder.length),Arrays.copyOfRange(postorder, mid + 1, postorder.length-1));

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