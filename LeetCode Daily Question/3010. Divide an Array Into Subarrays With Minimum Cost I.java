/**
 *    author:  Lunero
 *    created: 02.02.2026 00:28:57
 *    link: https://leetcode.com/problems/divide-an-array-into-subarrays-with-minimum-cost-i/description/?envType=daily-question&envId=2026-02-01
**/

class Solution {
    public int minimumCost(int[] nums) {
        int n = nums.length ;

        if (n < 4)
            return nums[0] + nums[1] + nums[2] ;
        
        int result = nums[0] ;
        int store = nums[0] ;

        Arrays.sort (nums) ;

        int count = 1 ;
        int i = 0 ;

        while (count < 3) {
            if (nums[i] == store) {
                store = nums[i] - 1 ;
            }
            else {
                count++ ;
                result += nums[i] ;
            } 

            i++ ;
        }

        return result ;
    }
}