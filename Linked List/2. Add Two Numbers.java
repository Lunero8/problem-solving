/**
 *    author:  Lunero
 *    created: 23.08.2025 20:13:59
 *    link: https://leetcode.com/problems/add-two-numbers/description/
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0) ;
        ListNode curr = head ;
        int remain = 0 ;

        while (l1 != null || l2 != null || remain != 0)
        {
            int sum = remain ;

            if (l1 != null)
            {
                sum += l1.val ;
                l1 = l1.next ;
            }

            if (l2 != null)
            {
                sum += l2.val ;
                l2 = l2.next ;
            }

            remain = sum / 10 ;

            curr.next = new ListNode (sum % 10) ;
            curr = curr.next ;
        }

        return head.next ;
    }
}