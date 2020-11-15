class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        
       List<Integer> res = new ArrayList<>();
       currOrder(res,root);

       return res;
    }

    public void currOrder(List res, TreeNode root) {

        if (root == null) {
            return;
        }

        currOrder(res,root.left);
        res.add(root.val);
        currOrder(res,root.right);
    }

   
}