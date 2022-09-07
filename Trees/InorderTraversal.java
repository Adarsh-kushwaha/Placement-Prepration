package Trees;

import java.util.ArrayList;

public class InorderTraversal {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(8);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.left = new Node(9);
        root.right.right.right = new Node(10);

        ArrayList<Integer> inOrder = new ArrayList<>();
        inOrdTrav(root, inOrder);

        for (int i = 0; i < inOrder.size(); i++) {
            System.out.print(inOrder.get(i) + " ");
        }
    }

    static void inOrdTrav(Node curr, ArrayList<Integer> inOrder) {
        if (curr == null) {
            return;
        }

        inOrdTrav(curr.left, inOrder);
        inOrder.add(curr.data);
        inOrdTrav(curr.right, inOrder);
    }
}

// class Node {
//     int data;
//     Node left, right;

//     Node(int data) {
//         this.data = data;
//         left = null;
//         right = null;
//     }

//     public Node() {

//     }
// }