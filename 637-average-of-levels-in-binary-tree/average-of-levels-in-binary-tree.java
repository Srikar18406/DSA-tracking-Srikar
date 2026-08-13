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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<Double> l = new ArrayList<>();
        if(root==null) return l;
        q.offer(root);
        while(!q.isEmpty()){
            
            int s = q.size();
            long sum = 0;
            for(int i = 0 ; i<s ; i++){
                TreeNode crr = q.poll();
                sum += crr.val;
                if(crr.left!=null) q.offer(crr.left);
                if(crr.right!=null) q.offer(crr.right);
            }
            l.add((double)sum/s);
        }
        return l;
    }
}