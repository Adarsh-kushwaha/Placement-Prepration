package LinkedList;

import Oops.Interfaces.NiceCar;

public class DoublyLL {

    private Node head;

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        Node last = head;

        if (head == null) {
            node.prev = null;
            head = null;
            return;
        }

        while (last.next != null) {
            last = last.next;
        }

        node.next = null;
        node.prev = last;
        last.next = node;
        node = last;

    }

    public void disp() {
        Node node = head;
        Node last = null;
        while (node != null) {
            System.out.print(node.value + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");

        System.out.println("Print in Reverse");

        while (last != null) {
            System.out.print(last.value + " -> ");
            last = last.prev;
        }
        System.out.println("END");

        System.out.println();

    }

    private class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    public static void main(String[] args) {
        DoublyLL list = new DoublyLL();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertLast(5);
        list.disp();
    }

}
