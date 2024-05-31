// @leetup=custom
// @leetup=info id=70 lang=java slug=climbing-stairs

/*
* You are climbing a staircase. It takes `n` steps to reach the top.
* 
* Each time you can either climb `1` or `2` steps. In how many distinct ways can
* you climb to the top?
* 
* 
* Example 1:
* 
* Input: n = 2
* Output: 2
* Explanation: There are two ways to climb to the top.
* 1. 1 step + 1 step
* 2. 2 steps
* 
* Example 2:
* 
* Input: n = 3
* Output: 3
* Explanation: There are three ways to climb to the top.
* 1. 1 step + 1 step + 1 step
* 2. 1 step + 2 steps
* 3. 2 steps + 1 step
* 
* 
* Constraints:
* 
* * `1 <= n <= 45`
* 
*/
// @leetup=custom
// @leetup=code

class Solution {
    public int climbStairs(int n) {
        //The combination of steps form a fibo series 
        int prev, prev_2, temp;
        prev = 0;
        prev_2 = 0;
        temp = 0;
        for (int i = 1; i <= n; i++){
            if (i == 1){
                prev_2 = 0;
                prev = 1;
            } else if (i == 2){
                prev_2 = 1;
                prev = 2;
            } else {
                temp = prev_2;
                prev_2 = prev;
                prev = prev_2 + temp;
            }
        }

        return prev;
    }
}
// @leetup=code
