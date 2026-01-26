/**
 *    author:  Lunero
 *    created: 27.01.2026 00:07:19
 *    link: https://leetcode.com/problems/minimum-absolute-difference/description/?envType=daily-question&envId=2026-01-26
**/

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort (arr) ;

        int minimum_difference = Integer.MAX_VALUE ;

        List<List<Integer>> result = new ArrayList<>() ;

        for (int i = 0 ; i < arr.length - 1 ; i++) {
            int current_difference = Math.abs(arr[i] - arr[i+1]) ;

            if (current_difference < minimum_difference) {
                minimum_difference = current_difference ;

                result.clear() ;

                result.add (Arrays.asList(arr[i], arr[i+1])) ;
            }
            else if (current_difference == minimum_difference) {
                result.add (Arrays.asList(arr[i], arr[i+1])) ;
            }
        }

        return result ;
    }
}