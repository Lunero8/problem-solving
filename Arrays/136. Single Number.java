/**
 *    author:  Lunero
 *    created: 14.08.2025 00:40:46
 *    link: https://leetcode.com/problems/single-number/description/
**/

class Solution {
    public int singleNumber(int[] nums) {
        // Approach 2
        int result = 0 ;

        for (int n : nums)
            result ^= n ;

        return result ;

        /* --Approach 1
        Arrays.sort(nums) ;

        int i = 0 ;

        while (i < nums.length - 1)
        {
            if (nums[i] != nums[i+1])
                return nums[i] ;
            
            i += 2 ;
        }

        return nums[nums.length - 1] ;
        */
    }
}