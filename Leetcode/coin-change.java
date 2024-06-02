// @leetup=custom
// @leetup=info id=322 lang=java slug=coin-change

/*
* You are given an integer array `coins` representing coins of different
* denominations and an integer `amount` representing a total amount of money.
* 
* Return *the fewest number of coins that you need to make up that amount*. If
* that amount of money cannot be made up by any combination of the coins, return
* `-1`.
* 
* You may assume that you have an infinite number of each kind of coin.
* 
* 
* Example 1:
* 
* Input: coins = [1,2,5], amount = 11
* Output: 3
* Explanation: 11 = 5 + 5 + 1
* 
* Example 2:
* 
* Input: coins = [2], amount = 3
* Output: -1
* 
* Example 3:
* 
* Input: coins = [1], amount = 0
* Output: 0
* 
* 
* Constraints:
* 
* * `1 <= coins.length <= 12`
* * `1 <= coins[i] <= 231 - 1`
* * `0 <= amount <= 104`
* 
*/
// @leetup=custom
// @leetup=code
class Solution {

    //Refer to the writeup document in the Notes section
    public int coinChange(int[] coins, int amount) {
        int[][] dp = new int[coins.length+1][amount+1];
        int n = coins.length;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= amount; j++) {
                if (j == 0) {
                    dp[i][j] = 0;  // 0 coins needed to make amount 0
                } else if (i == 0) {
                    dp[i][j] = amount + 1;  // Initialize to a large value (infinity)
                } else {
                    dp[i][j] = amount + 1;  // Initialize to a large value (infinity)
                }
            }
        }

        for (int i = 0;i<=coins.length;i++){
            for (int j = 0;j<=amount;j++){
                if (i == 0 || j == 0){
                    // dp[i][j] = 0;
                    // if(j == 0){
                    //     if (i > 0)
                    //         System.out.print("c:"+coins[i-1]+" ");
                    //     else 
                    //         System.out.print("c:"+0+" ");
                    // }
                    
                    // System.out.print("("+i+","+j+")");
                    // System.out.print(dp[i][j]+", ");
                } else {
                    if(j - coins[i-1] >= 0){
                        int top = (i-1 == 0)?Integer.MAX_VALUE:dp[i-1][j];
                        dp[i][j] = Math.min(top, dp[i][j-coins[i-1]] + 1);
                    } else {
                        dp[i][j] = dp[i-1][j];
                    }
                    // System.out.print(dp[i][j]+",      ");
                }
            }
            // System.out.println("");
        }

        return dp[coins.length][amount] > amount ? -1 : dp[coins.length][amount];
    }
}
// @leetup=code
