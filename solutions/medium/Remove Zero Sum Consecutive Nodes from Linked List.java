// Title: Remove Zero Sum Consecutive Nodes from Linked List
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/remove-zero-sum-consecutive-nodes-from-linked-list/

        HashMap<Integer, ListNode> map = new HashMap<>();
        int sum = 0;
        ListNode curr = dummy;
        while (curr != null) {
            sum += curr.val;
            map.put(sum, curr);   
            curr = curr.next;
        }
        dummy.next = head;
        ListNode dummy = new ListNode(0);
    public ListNode removeZeroSumSublists(ListNode head) {
class Solution {
        sum = 0;
        curr = dummy;
        while (curr != null) {
            sum += curr.val;
 */
            curr.next = map.get(sum).next;
            curr = curr.next;
        }
        return dummy.next;
    }
}
