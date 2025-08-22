/**
 *    author:  Lunero
 *    created: 22.08.2025 07:54:31
 *    link: https://leetcode.com/problems/find-the-minimum-area-to-cover-all-ones-i/description/?envType=daily-question&envId=2025-08-22
**/

class Solution {
    public int minimumArea(int[][] grid) {
        int up = 0, down = 0, left = 0, right = 0 ;
        boolean f = true ;

        for (int i = 0 ; i < grid.length ; i++)
        {
            for (int j = 0 ; j < grid[i].length ; j++)
            {
                if (grid[i][j] == 1 && f == true)
                {
                    f = false ;

                    up = i ;
                    down = i ;
                    left = j ;
                    right = j ;

                    continue ;
                }
                
                if (grid[i][j] == 1 && f == false)
                {

                    up = Math.min (up, i) ;
                    down = Math.max (down, i) ;
                    left = Math.min (left, j) ;
                    right = Math.max (right, j) ;
                }
            }
        }

        int height = down - up + 1 ;
        int width = right - left + 1 ;

        return height * width ;
    }
}