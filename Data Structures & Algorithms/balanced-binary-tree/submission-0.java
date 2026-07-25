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
    boolean flag = true;
    public boolean isBalanced(TreeNode root) {
        max(root);
        return flag;
    }
    private void max(TreeNode root){
        if(root==null){
            return;
        }
        int left = 1 + height(root.left);
        int right = 1 + height(root.right);
        if(Math.abs(left-right)>1){
            flag = false;
            return ;
        }
        max(root.left);
        max(root.right);
    }
    private int height(TreeNode root){
        if(root==null){
            return 0;
        }
        return Math.max(height(root.left),height(root.right))+1;
    }
}
