/**
 *    author:  Lunero
 *    created: 22.08.2025 22:35:33
 *    link: https://leetcode.com/problems/delete-node-in-a-linked-list/description/
**/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val ;
        node.next = node.next.next ;
    }
}