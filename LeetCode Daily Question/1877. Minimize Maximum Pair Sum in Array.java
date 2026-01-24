/**
 *    author:  Lunero
 *    created: 25.01.2026 05:57:43
 *    link: https://leetcode.com/problems/minimize-maximum-pair-sum-in-array/description/?envType=daily-question&envId=2026-01-24
**/

class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort (nums) ;
        
        int max = 0 ;

        for (int i = 0 ; i < nums.length/2 ; i++) {
            int t = nums[i] + nums[nums.length - i - 1] ;

            if (max < t)
                max = t ;
        }

        return max ;
    }
}