/**
 *    author:  Lunero
 *    created: 24.08.2025 16:25:49
 *    link: https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/description/?envType=daily-question&envId=2025-08-24
**/

class Solution {
    public int longestSubarray(int[] nums) {
        int size = nums.length ;

        int left = 0 ;
        int right = 0 ;
        int max = 0 ;

        for (int i = 0 ; i < size ; i++)
        {
            if (nums[i] == 1)
                right++ ;
            else
            {
                max = Math.max (max, left+right) ;
                left = right ;
                right = 0 ;
            }
        }

        max = Math.max (max, left+right) ;

        return max != size ? max : size - 1 ;
    }
}