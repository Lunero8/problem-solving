/**
 *    author:  Lunero
 *    created: 15.08.2025 03:20:48
 *    link: https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/
**/

class Solution {
    public boolean check(int[] nums) {
        int count = 0 ;

        for (int i = 0 ; i < nums.length ; i++)
            if (nums[i] > nums[(i+1) % nums.length])
                count++ ;

        return count < 2 ;
    }
}