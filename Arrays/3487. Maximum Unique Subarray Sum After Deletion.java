/**
 *    author:  Lunero
 *    created: 13.08.2025 03:42:52
 *    link: https://leetcode.com/problems/maximum-unique-subarray-sum-after-deletion/description/
**/

class Solution {
    public int maxSum(int[] nums) {
      
        // approach 2
        Arrays.sort(nums) ;

        if (nums[nums.length-1] <= 0)
            return nums[nums.length-1] ;

        int sum = 0 , p = 0 ;

        for (int num : nums)
        {
            if (num > 0 && num != p)
                sum += num ;

            p = num ;
        }
        
        return sum ;

        /* -- approach 1
        Arrays.sort(nums) ;

        int last_index = nums.length-1 ;
        int sum = nums[last_index], max = sum ;

        for (int i = last_index-1 ; i >= 0 ; i--)
        {
            if (nums[i] != nums[i+1])
                sum += nums[i] ;
            
            max = sum > max ? sum : max ;
        }

        return max ;
        */
    }
}