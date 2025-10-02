/**
 *    author:  Lunero
 *    created: 02.10.2025 08:34:38
 *    link: https://leetcode.com/problems/water-bottles-ii/description/?envType=daily-question&envId=2025-10-02
**/

class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int result = numBottles ;

        while (numBottles >= numExchange) {
            result++ ;
            numBottles -= numExchange ;
            numExchange++ ;
            numBottles++ ;
        }

        return result ;
    }
}