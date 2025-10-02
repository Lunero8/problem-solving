/**
 *    author:  Lunero
 *    created: 02.10.2025 09:50:18
 *    link: https://leetcode.com/problems/next-greater-element-i/description/
**/

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // using stack
        int[] result = new int [10001] ;
        Stack<Integer> stack = new Stack<>() ;

        for (int i = nums2.length - 1 ; i >= 0 ; i--) {
            while (!stack.empty() && stack.peek() <= nums2[i])
                stack.pop() ;

            result[nums2[i]] = stack.empty() ? -1 : stack.peek() ;

            stack.push(nums2[i]) ;
        }
        
        for (int i = 0 ; i < nums1.length ; i++) {
            nums1[i] = result[nums1[i]] ;
        }

        return nums1 ;

        /*
        // implementation
        int[] result = new int [nums1.length] ;
        Arrays.fill(result, -1) ;

        for (int i = 0 ; i < nums1.length ; i++) {
            boolean found = false ;
            for (int j = 0 ; j < nums2.length ; j++) {
                if (nums1[i] == nums2[j])
                    found = true ;
                
                if (found && nums1[i] < nums2[j]) {
                    result[i] = nums2[j] ;
                    break ;
                }
            }
        }

        return result ;
        */
    }
}