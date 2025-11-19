/**
 *    author:  Lunero
 *    created: 19.11.2025 14:20:51
 *    link: https://leetcode.com/problems/keep-multiplying-found-values-by-two/description/?envType=daily-question&envId=2025-11-19
**/

class Solution {
    public int findFinalValue(int[] nums, int original) {
        boolean running = true ;

        while (running) {
            for (int i = 0 ; i < nums.length ; i++) {
                if (nums[i] == original) {
                    original *= 2 ;
                    break ;
                }
                else if (i == nums.length - 1) {
                    running = false ;
                    break ; 
                }
            }
        }

        return original ;
    }
}