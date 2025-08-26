/**
 *    author:  Lunero
 *    created: 26.08.2025 10:02:53
 *    link: https://leetcode.com/problems/maximum-area-of-longest-diagonal-rectangle/description/?envType=daily-question&envId=2025-08-26
**/

class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int max = 0 ;
        int result = 0 ;

        for (int i = 0 ; i < dimensions.length ; i++) {
            if (dimensions[i][0] * dimensions[i][0] + dimensions[i][1] * dimensions[i][1] > max || (dimensions[i][0] * dimensions[i][0] + dimensions[i][1] * dimensions[i][1] == max && dimensions[i][0] * dimensions[i][1] > result)) {
                max = dimensions[i][0] * dimensions[i][0] + dimensions[i][1] * dimensions[i][1] ;
                result = dimensions[i][0] * dimensions[i][1] ;
            }
        }

        return result ;
    }
}