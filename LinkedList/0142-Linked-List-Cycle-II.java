/**
 * Problem: Linked List Cycle II
 * LeetCode: 142
 * Difficulty: Medium
 *
 * Pattern:
 * - Fast & Slow Pointer (Floyd's Cycle Detection)
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if (slow==fast) break;
        }
        if (fast==null || fast.next==null) return null;
        while (head!=slow){
            head=head.next;
            slow=slow.next;
        }
        return head;
    }
}