/**
 *    author:  Lunero
 *    created: 23.08.2025 23:50:26
 *    link: https://leetcode.com/problems/linked-list-cycle-ii/description/
**/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head ;
        ListNode fast = head ;

        while (fast != null && fast.next != null)
        {
            slow = slow.next ;
            fast = fast.next.next ;

            if (slow == fast)
            {
                slow = head ;

                while (slow != fast)
                {
                    slow = slow.next ;
                    fast = fast.next ;
                }

                return slow ;
            }
        }

        return null ;
    }
}