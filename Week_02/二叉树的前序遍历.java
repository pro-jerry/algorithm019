class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> res = new ArrayList<>();
        preOrder(res,root);

        return res;
    }

    public void preOrder(List res,TreeNode root) {

        if (root == null) {
            return;
        }

        res.add(root.val);
        preOrder(res,root.left);
        preOrder(res,root.right);

    }
}