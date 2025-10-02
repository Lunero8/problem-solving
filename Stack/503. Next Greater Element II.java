/**
 *    author:  Lunero
 *    created: 02.10.2025 23:17:32
 *    link: https://leetcode.com/problems/next-greater-element-ii/description/
**/

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        // using stack 
        int[] result = new int [nums.length] ;
        Stack<Integer> stack = new Stack<>() ;

        for (int i = nums.length * 2 - 1 ; i >= 0 ; i--) {
            int temp = i % nums.length ;

            while (!stack.empty() && nums[temp] >= stack.peek()) {
                stack.pop() ;
            }

            if (i < nums.length) {
                result[i] = stack.isEmpty() ? -1 : stack.peek() ;
            }

            stack.push(nums[i % nums.length]) ;
        }

        return result ;

        /*
        // implementation
        int[] result = new int [nums.length] ;
        Arrays.fill (result, -1) ;

        for (int i = 0 ; i < nums.length ; i++) {
            int j = (i+1) % nums.length ;

            while (j != i) {
                if (nums[i] < nums[j]) {
                    result[i] = nums[j] ;
                    break ;
                }

                j = (j+1) % nums.length ;
            }
        }

        return result ;
        */
    }
}