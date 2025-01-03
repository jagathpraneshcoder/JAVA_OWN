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
    public int heightTree(TreeNode root,int[] maxi){
        if(root==null) return 0;
        int lh=heightTree(root.left,maxi);
        int rh=heightTree(root.right,maxi);
        maxi[0] = Math.max(maxi[0],lh+rh);
        return Math.max(lh,rh)+1;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        int[] maxi = new int[1];
        heightTree(root,maxi);
        return maxi[0];       
    }
}