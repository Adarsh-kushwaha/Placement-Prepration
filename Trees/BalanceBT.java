package Trees;

import java.lang.Thread.State;

public class BalanceBT {
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

        Boolean ans = checkBalanceTree(root);
        System.out.println(ans);
    }

    static boolean checkBalanceTree(Node root) {
        return checkBalance(root) != -1;
    }

    static int checkBalance(Node root) {
        if (root == null) {
            return 0;
        }

        int left = checkBalance(root.left);
        if (left == -1) {
            return -1;
        }
        int right = checkBalance(root.right);
        if (right == -1) {
            return -1;
        }
        if (Math.abs(left - right) > 2) {
            return -1;
        }

        return 1 + Math.max(left, right);
    }
}

// t - o(n)
//s - o(n)
