/**
 *    author:  Lunero
 *    created: 18.11.2025 06:50:38
 *    link: https://leetcode.com/problems/1-bit-and-2-bit-characters/description/?envType=daily-question&envId=2025-11-18
**/

class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        for (int i = 0 ; i < bits.length ; i++) {
            if (bits[i] == 1)
                i += 1 ;
            else if (i == bits.length - 1)
                return true ;
        }

        return false ;
    }
}