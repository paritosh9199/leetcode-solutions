// @leetup=custom
// @leetup=info id=4 lang=java slug=median-of-two-sorted-arrays

/*
* Given two sorted arrays `nums1` and `nums2` of size `m` and `n` respectively,
* return the median of the two sorted arrays.
* 
* The overall run time complexity should be `O(log (m+n))`.
* 
* 
* Example 1:
* 
* Input: nums1 = [1,3], nums2 = [2]
* Output: 2.00000
* Explanation: merged array = [1,2,3] and median is 2.
* 
* Example 2:
* 
* Input: nums1 = [1,2], nums2 = [3,4]
* Output: 2.50000
* Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
* 
* 
* Constraints:
* 
* * `nums1.length == m`
* * `nums2.length == n`
* * `0 <= m <= 1000`
* * `0 <= n <= 1000`
* * `1 <= m + n <= 2000`
* * `-106 <= nums1[i], nums2[i] <= 106`
* 
*/
// @leetup=custom
// @leetup=code

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int final_length = nums1.length + nums2.length;
        int[] final_arr = new int[final_length];
        
        if (nums1.length == 0){
            if (nums2.length %2!= 0  ){
                return (double)nums2[nums2.length/2];
            } else {
                if (nums2[(nums2.length - 1)/2] != nums2[(nums2.length)/2])
                    return (double) (nums2[(nums2.length - 1)/2] + nums2[nums2.length/2])/2.0;
                else 
                    return (double)nums2[(nums2.length - 1)/2];
            }
        }

        if (nums2.length == 0){
            if (nums1.length %2!= 0  ){
                return (double)nums1[nums1.length/2];
            } else {
                if (nums1[(nums1.length - 1)/2] != nums1[nums1.length/2])
                    return (double) (nums1[(nums1.length - 1)/2] + nums1[nums1.length/2])/2.0;
                else 
                    return (double)nums1[nums1.length/2];
            }
        }

        int i = 0;
        int n1 = 0,n2 = 0;
        // while (i < nums1.length + nums2.length && nums1.length != 0 && nums2.length != 0){
        //     if (n1 < nums1.length && n2 < nums2.length  && nums1[n1] < nums2[n2]){
        //         final_arr[i] = nums1[n1];
        //         n1++;
        //     } else if (n2 < nums2.length ) {
        //         final_arr[i] = nums2[n2];
        //         n2++;
        //     }
        //     i++;
        // }

        while (i < nums1.length + nums2.length && n1 < nums1.length && n2 < nums2.length){
            if (nums1[n1] < nums2[n2]){
                final_arr[i] = nums1[n1];
                n1++;
            } else {
                final_arr[i] = nums2[n2];
                n2++;
            }
            i++;
        }

        while (n1 < nums1.length){
            final_arr[i] = nums1[n1];
            n1++;
            i++;
        }

        while (n2 < nums2.length){
            final_arr[i] = nums2[n2];
            n2++;
            i++;
        }





        double result = 0;
        if(final_length %2 != 0){
            result = (double)final_arr[final_length/2];
        } else {
            if (final_arr[(final_length - 1 )/2] != final_arr[(final_length)/2])
                result = (double)((double)final_arr[(final_length - 1 )/2] + (double)final_arr[final_length/2])/2;
            else 
                result = (double)final_arr[(final_length - 1 )/2]; 
        }
        
        return result;
    }
}
// @leetup=code
