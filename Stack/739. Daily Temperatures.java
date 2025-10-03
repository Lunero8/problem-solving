/**
 *    author:  Lunero
 *    created: 04.10.2025 03:11:20
 *    link: https://leetcode.com/problems/daily-temperatures/description/
**/

class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int[] result = new int [temp.length] ;

        Stack<Integer> stack = new Stack<>() ;

        for (int i = 0 ; i < temp.length ; i++) {
            while (!stack.isEmpty() && temp[stack.peek()] < temp[i]) {
                result[stack.peek()] = i - stack.pop() ;
            }

            stack.push(i) ;
        }

        return result ;
    }
}