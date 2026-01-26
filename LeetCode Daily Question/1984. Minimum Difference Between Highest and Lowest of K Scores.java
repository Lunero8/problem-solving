/**
 *    author:  Lunero
 *    created: 26.01.2026 23:41:28
 *    link: https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/description/?envType=daily-question&envId=2026-01-25
**/

class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort (nums) ;

        int min = Integer.MAX_VALUE ;

        for (int i = 0 ; i <= nums.length - k ; i++) {
            int temp = nums[i + k - 1] - nums[i] ;

            min = Math.min (temp, min) ;
        }

        return min ;
    }
}