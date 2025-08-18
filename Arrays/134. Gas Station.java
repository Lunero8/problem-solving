/**
 *    author:  Lunero
 *    created: 18.08.2025 17:24:37
 *    link: https://leetcode.com/problems/gas-station/description/?envType=study-plan-v2&envId=top-interview-150
**/

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
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
    }
}