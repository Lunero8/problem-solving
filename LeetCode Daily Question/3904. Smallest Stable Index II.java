/**
 *    author:  Lunero
 *    created: 05.09.2026 08:40:17
 *    link: https://leetcode.com/problems/smallest-stable-index-ii/description/?envType=daily-question&envId=2026-09-05
**/

class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        long max = nums[0];

        // calculate min
        int[] mins = new int[n];

        mins[n-1] = nums[n-1];

        for (int i = n - 2 ; i >= 0 ; i--)
            mins[i] = Math.min (mins[i+1], nums[i]);
            // if (mins[i+1] < nums[i]) 
            //     mins[i] = mins[i+1];
            // else
            //     mins[i] = nums[i];

        for (int i = 0 ; i < n ; i++) {
            // calculate max
            if (max < nums[i])
                max = nums[i];
            
            long temp_result = max - mins[i];

            if (temp_result <= k)
                return i;
        }

        return -1;
    }
}