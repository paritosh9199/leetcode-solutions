// @leetup=custom
// @leetup=info id=746 lang=java slug=min-cost-climbing-stairs

/*
* You are given an integer array `cost` where `cost[i]` is the cost of `ith` step
* on a staircase. Once you pay the cost, you can either climb one or two steps.
* 
* You can either start from the step with index `0`, or the step with index `1`.
* 
* Return *the minimum cost to reach the top of the floor*.
* 
* 
* Example 1:
* 
* Input: cost = [10,15,20]
* Output: 15
* Explanation: You will start at index 1.
* - Pay 15 and climb two steps to reach the top.
* The total cost is 15.
* 
* Example 2:
* 
* Input: cost = [1,100,1,1,1,100,1,1,100,1]
* Output: 6
* Explanation: You will start at index 0.
* - Pay 1 and climb two steps to reach index 2.
* - Pay 1 and climb two steps to reach index 4.
* - Pay 1 and climb two steps to reach index 6.
* - Pay 1 and climb one step to reach index 7.
* - Pay 1 and climb two steps to reach index 9.
* - Pay 1 and climb one step to reach the top.
* The total cost is 6.
* 
* 
* Constraints:
* 
* * `2 <= cost.length <= 1000`
* * `0 <= cost[i] <= 999`
* 
*/
// @leetup=custom
// @leetup=code

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        // int[] accumulated_cost = new int[cost.length];
        int total_cost = 0;
        int n = cost.length;
        int c0 = (n > 0)? cost[0]:0;
        int c1 =(n > 1)? cost[1]:0;
        int curr = 0;
        for(int i = 2; i<n; i++){
            // be careful when setting c0 and c1
            // c1 is the most recent then c0 
            // [c0, c1, curr....]
            curr = cost[i] + Math.min(c0, c1);
            c0 = c1;
            c1 = curr;
            // total_cost = total_cost + accumulated_cost[i];
            // System.out.println("pc"+prev_cost+"p2c"+prev_2_cost);
            // System.out.println("i"+i+" f:"+c0+" s:"+c1);
   
        }
        return Math.min(c0, c1);
    }
}
// @leetup=code
