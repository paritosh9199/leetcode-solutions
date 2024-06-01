// @leetup=custom
// @leetup=info id=64 lang=java slug=minimum-path-sum

/*
* Given a `m x n` `grid` filled with non-negative numbers, find a path from top
* left to bottom right, which minimizes the sum of all numbers along its path.
* 
* Note: You can only move either down or right at any point in time.
* 
* 
* Example 1:
* 
* Input: grid = [[1,3,1],[1,5,1],[4,2,1]]
* Output: 7
* Explanation: Because the path 1 → 3 → 1 → 1 → 1 minimizes the sum.
* 
* Example 2:
* 
* Input: grid = [[1,2,3],[4,5,6]]
* Output: 12
* 
* 
* Constraints:
* 
* * `m == grid.length`
* * `n == grid[i].length`
* * `1 <= m, n <= 200`
* * `0 <= grid[i][j] <= 200`
* 
*/
// @leetup=custom
// @leetup=code

class Solution {
    public int minPathSum(int[][] grid) {
        // This problem has a very similar approach to multistage graph just that the node in each level are two 
        // And the source is 0,0 and sink is m,n
        int m = grid.length;
        int n = grid[0].length;
        int[][] distance = new int[grid.length][grid[0].length];
        // int[][] path = new int[m][n];
        for(int i = m-1 ;i >= 0;i-- ){
            for (int j = n-1;j >= 0;j--){
                
                int ix = i;
                int jx = j;
                // int top = (i > 0)?grid[i-1][j]:999;
                // int left = (j > 0)?grid[i][j-1]:999;
                int d_bottom = (i < m-1)?distance[i+1][j]:Integer.MAX_VALUE;
                int d_right = (j < n-1)?distance[i][j+1]:Integer.MAX_VALUE;
                
                int min_dist = Math.min(d_bottom,d_right);
                min_dist = (min_dist == Integer.MAX_VALUE)?0:min_dist;
                // int min_dist_grid = (top!=left && top!=999)?Math.min(top, left):0;
                
                distance[i][j] = grid[i][j] + min_dist;
                // path[i][j] = (d_bottom > d_right)? 1:2;
                // System.out.print(d_right+"|"+d_bottom+"[G:"+grid[i][j]+"|D:"+distance[i][j]+"|P:"+path[i][j]+"|MD:"+min_dist+"]   ");

            }
            // System.out.println("");
       }
        return distance[0][0];
    }
}

// @leetup=code
