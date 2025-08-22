/**
 *    author:  Lunero
 *    created: 22.08.2025 23:07:20
 *    link: https://leetcode.com/problems/reverse-linked-list/description/
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
    public ListNode reverseList(ListNode head) {
        ListNode prev = null ;

        while (head != null)
        {
            ListNode tempNext = head.next ;
            head.next = prev ;
            prev = head ;
            head = tempNext ;
        }

        return prev ;
    }
}