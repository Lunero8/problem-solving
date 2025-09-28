/**
 *    author:  Lunero
 *    created: 29.09.2025 01:46:56
 *    link: https://leetcode.com/problems/gas-station/description/
**/

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        // using stack 
        Stack<Integer> stack = new Stack<>() ;

        int total_gas = 0 ;
        int current_gas = 0 ;

        for (int i = 0 ; i < gas.length ; i++) {
            total_gas += gas[i] - cost[i] ;
            current_gas += gas[i] - cost[i] ;

            if (current_gas > 0) 
                stack.push(i) ;
            else {
                stack.clear() ;
                current_gas = 0 ;
            }
        }

        if (total_gas < 0)
            return -1 ;
        
        int r = 0;
        while (!stack.isEmpty())
            r = stack.pop() ;

        return r ;

        
        /*
        int total_gas = 0 ;
        int current_gas = 0 ;
        int start = 0 ;

        for (int i = 0 ; i < gas.length ; i++)
        {
            total_gas += gas[i] - cost[i] ;
            current_gas += gas[i] - cost[i] ;

            if (current_gas < 0)
            {
                start = i + 1 ;
                current_gas = 0 ;
            }
        }

        return total_gas >= 0 ? start : -1 ;

        */
    }
}