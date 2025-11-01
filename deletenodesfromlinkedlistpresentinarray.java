import java.util.*;

class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        // Convert nums to a set for O(1) lookup
        Set<Integer> removeSet = new HashSet<>();
        for (int num : nums) {
            removeSet.add(num);
        }

        // Dummy node to simplify head deletions
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = head;

        while (curr != null) {
            if (removeSet.contains(curr.val)) {
                prev.next = curr.next; // Skip this node
            } else {
                prev = curr; // Keep this node
            }
            curr = curr.next; // Move forward
        }

        return dummy.next;
    }
}
