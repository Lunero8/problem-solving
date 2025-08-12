/**
 *    author:  Lunero
 *    created: 13.08.2025 03:34:36
 *    link: https://leetcode.com/problems/sort-colors/description/
**/

class Solution {
    public void sortColors(int[] nums) {
      
        /* -- approach 1 : accepted
        Arrays.sort(nums) ;
        */

        // approach 2
        
        int[] r = new int [3] ;

        for (int i : nums)
            r[i]++ ;

        int index = 0 ;

        for (int i = 0 ; i < 3 ; i++)
        {
            while (r[i] > 0)
            {
                nums[index++] = i ;
                r[i]-- ;
            }
        }
    }
}