// @leetup=custom
// @leetup=info id=213 lang=java slug=house-robber-ii

/*
* You are a professional robber planning to rob houses along a street. Each house
* has a certain amount of money stashed. All houses at this place are arranged
* in a circle. That means the first house is the neighbor of the last one.
* Meanwhile, adjacent houses have a security system connected, and it will
* automatically contact the police if two adjacent houses were broken into on the
* same night.
* 
* Given an integer array `nums` representing the amount of money of each house,
* return *the maximum amount of money you can rob tonight without alerting the
* police*.
* 
* 
* Example 1:
* 
* Input: nums = [2,3,2]
* Output: 3
* Explanation: You cannot rob house 1 (money = 2) and then rob house 3 (money 
* = 2), because they are adjacent houses.
* 
* Example 2:
* 
* Input: nums = [1,2,3,1]
* Output: 4
* Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
* Total amount you can rob = 1 + 3 = 4.
* 
* Example 3:
* 
* Input: nums = [1,2,3]
* Output: 3
* 
* 
* Constraints:
* 
* * `1 <= nums.length <= 100`
* * `0 <= nums[i] <= 1000`
* 
*/
// @leetup=custom
// @leetup=code

class Solution {
    public int helper(int start_index, int end_index, int[] nums){
        int c0 = 0;
        int c1 = 0;

        for (int i = start_index; i<=end_index;i++){
            int curr = Math.max(nums[i]+c0, c1);
            c0 = c1;
            c1 = curr;
        }

        return c1;
    }
    public int rob(int[] nums) {
        // In this method we run the loop from 0 to n-2 and 1 to n-1 to find out which attempt is giving us the max cost for robbing
        // We do this since the house 0 and house n-1 are adjacent to each other and cant be robbed together
        int n = nums.length;
        if (n < 2){
            return nums[0];
        } else if (n<=2){
            return Math.max(nums[0], nums[1]);
        }
        return Math.max(helper(0,n-2, nums), helper(1, n-1, nums));
    }
}

// @leetup=code
