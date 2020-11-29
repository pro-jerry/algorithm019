/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> allResults = new ArrayList<>();

        if (root == null) {
            return allResults;
        }

        Queue<TreeNode> results = new LinkedList<>();
        results.add(root);
        while (!results.isEmpty()) {

            int size = results.size();
            List<Integer> nodes = new ArrayList<>();

            for (int i=0;i<size;i++) {

                TreeNode node =  results.poll();
                nodes.add(node.val);

                if (node.left!=null) {
                    results.add(node.left);
                }

                if (node.right!=null ) {
                    results.add(node.right);
                }

            }

            allResults.add(nodes);
        }

        return allResults;
    }
}