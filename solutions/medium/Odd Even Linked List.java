// Title: Odd Even Linked List
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/odd-even-linked-list/

public ListNode oddEvenList(ListNode head) {
if (head == null) {
return head;
}
ListNode prev = head;
ListNode current = head.next;
ListNode headTwo = current;
int i = 0;
while (current != null && current.next != null) {
i++;
prev.next = current.next;
prev = current;
current = current.next;
}
if (i % 2 == 1) {
current.next = headTwo;
prev.next = null;
} else {
prev.next = headTwo;
}
return head;
}
}
