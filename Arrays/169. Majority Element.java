/**
 *    author:  Lunero
 *    created: 14.08.2025 01:15:41
 *    link: https://leetcode.com/problems/majority-element/description/
**/

class Solution {
    public int majorityElement(int[] nums) {
        // Approach 2
        int result = 0 ;
        int count = 0 ;

        for (int n : nums)
        {
            if (count == 0)
                result = n ;   
            
            count += (n == result) ? 1 : -1 ;
        }

        return result ;
        
        /*--Approach 1
        Arrays.sort (nums) ;

        return nums[nums.length/2] ;
        */
    }
}