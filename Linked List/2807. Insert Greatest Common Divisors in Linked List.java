/**
 *    author:  Lunero
 *    created: 24.08.2025 01:08:36
 *    link: https://leetcode.com/problems/insert-greatest-common-divisors-in-linked-list/description/
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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode tempHead = head ;

        while (tempHead != null && tempHead.next != null)
        {
            // gcd 
            int a = tempHead.val ;
            int b = tempHead.next.val ;

            while (b != 0)
            {
                int temp = b ;
                b = a % b ;
                a = temp ;
            }

            ListNode gcd = new ListNode(a) ;

            gcd.next = tempHead.next ;
            tempHead.next = gcd ;

            tempHead = gcd.next ;
        }

        return head ;
    }
}