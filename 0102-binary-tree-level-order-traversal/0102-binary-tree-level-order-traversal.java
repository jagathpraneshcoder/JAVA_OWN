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

        if(root==null) return new ArrayList<>();

        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode current = root;
        q.add(current);
        while(!q.isEmpty()){
            List<Integer> list = new ArrayList<Integer>();
            int count = q.size();
            while(count-->0){
                current=q.poll();
                list.add(current.val);
                if(current.left!=null) q.add(current.left);
                if(current.right!=null) q.add(current.right);
            }
            result.add(new ArrayList<>(list));
        }
        return result;
    }
}