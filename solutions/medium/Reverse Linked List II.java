// Title: Reverse Linked List II
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/reverse-linked-list-ii/

        }
        ListNode curr = prev.next;
        ListNode prevNode = null;
        ListNode next = null;
        for (int i = 0; i < right - left + 1; i++) {
            next = curr.next;
            curr.next = prevNode;
            prevNode = curr;
            curr = next;
        }
        ListNode connection = prev.next;
        prev.next = prevNode;
        connection.next = curr;

        return dummy.next;
    }
}
