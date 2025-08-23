/**
 *    author:  Lunero
 *    created: 23.08.2025 07:03:40
 *    link: https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/description/
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
    public ListNode deleteMiddle(ListNode head) {
        // Approach 2
        ListNode prev = new ListNode (0, head) ;
        ListNode slow = prev ;
        ListNode fast = prev ;

        while (fast.next != null && fast.next.next != null)
        {
            slow = slow.next ;
            fast = fast.next.next ;
        }

        slow.next = slow.next.next ;

        return prev.next ;

        /* --Approach 1
        if (head.next == null)
            return null ;
        if (head.next.next == null)
        {
            head.next = null ;
            return head ;
        }

        ListNode slow = head ;
        ListNode fast = head ;

        while (fast.next.next != null && fast.next.next.next != null)
        {
            slow = slow.next ;
            fast = fast.next.next ;
        }

        slow.next = slow.next.next ;

        return head ;
        */
    }
}