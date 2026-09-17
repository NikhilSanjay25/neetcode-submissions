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
    int var = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        int temp = rec(root,0);
        return Math.max(var,temp);
    }
    private int rec(TreeNode root,int value){
        if(root==null){
            return value;
        }
        int l = rec(root.left,0);
        int r = rec(root.right,0);
        int lr = l+r;
        var = Math.max(var,Math.max(lr+root.val,root.val));
        return Math.max(r+root.val,Math.max(root.val,l+root.val));
    }
}
