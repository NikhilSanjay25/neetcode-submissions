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
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        int val = diameterOfBinaryTree1(root);
        return Math.max(val,max);
        
    };
    public int diameterOfBinaryTree1(TreeNode root) {
        if(root==null){
            return -1;
        }
        int left = diameterOfBinaryTree1(root.left) + 1 ;
        int right = diameterOfBinaryTree1(root.right) + 1 ;
        max = Math.max(left+right,max);
        return Math.max(left,right);
    }; 
}
