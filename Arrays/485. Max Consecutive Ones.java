/**
 *    author:  Lunero
 *    created: 14.08.2025 00:29:02
 *    link: https://leetcode.com/problems/max-consecutive-ones/description/
**/

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0 ;
        int count = 0 ;

        for (int n : nums)
            if (n == 1)
            {
                if (++count > max)
                    max = count ;
            }
            else
                count = 0 ;

        return max ;
    }
}