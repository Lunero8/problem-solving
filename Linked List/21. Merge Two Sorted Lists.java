/**
 *    author:  Lunero
 *    created: 24.08.2025 00:11:10
 *    link: https://leetcode.com/problems/merge-two-sorted-lists/description/
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Approach 2
        ListNode head = new ListNode(0) ;
        ListNode tempHead = head ;

        while (list1 != null && list2 != null)
        {
            if (list1.val < list2.val)
            {
                tempHead.next = list1 ;
                list1 = list1.next ;
            }
            else 
            {
                tempHead.next = list2 ;
                list2 = list2.next ;
            }

            tempHead = tempHead.next ;
        }

        if (list1 != null)
            tempHead.next = list1 ;
        else  if (list2 != null)
            tempHead.next = list2 ;

        return head.next ;

        /*--Approach 1
        ListNode head = new ListNode(0) ;
        ListNode tempHead = head ;

        while (list1 != null || list2 != null)
        {
            if (list1 != null && list2 != null)
            {
                if (list1.val < list2.val)
                {
                    head.next = list1 ;
                    list1 = list1.next ;
                    head = head.next ;
                }
                else
                {
                    head.next = list2 ;
                    list2 = list2.next ;
                    head = head.next ;
                }
            }
            else if (list1 == null)
            {
                head.next = list2 ;
                list2 = list2.next ;
                head = head.next ;
            }
            else if (list2 == null)
            {
                head.next = list1 ;
                list1 = list1.next ;
                head = head.next ;
            }
        }

        return tempHead.next ;
        */
    }
}