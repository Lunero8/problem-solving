/**
 *    author:  Lunero
 *    created: 23.08.2025 22:03:47
 *    link: https://leetcode.com/problems/palindrome-linked-list/description/
**/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        // Approach 2
        // finding middle
        ListNode slow = head, fast = head ;
        while (fast != null && fast.next != null)
        {
            slow = slow.next ;
            fast = fast.next.next ;
        }

        // reverse second half
        ListNode prev = null ;

        while (slow != null)
        {
            ListNode next = slow.next ;
            slow.next = prev ;
            prev = slow ;
            slow = next ;
        }

        // Check palindrome or not 
        while (prev != null)
        {
            if (prev.val != head.val)
                return false ;

            prev = prev.next ;
            head = head.next ;
        }

        return true ;

        /* --Approach 1
        ArrayList<Integer> nums = new ArrayList<>() ;

        while (head != null)
        {
            nums.add (head.val) ;
            head = head.next ;
        }

        int size = nums.size() ;

        int i = 0 ;

        while (size / 2 > i)
        {
            if (nums.get(i) != nums.get(size-i-1))
                return false ;
            
            i++ ;
        }
        
        return true ;
        */
    }
}