/**
 *    author:  Lunero
 *    created: 29.07.2025 18:21:57
 *    link: https://leetcode.com/problems/integer-to-roman/description/?envType=study-plan-v2&envId=top-interview-150
**/

class Solution {
    public String intToRoman(int num) {
        StringBuilder result = new StringBuilder () ;

        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1} ;
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"} ;

        for (int i = 0 ; i < nums.length ; i++)
        {
            if (num <= 0)
                break ;
            
            while (num >= nums[i])
            {
                result.append (romans[i]) ;

                num -= nums[i] ;
            }
        }

        return result.toString() ;
    }
}