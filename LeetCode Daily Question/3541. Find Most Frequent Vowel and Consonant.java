/**
 *    author:  Lunero
 *    created: 13.09.2025 17:06:49
 *    link: https://leetcode.com/problems/find-most-frequent-vowel-and-consonant/description/?envType=daily-question&envId=2025-09-13
**/

class Solution {
    public int maxFreqSum(String s) {
        int[] countV = new int [5] ;
        int[] countC = new int [26] ;
        Arrays.fill(countV, 0) ;
        Arrays.fill(countC, 0) ;

        for (int i = 0 ; i < s.length() ; i++)
            if (s.charAt(i) == 'a')
                countV[0]++ ;
            else if (s.charAt(i) == 'e')
                countV[1]++ ;
            else if (s.charAt(i) == 'i')
                countV[2]++ ;
            else if (s.charAt(i) == 'o')
                countV[3]++ ;
            else if (s.charAt(i) == 'u')
                countV[4]++ ;
            else 
                countC[s.charAt(i) - 'a']++ ;

        Arrays.sort (countC) ;
        Arrays.sort (countV) ;

        return countV[4] + countC[25] ;
    }
}