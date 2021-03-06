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
    
     public List<Integer> preorderTraversal(TreeNode root) {
         
         List<Integer> ans = new ArrayList<Integer>();
         if(root==null) return ans;
         Stack<TreeNode> stack = new Stack<TreeNode>();
         
         stack.push(root);
         while(!stack.isEmpty()){
             TreeNode node = stack.pop();
             ans.add(node.val);
             if(node.right!=null) stack.push(node.right);
             if(node.left!=null) stack.push(node.left);
         }
         
         return ans;
    }
    
    public List<Integer> preorderTraversalRecursion(TreeNode root) {
        return solve(root, new ArrayList<Integer>());
    }
    
    public List<Integer> solve(TreeNode root, List<Integer> ans){
        if(root==null){
            return ans;
        }
        ans.add(root.val);
        solve(root.left,ans);
        solve(root.right,ans);
        return ans;
    }
    
    
}