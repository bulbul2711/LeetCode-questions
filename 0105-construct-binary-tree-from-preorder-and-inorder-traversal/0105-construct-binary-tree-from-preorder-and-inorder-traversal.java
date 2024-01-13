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
//         Map<Integer,Integer> inordermap = new HashMap<>();
//         for(int i=0;i<inorder.length;i++)
//             inordermap.put(inorder[i],i);
//         TreeNode root=build(preorder, 0 , preorder.length-1,  inorder, 0 , inorder.length-1 , inordermap);
//         return root;
//     }
    
//     TreeNode build(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd, Map<Integer,Integer> map){
//         if(preStart>preEnd || inStart>inEnd)
//             return null;
//         TreeNode root = new TreeNode(preorder[preStart]);
//         int inroot = map.get(root.val);
//         int numsLeft = inroot-inStart;
//         root.left = build(preorder, preStart+1, preStart+numsLeft,  inorder, inStart, inroot-1, map);
//         root.right = build(preorder, preStart+numsLeft+1, preEnd,  inorder, inroot+1, inEnd, map);  
//         return root;
        
          if (preorder.length == 0 || inorder.length == 0) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[0]);
        int mid = findIndex(inorder, preorder[0]);
        root.left = buildTree(Arrays.copyOfRange(preorder, 1, mid + 1),
                              Arrays.copyOfRange(inorder, 0, mid));
        root.right = buildTree(Arrays.copyOfRange(preorder, mid + 1, preorder.length),Arrays.copyOfRange(inorder, mid + 1, inorder.length));

        return root;
    }

    private int findIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == target)
                return i;
        }
        return 0;
    }
}