// Title: Partition List
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/partition-list/

        while (head != null) {
            if (head.val < x) {
                less.next = head;
                less = less.next;
        ListNode greater = greaterDummy;
        ListNode less = lessDummy;
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode lessDummy = new ListNode(0);
        ListNode greaterDummy = new ListNode(0);
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
/**
 * Definition for singly-linked list.
 * public class ListNode {
