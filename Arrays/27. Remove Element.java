/**
 *    author:  Lunero
 *    created: 18.08.2025 15:44:22
 *    link: https://leetcode.com/problems/remove-element/description/
**/

class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0 ;

        for (int num : nums)
            if (num != val)
                nums[k++] = num ;

        return k ;
    }
}