/**
 *    author:  Lunero
 *    created: 02.10.2025 08:32:37
 *    link: https://leetcode.com/problems/water-bottles/?envType=daily-question&envId=2025-10-01
**/

class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int result = numBottles ;
        
        while (numBottles >= numExchange) {
            int temp = numBottles / numExchange ;
            numBottles = numBottles % numExchange + temp ;
            result += temp ;
        }

        return result ;
    }
}