/**
 *    author:  Lunero
 *    created: 31.01.2026 13:43:12
 *    link: https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/?envType=daily-question&envId=2026-01-31
**/

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for (int i = 0 ; i < letters.length ; i++) {
            if (target < letters[i])
                return letters[i] ;
        }

        return letters[0] ;
    }
}