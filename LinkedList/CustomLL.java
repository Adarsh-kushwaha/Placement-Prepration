package LinkedList;

public class CustomLL {
    private int size;
    private Node head;
    private Node tail;// by using tail extra variable we can insert element last at constant time

    public CustomLL() {
        this.size = 0;
    }

    // inserting item at index

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
        }

        if (index == size) {
            insertLast(val);
        }

        if (index > size) {
            System.out.println("index out of bound error");
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;

    }

    // inserting item from last

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size += 1;

    }

    // inserting item from head of linked list
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

        size += 1;
    }

    // deleting from the index

    public int delete(int index) {
        if (index == 0) {
            deleteFirst();
        }

        if (index == size - 1) {
            deleteLast();
        }

        Node prevnode = head;

        for (int i = 0; i < index - 1; i++) {
            prevnode = prevnode.next;
        }
        int val = prevnode.next.value;
        prevnode.next = prevnode.next.next;

        return val;
    }

    // deleting from the first

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }

        size--;
        return val;
    }

    // deleting from the Last

    public int deleteLast() {
        int val = tail.value;
        Node node = head;
        for (int i = 0; i < size - 2; i++) {
            node = node.next;
        }
        node.next = null;
        tail = node;
        size--;
        return val;
    }

    //find the value

    public Node find(int val){
        Node node = head;
        while(node != null){
            if(node.value == val){
                return node;
            }

            node = node.next;
        }

        return null;
    }

    // displaying value of each node
    public void disp() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }

    public static void main(String[] args) {
        CustomLL list = new CustomLL();
        list.insertFirst(5);
        list.insertFirst(4);
        list.insertFirst(3);
        list.disp();
        System.out.println( list.find(4));
        list.disp();
    }
}
