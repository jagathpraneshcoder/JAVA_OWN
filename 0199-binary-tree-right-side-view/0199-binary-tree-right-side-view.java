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
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null) return  new ArrayList<>();
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int count = q.size();
            while(count-->0){
                TreeNode current = q.poll();
                if(current.left!=null) q.add(current.left);
                if(current.right!=null) q.add(current.right);
                list.add(current.val);
            }
            Collections.reverse(list);
            result.add(new ArrayList<>(list));
        }
        for(int i=0;i<result.size();i++){
            ans.add(result.get(i).get(0));
        }
        return ans;
        
    }
}