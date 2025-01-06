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
    int height(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        if(root.left==null&&root.right==null) return 0;
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh+rh,Math.max(diameterOfBinaryTree(root.left),diameterOfBinaryTree(root.right)));
    }
}