package LinkedList;

//Q- Given head, the head of a linked list, determine if the linked list has a cycle in it.

//There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

//Return true if there is a cycle in the linked list. Otherwise, return false.

public class LLCycleDetection {
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

    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        // using fast slow pointer method
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                return true;
            }
        }

        return false;

    }

    // finding length of the cycle
    public int lengthOfCycle(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                //counting the number of node in cycle by keeping fast pointer stationary and moving slow pointer;
                ListNode temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);//break the loop when temp completes one round;

                return length;
            }

        }
        return -1;
    }
}
