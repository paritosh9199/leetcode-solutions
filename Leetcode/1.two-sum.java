/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // List<Integer> c = new ArrayList<Integer>();
        int res[] = new int[2];
        int length = nums.length;
        for(int i = 0; i<length; i++){
            for (int j = i; j<length; j++){
                if (nums[i] + nums[j] == target && i != j){
                    res[0] = j;
                    res[1] = i;
                }
            }
        }
        
        return res;
    }
}
// @lc code=end

