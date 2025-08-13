/**
 *    author:  Lunero
 *    created: 13.08.2025 23:34:02
 *    link: https://leetcode.com/problems/candy/description/?envType=study-plan-v2&envId=top-interview-150
**/

class Solution {
    public int candy(int[] ratings) {
        int[] candy = new int[ratings.length] ;
        Arrays.fill(candy, 1) ;

        int totalCandy = 0 ;

        for (int i = 1 ; i < ratings.length ; i++)
            if (ratings[i] > ratings[i-1])
                candy[i] = candy[i-1] + 1 ;
        
        for (int i = ratings.length - 2 ; i >= 0 ; i--)
        {
            if (ratings[i] > ratings[i+1])
                candy[i] = Math.max (candy[i], candy[i+1] + 1) ;
            
            totalCandy += candy[i] ;
        }

        return totalCandy + candy[candy.length-1] ;
    }
}