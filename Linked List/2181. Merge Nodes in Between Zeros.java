/**
 *    author:  Lunero
 *    created: 24.08.2025 01:27:17
 *    link: https://leetcode.com/problems/merge-nodes-in-between-zeros/description/
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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummyHead = new ListNode(0) ;
        ListNode tempHead = dummyHead ;

        int sum = 0 ;

        head = head.next ;

        while (head != null)
        {
            if (head.val != 0)
                sum += head.val ;
            else
            {
                tempHead.next = new ListNode (sum) ;
                tempHead = tempHead.next ;

                sum = 0 ;
            }

            head = head.next ;
        }

        return dummyHead.next ;
    }
}