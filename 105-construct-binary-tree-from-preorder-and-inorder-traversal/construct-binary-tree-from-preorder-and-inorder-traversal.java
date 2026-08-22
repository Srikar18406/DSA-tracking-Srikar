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
        return helper(preorder , inorder , Integer.MAX_VALUE);
    }
    int pi = 0;
    int ii = 0;
    public TreeNode helper (int[]preorder , int[]inorder , int stop){
        if(pi>=preorder.length){
            return null;
        }
        if(inorder[ii] == stop){
            ii ++;
            return null;
        }
        TreeNode root = new TreeNode(preorder[pi++]);
        root.left = helper(preorder , inorder , root.val);
        root.right = helper(preorder , inorder , stop);
        return root;
    }
}