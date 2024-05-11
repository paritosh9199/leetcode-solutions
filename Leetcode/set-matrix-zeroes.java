// @leetup=custom
// @leetup=info id=73 lang=java slug=set-matrix-zeroes

/*
* Given an `m x n` integer matrix `matrix`, if an element is `0`, set its entire
* row and column to `0`'s.
* 
* You must do it [in place][1].
* 
* 
* Example 1:
* 
* Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
* Output: [[1,0,1],[0,0,0],[1,0,1]]
* 
* Example 2:
* 
* Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
* Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
* 
* 
* Constraints:
* 
* * `m == matrix.length`
* * `n == matrix[0].length`
* * `1 <= m, n <= 200`
* * `-231 <= matrix[i][j] <= 231 - 1`
* 
* 
* Follow up:
* 
* * A straightforward solution using `O(mn)` space is probably a bad idea.
* * A simple improvement uses `O(m + n)` space, but still not the best solution.
* * Could you devise a constant space solution?
* 
* [1]: https://en.wikipedia.org/wiki/In-place_algorithm
* 
*/
// @leetup=custom
// @leetup=code
//
// 00 01 02 i = 0
// 10 11 12 
// 20 21 22

//j0 1 2 i
// 0 1 2 0
// 3 4 5 1
// 6 7 8 2

import java.util.*;

class Solution {
    // public int getSingleArrayRep(int i, int j, int il, int jl) {
    // return j + il * i;
    // }

    // public int[] get2DArrayRep(int e, int il, int jl) {
    // int j = e % il;
    // int i = (int) e / il;

    // // System.out.println("e:"+e+" il:"+il+" jl:"+jl);
    // int[] c = new int[2];
    // c[0] = i;
    // c[1] = j;

    // return c;
    // }

    public void setZeroes(int[][] matrix) {
      
        HashSet<Integer> hsi = new HashSet<Integer>();
        HashSet<Integer> hsj = new HashSet<Integer>();

        int il = matrix.length;
        int jl = matrix[0].length;
        for (int i = 0; i < il; i++) {
            for (int j = 0; j < jl; j++) {
                if (matrix[i][j] == 0) {
                    // System.out.println(i + ","+ j +" "+getSingleArrayRep(i, j, il, jl));
                    hsi.add(i);
                    hsj.add(j);
                }
            }
        }

        for (int i: hsi) {
            for (int j = 0; j < jl; j++) {
                matrix[i][j] = 0;
            }
        }

        for (int j: hsj) {
            for (int i = 0; i < il; i++) {
                matrix[i][j] = 0;
            }
        }

    }

    // public static void main(String[] args) {
    //     Solution sl = new Solution();
    //     int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
    //     // int[][] matrix = { { 1 }, { 0 } };
    //     // Coord c = sl.get2DArrayRep(sl.getSingleArrayRep(0, 1, 3, 1), 3, 3);

    //     int il = matrix.length;
    //     int jl = matrix[0].length;
    //     System.out.println("il:" + il + " jl:" + jl);

    //     for (int i = 0; i < il; i++) {
    //         for (int j = 0; j < jl; j++) {
    //             System.out.print("[" + i + "," + j + " " + matrix[i][j] + "]");
    //         }
    //         System.err.println("");
    //     }

    //     sl.setZeroes(matrix);
    //     for (int i = 0; i < il; i++) {
    //         for (int j = 0; j < jl; j++) {
    //             System.out.print("[" + i + "," + j + " " + matrix[i][j] + "]");
    //         }
    //         System.err.println("");
    //     }

    // }
}
// @leetup=code
