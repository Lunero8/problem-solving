/**
 *    author:  Lunero
 *    created: 25.08.2025 13:05:01
 *    link: https://leetcode.com/problems/diagonal-traverse/description/?envType=daily-question&envId=2025-08-25
**/

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n = mat.length ;
        int m = mat[0].length ;

        int[] arr = new int[n*m] ;

        int r = 0, c = 0 ;

        boolean up = true ;

        int index = 0 ;

        while (index < n * m) {
            arr[index++] = mat[r][c] ;

            if (up) {
                if (c == m-1) {
                    r++ ;
                    up = false ;
                }
                else if (r == 0) {
                    c++ ;
                    up = false ;
                }
                else {
                    r-- ;
                    c++ ;
                }
            }
            else {
                if (r == n-1) {
                    c++ ;
                    up = true ;
                }
                else if (c == 0) {
                    r++ ;
                    up = true ;
                }
                else {
                    c-- ;
                    r++ ;
                }
            }
        }
        
        return arr ;
    }
}