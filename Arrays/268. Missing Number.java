/**
 *    author:  Lunero
 *    created: 14.08.2025 00:11:41
 *    link: https://leetcode.com/problems/missing-number/description/
**/

class Solution {
    public int missingNumber(int[] nums) {
        // Approach 3
        int r = 0 ;

        for (int i = 1 ; i <= nums.length ; i++)
            r ^= i ;

        for (int num : nums)
            r ^= num ;
        
        return r ;

        /* --Approach 2
        int len = nums.length ;
        int sum = len * (len + 1) / 2 ;

        for (int n : nums)
            sum -= n ;
        
        return sum ;
        */
        
        /* --Approach 1
        Arrays.sort (nums) ;

        int i = 0 ;

        while (i < nums.length)
            if (i != nums[i++])
                return i-1 ;
        
        return i ;
        */
    }
}