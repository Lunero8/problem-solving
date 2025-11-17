/**
 *    author:  Lunero
 *    created: 17.11.2025 14:02:47
 *    link: https://leetcode.com/problems/check-if-all-1s-are-at-least-length-k-places-away/description/?envType=daily-question&envId=2025-11-17
**/

class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int lastSeenOne = -1 ;

        for (int i = 0 ; i < nums.length  ; i++) {
            if (nums[i] == 1) {
                if (lastSeenOne != -1 && i - lastSeenOne - 1 < k)
                    return false ;
                
                lastSeenOne = i ;
            }
        }

        return true ;

        /* First Approach
        boolean result = true ;
        int count = 0 ;

        int i = 0 ;

        while (i < nums.length && nums[i] != 1) {
            i++ ;
        }

        ++ i ;

        while (i < nums.length) {
            if(nums[i] == 1) {
                if (count < k) {
                    result = false ;
                    break ;
                }
                
                count = 0 ;
            }
            else
                count++ ;
            
            i++ ;
        }

        return result ;

        */
    }
}