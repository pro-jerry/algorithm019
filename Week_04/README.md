学习笔记

最重要的还是模板，直接上代码模板
DFS深度优先遍历模板
public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> results = new ArrayList<>();

        if (root == null) {
            return  results;
        }

        travel(root,0,results);

        return results;

    }


private void travel(TreeNode root, int level, List<List<Integer>> results) {

        if (results.size() == level) {
            results.add(new ArrayList<>());
        }

        results.get(level).add(root.val);

        if (root.left!=null) {
            travel(root.left,level+1,results);
        }

        if (root.right!=null) {
            travel(root.right,level+1,results);
        }

    }
    
BFS广度优先遍历模板

public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> allResults = new ArrayList<>();
        if (root == null) {
            return  allResults;
        }

        Queue<TreeNode> results = new LinkedList<>();
        results.add(root);

        while (!results.isEmpty()) {

            int size = results.size();
            List<Integer> nodes = new ArrayList<>();
            for (int i=0;i<size;i++) {

                TreeNode node = results.poll();
                nodes.add(node.val);
                if (node.left!=null) {
                    results.add(node.left);
                }

                if (node.right!=null) {
                    results.add(node.right);
                }
            allResults.add(nodes);
            }
        }

        return allResults;
    }

动态规划模板
public int coinChange(int[] coins, int amount) {

        if (amount < 1) {
            return 0;
        }

        return coinChange(coins,amount,new int[amount]);
    }

    private int coinChange(int[] coins, int amount, int[] count) {

        if (amount < 0) {
            return -1;
        }

        if (amount == 0) {
            return 0;
        }

        if (count[amount-1]!=0) {
            return count[amount-1];
        }

        int min = Integer.MAX_VALUE;

        for (int coin : coins) {
            int res = coinChange(coins,amount-coin,count);
            if (res >= 0 && res < min) {
                min = 1 + res;
            }
        }
        count[amount-1] = (min == Integer.MAX_VALUE)?-1:min;
        return count[amount-1];
    }


二分查找模板

public int binarySearch(int[] array, int target) {
    int left = 0, right = array.length - 1, mid;
    while (left <= right) {
        mid = (right - left) / 2 + left;

        if (array[mid] == target) {
            return mid;
        } else if (array[mid] > target) {
            right = mid - 1;
        } else {
            left = mid + 1;
        }
    }

    return -1;
}
class Solution {

    public int search(int[] nums, int target) {
        // 特殊用例判断
        int len = nums.length;
        if (len == 0) {
            return -1;
        }
        // 在 [left, right] 区间里查找 target
        int left = 0;
        int right = len - 1;
        while (left <= right) {
            // 为了防止 left + right 整形溢出，写成如下形式
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                // 下一轮搜索区间：[left, mid - 1]
                right = mid - 1;
            } else {
                // 此时：nums[mid] < target，下一轮搜索区间：[mid + 1, right]
                left = mid + 1;
            }
        }
        return -1;
    }
}

















    
    
    
    
    















