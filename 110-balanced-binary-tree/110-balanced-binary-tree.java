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
    public boolean isBalanced(TreeNode root) {
        int ans = checkHeight(root);
        return ans!=-1;
    }
    
    public int checkHeight(TreeNode root){
        if(root==null) return 0;
        int leftHeight = checkHeight(root.left);
        int rightHeight = checkHeight(root.right);
        if(leftHeight==-1 || rightHeight==-1 || Math.abs(leftHeight-rightHeight)>1) return -1;
        return 1+Math.max(leftHeight,rightHeight);
    }
}