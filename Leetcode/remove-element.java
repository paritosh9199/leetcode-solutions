// @leetup=custom
// @leetup=info id=27 lang=java slug=remove-element

/*
* Given an integer array `nums` and an integer `val`, remove all occurrences of
* `val` in `nums` [in-place][1]. The order of the elements may be changed.
* Then return *the number of elements in *`nums`* which are not equal to *`val`.
* 
* Consider the number of elements in `nums` which are not equal to `val` be `k`,
* to get accepted, you need to do the following things:
* 
* * Change the array `nums` such that the first `k` elements of `nums` contain the
*   elements which are not equal to `val`. The remaining elements of `nums` are
*   not important as well as the size of `nums`.
* * Return `k`.
* 
* Custom Judge:
* 
* The judge will test your solution with the following code:
* 
* int[] nums = [...]; // Input array
* int val = ...; // Value to remove
* int[] expectedNums = [...]; // The expected answer with correct length.
*                             // It is sorted with no values equaling val.
* 
* int k = removeElement(nums, val); // Calls your implementation
* 
* assert k == expectedNums.length;
* sort(nums, 0, k); // Sort the first k elements of nums
* for (int i = 0; i < actualLength; i++) {
*     assert nums[i] == expectedNums[i];
* }
* 
* If all assertions pass, then your solution will be accepted.
* 
* 
* Example 1:
* 
* Input: nums = [3,2,2,3], val = 3
* Output: 2, nums = [2,2,_,_]
* Explanation: Your function should return k = 2, with the first two elements 
* of nums being 2.
* It does not matter what you leave beyond the returned k (hence they are undersco
* res).
* 
* Example 2:
* 
* Input: nums = [0,1,2,2,3,0,4,2], val = 2
* Output: 5, nums = [0,1,4,0,3,_,_,_]
* Explanation: Your function should return k = 5, with the first five elements
*  of nums containing 0, 0, 1, 3, and 4.
* Note that the five elements can be returned in any order.
* It does not matter what you leave beyond the returned k (hence they are undersco
* res).
* 
* 
* Constraints:
* 
* * `0 <= nums.length <= 100`
* * `0 <= nums[i] <= 50`
* * `0 <= val <= 100`
* 
* [1]: https://en.wikipedia.org/wiki/In-place_algorithm
* 
*/
// @leetup=custom
// @leetup=code

import java.lang.reflect.Array;
import java.util.*;

class Solution {
    public void shiftQ(int[] qa, int qct){
        if(qct == 0){
            return;
        }

        for (int i = 0; i < qct; i++){
            qa[i] = qa[i+1];
        }
    }
    public int removeElement(int[] nums, int val) {
        // HashSet<Integer> hs = new HashSet<>();
        // Queue<Integer> q = new LinkedList<>();
        int[] q_ar = new int[nums.length + 1];
        int q_ctr = -1;  

        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            System.out.println("i "+i);
            if (nums[i] == val) {
                // q.offer(i);
                q_ctr ++;
                q_ar[q_ctr] = i;
            } else {
                // if (q.isEmpty()) {
                //     // hs.add(nums[i]);
                //     counter += 1;
                // } else {
                //     // while (!q.isEmpty()) {
                //     // hs.add(nums[i]);
                //     counter += 1;
                //     int index = q.poll();
                //     nums[index] = nums[i];
                //     // nums[i] = -1;
                //     q.offer(i);

                //     // }
                // }
                if (q_ctr == -1) {
                    counter += 1;
                } else {

                    counter += 1;
                    int index = q_ar[0]; 
                    shiftQ(q_ar, q_ctr);
                    q_ctr--;
                    
                    nums[index] = nums[i];
                    q_ctr++;
                    q_ar[q_ctr] = i;

                }
            }
        }
        return counter;
    
    }

    // public static void main(String[] args) {
    //     Solution s = new Solution();
    //     int[] nums = { 3, 2, 2, 3 };
    //     int val = 3;

    //     System.out.println(s.removeElement(nums, val));
    //     for (int nums2 : nums) {
    //         System.out.println(nums2);
    //     }
    // }
}
// @leetup=code
