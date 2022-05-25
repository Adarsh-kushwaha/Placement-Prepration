package LinkedList;

//Q-83 (LEETCODE) - Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

public class RemoveDup {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode deleteDuplicates(ListNode node) {
        if (node == null) {
            return node;
        }
        ListNode head = node;
        // check wheather value of next node is equals to value of next node if it is
        // skip it and run while loop till we reach to null
        while (node.next != null) {
            if (node.val == node.next.val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }

        return head;
    }
}
