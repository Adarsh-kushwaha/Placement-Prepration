package LinkedList;

//142. Linked List Cycle II
//Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null

public class CycleAtNode {
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

    // length of cycle
    public int lengthOfCycle(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                // counting the number of node in cycle by keeping fast pointer stationary and
                // moving slow pointer;
                ListNode temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);// break the loop when temp completes one round;

                return length;
            }

        }
        return 0;
    }

    public ListNode detectCycle(ListNode head) {
        int length = lengthOfCycle(head);
        ListNode f = head;
        ListNode s = head;

        if (length == 0) {
            return null;
        }

        while (length > 0) {
            s = s.next;
            length--;
        }

        while (s != f) {
            s = s.next;
            f = f.next;
        }

        return s;
    }
}
