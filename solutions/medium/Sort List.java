// Title: Sort List
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/sort-list/

    }
        return merge(left, right);
        ListNode right = sortList(mid);
        ListNode left = sortList(head);
        slow.next = null;
        }
        ListNode mid = slow.next;
        if (head == null || head.next == null)
            return head;
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
