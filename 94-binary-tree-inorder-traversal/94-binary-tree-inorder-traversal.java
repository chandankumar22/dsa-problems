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

//VIA LOOP
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<>(); 
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.peek();
            if(node==null){
                stack.pop();
                if(stack.isEmpty()) break;
                TreeNode top = stack.pop();
                ans.add(top.val);
                stack.push(top.right);
            }else stack.push(node.left);
        }
        return ans;
    }
}