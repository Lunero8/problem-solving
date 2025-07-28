/**
 *    author:  Lunero
 *    created: 28.07.2025 12:34:48
 *    link: https://leetcode.com/problems/count-number-of-maximum-bitwise-or-subsets/description/?envType=daily-question&envId=2025-07-28
**/

class Solution {
    public int countSubset (int[] nums, int maxOr, int currentOr, int index) {
        // base case 
        if (index >= nums.length)
        {
            if (currentOr == maxOr)
                return 1 ;
            
            return 0 ;
        }
        
        // take index
        int take = countSubset (nums, maxOr, currentOr | nums[index], index + 1) ;

        // Not take index
        int notTake = countSubset (nums, maxOr, currentOr, index+1) ;

        // return 
        return take + notTake ;
    }

    public int countMaxOrSubsets(int[] nums) {
        int maxOr = 0 ;

        for (int num : nums)
            maxOr |= num ;
        
        int currentOr = 0 ;

        return countSubset (nums, maxOr, currentOr, 0) ;
    }
}