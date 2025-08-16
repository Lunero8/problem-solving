/**
 *    author:  Lunero
 *    created: 16.08.2025 16:24:18
 *    link: https://leetcode.com/problems/maximum-69-number/description/?envType=daily-question&envId=2025-08-16
**/

class Solution {
    public int maximum69Number (int num) {
        if (num / 1000 == 6)
            return num + 3000 ;
        else if ((num / 100) % 10 == 6)
            return num + 300 ;
        else if ((num / 10) % 10 == 6)
            return num + 30 ;
        else if (num % 10 == 6)
            return num + 3 ;
        else 
            return num ;
    }
}