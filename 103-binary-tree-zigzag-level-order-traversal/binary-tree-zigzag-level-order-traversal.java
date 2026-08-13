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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        q.offer(root);
        int level = 0;
        while(!q.isEmpty()){
            List<Integer> l = new ArrayList<>();
            if(level % 2 == 0){
                int s = q.size();
                for(int i = 0 ; i<s ; i++){
                    TreeNode crr = q.poll();
                    l.add(crr.val);
                    if(crr.left!=null) q.offer(crr.left);
                    if(crr.right!=null) q.offer(crr.right);
                }
                res.add(l);
                level++;
            }
            else{
                int s = q.size();
                for(int i =0 ; i<s ; i++){
                    TreeNode n = q.poll();
                    stack.push(n);
                    if(n.left!=null) q.offer(n.left);
                    if(n.right!=null) q.offer(n.right);
                }
                while(!stack.isEmpty()){
                    l.add(stack.pop().val);
                }
                res.add(l);
                level++;
            }
        }
        return res;
    }
}