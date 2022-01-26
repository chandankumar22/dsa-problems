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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> tree1 = new ArrayList<>();
        List<Integer> tree2 = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        inorder(root1,tree1);
        inorder(root2,tree2);
        
        // System.out.println(tree1);
        // System.out.println(tree2);
        
        int i=0,j=0;
        while(i<tree1.size() && j<tree2.size()){
            if(tree1.get(i)<tree2.get(j)){
                ans.add(tree1.get(i));
                i++;
            }else{
                ans.add(tree2.get(j));
                j++;
            }
        }
        
        if(tree1.isEmpty()) return tree2;
        if(tree2.isEmpty()) return tree1;
        
        if(i<tree1.size()){
            for(int k=i;k<tree1.size();k++) ans.add(tree1.get(k));
        }
        if(j<tree2.size()){
            for(int k=j;k<tree2.size();k++) ans.add(tree2.get(k));
        }
        return ans;
    }
    
    public void inorder(TreeNode root,List<Integer> list){
        if(root==null) return;
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }
}