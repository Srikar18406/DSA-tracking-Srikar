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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer> l = new ArrayList<>();
            int s = q.size();
            for(int i = 0 ; i<s ; i++){
                TreeNode crr = q.poll();
                l.add(crr.val);
                if(crr.left!=null) q.offer(crr.left);
                if(crr.right!=null) q.offer(crr.right);
            }
            res.add(l);
        }
        return res;
    }
}