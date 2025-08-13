/**
 *    author:  Lunero
 *    created: 13.08.2025 23:23:20
 *    link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
**/

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 1)
            return 0 ;

        int index = 1 ;

        for (int i = 0 ; i < nums.length - 1 ; i++)
            if (nums[i] != nums[i+1])
                nums[index++] = nums[i+1] ;

        return index ;
    }
}