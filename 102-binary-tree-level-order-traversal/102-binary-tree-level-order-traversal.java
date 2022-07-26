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
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        if(root==null) return ans;
        queue.add(root);
        while(!queue.isEmpty()){
            List<TreeNode> temp = new ArrayList<TreeNode>();
            while(!queue.isEmpty()){
                temp.add(queue.remove());
            }
            List<Integer> tempAns = new ArrayList<Integer>();
            for(int i=0;i<temp.size();i++){
                if(temp.get(i).left!=null) queue.add(temp.get(i).left);
                if(temp.get(i).right!=null) queue.add(temp.get(i).right);
                tempAns.add(temp.get(i).val);
            }
            ans.add(tempAns);
        }
        
        return ans;
    }
}