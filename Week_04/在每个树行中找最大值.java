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
    public List<Integer> largestValues(TreeNode root) {

        List<Integer> results = new ArrayList<>();

        if (root == null) {
            return results;
        }

        dfs(results,root);


        return results;
    }

    private void dfs(List<Integer> results, TreeNode root) {



        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {


            Integer minValue = Integer.MIN_VALUE;
         int size = queue.size();
         for (int i=0;i<size;i++) {

             TreeNode node = queue.poll();

             if (node.val>minValue) {
                 minValue = node.val;
             }

             if (node.left!=null) {
                 queue.add(node.left);
             }

             if (node.right!=null) {
                 queue.add(node.right);
             }

         }

         results.add(minValue);

        }

    }
}