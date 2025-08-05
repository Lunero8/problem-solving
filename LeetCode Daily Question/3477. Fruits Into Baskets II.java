/**
 *    author:  Lunero
 *    created: 05.08.2025 21:39:28
 *    link: https://leetcode.com/problems/fruits-into-baskets-ii/description/?envType=daily-question&envId=2025-08-05
**/

class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int result = 0 ;

        for (int i = 0 ; i < fruits.length ; i++)
        {
            int j = 0 ;
            while (j < baskets.length)
            {
                if (baskets[j] > -1 && fruits[i] <= baskets[j])
                {
                    baskets[j] = -1 ;
                    break ;
                }
                else if (j == baskets.length - 1)
                    result++ ;

                j++ ;
            }
        }

        return result ;
    }
}