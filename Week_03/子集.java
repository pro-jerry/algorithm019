class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        if (nums == null) {return ans;}
        dfs(ans,nums,new ArrayList<Integer>(),0);
        return ans;
    }

    private void dfs(List<List<Integer>> ans, int[] nums, ArrayList<Integer> list, int index) {

        if (index == nums.length) {
            ans.add(new ArrayList<>(list));
            return;
        }

        dfs(ans,nums,list,index+1);

        list.add(nums[index]);
        dfs(ans,nums,list,index+1);

        list.remove(list.size()-1);

    }
}