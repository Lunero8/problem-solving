/**
 *    author:  Lunero
 *    created: 22.08.2025 22:55:29
 *    link: https://leetcode.com/problems/middle-of-the-linked-list/description/
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
    public ListNode middleNode(ListNode head) {
        // Approach 2
        ListNode middle = head , last = head ;

        while (last != null && last.next != null)
        {
            middle = middle.next ;
            last = last.next.next ;
        }

        return middle ;

        /* --Approach 1
        int size = 1 ;

        ListNode tempHead = head ;

        // size 
        while (tempHead.next != null)
        {
            size++ ;
            tempHead = tempHead.next ;
        }

        int middle = size / 2 ;

        int i = 0 ;
        while (i < middle) 
        {
            head = head.next ;
            i++ ;
        }

        return head ;
        */
    }
}