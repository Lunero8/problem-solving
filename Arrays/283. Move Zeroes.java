/**
 *    author:  Lunero
 *    created: 13.08.2025 03:26:49
 *    link: https://leetcode.com/problems/move-zeroes/description/
**/

class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0 ;

        for (int n : nums)
            if (n != 0)
                nums[index++] = n ;
        
        while (index < nums.length)
            nums[index++] = 0 ;
    }
}