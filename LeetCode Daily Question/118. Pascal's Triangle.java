/**
 *    author:  Lunero
 *    created: 01.08.2025 22:48:19
 *    link: https://leetcode.com/problems/pascals-triangle/description/?envType=daily-question&envId=2025-08-01
**/

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List <List <Integer>> result = new ArrayList<>() ;

        for (int i = 0 ; i < numRows ; i++)
        {
            List <Integer> row = new ArrayList<>() ;

            for (int j = 0 ; j <= i ; j++)
            {
                if (j == 0 || j == i)
                    row.add (1) ;
                else
                {
                    int t = result.get (i - 1).get(j - 1) + result.get (i - 1).get (j) ;

                    row.add (t) ;
                }
            }

            result.add (row) ;
        }

        return result ;
    }
}