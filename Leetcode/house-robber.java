// @leetup=custom
// @leetup=info id=198 lang=java slug=house-robber

/*
* You are a professional robber planning to rob houses along a street. Each house
* has a certain amount of money stashed, the only constraint stopping you from
* robbing each of them is that adjacent houses have security systems connected and
* it will automatically contact the police if two adjacent houses were broken into
* on the same night.
* 
* Given an integer array `nums` representing the amount of money of each house,
* return *the maximum amount of money you can rob tonight without alerting the
* police*.
* 
* 
* Example 1:
* 
* Input: nums = [1,2,3,1]
* Output: 4
* Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
* Total amount you can rob = 1 + 3 = 4.
* 
* Example 2:
* 
* Input: nums = [2,7,9,3,1]
* Output: 12
* Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 
* 5 (money = 1).
* Total amount you can rob = 2 + 9 + 1 = 12.
* 
* 
* Constraints:
* 
* * `1 <= nums.length <= 100`
* * `0 <= nums[i] <= 400`
* 
*/
// @leetup=custom
// @leetup=code

class Solution {
    public int bad_solution_rob(int[] nums) {
        int n = nums.length;
        int c0 = (n >= 1)? nums[0]:0, c0i = 0;
        int c1 = (n >= 2)? nums[1]:0, c1i = 1;
        int c = 0;
        int max_collision = 0;
        int ec = 0, oc = 0;
        // for (int i = 0; i<n-1;i++){
        //     if(nums[i] == nums[i+1]){
        //         if(i % 2 == 0){
        //             // max_collision = 1;
        //             ec += 1;
        //         } else {
        //             // max_collision = 0;
        //             oc += 1;
        //         }
        //     }
        // }

        // if(ec > oc){
        //     max_collision = 1;
        // } else {
        //     max_collision = 0;
        // }
        for (int i = 2; i<n; i++){
            int next = (i == n-1)?0:nums[i+1];
            if (i - c0i > 1){
                c0 = c0 + Math.max(nums[i], next);
                c0i = (nums[i] > next)?i:i+1;
                System.out.println("i:"+i+" c0i:"+c0i+" c0:"+c0);
            }

            if (i - c1i > 1){
                c1 = c1 + Math.max(nums[i], next);
                c1i = (nums[i] > next)?i:i+1;
                System.out.println("i:"+i+" c1i:"+c1i+" c1:"+c1);
            }
        }

        return Math.max(c0, c1);
    }

    // Defining the sub problem is very important; Earlier I split the subproblem as forward looking max of sum of i+2 and i+3 which cause me get max valued collision when the adj values are the same 

    // When using an accumulator for best possible solution this issue was not encountered
    public int rob(int[] nums) {
        int n = nums.length;
        int c0 = (n >= 1)? nums[0]:0;
        int c1 = (n >= 2)? nums[1]:0;
        c1 = Math.max(c0,c1);
        // c0 c1 curr
        for(int i = 2; i<n;i++){
            int curr = Math.max(nums[i]+c0, c1);
            c0 = c1;
            c1 = curr;
        }

        return c1;
    }
}
// @leetup=code
