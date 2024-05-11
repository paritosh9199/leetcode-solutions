/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 */

// @lc code=start
import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet hs = new HashSet<Integer>();

        for (int i = 0; i< nums.length; i++){
            if (hs.contains(nums[i])){
                return true;
            }
            hs.add(nums[i]);
        }
        return false;
    }
}
// @lc code=end

