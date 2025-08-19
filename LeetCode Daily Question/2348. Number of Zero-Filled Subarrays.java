/**
 *    author:  Lunero
 *    created: 19.08.2025 12:57:01
 *    link: https://leetcode.com/problems/number-of-zero-filled-subarrays/description/?envType=daily-question&envId=2025-08-19
**/

class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long max = 0 ;
        int count = 0 ;

        for (int num : nums)
            if (num == 0)
            {
                count++ ;
                max += count ;
            }
            else
                count = 0 ;

        return max ;
    }
}