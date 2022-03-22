package Recursion;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 2, 40, 8, 8, 9 };
        int target = 8;
        search3(arr, target, 0);
        System.out.println(search3(arr, target, 0));

    }

    static int search(int[] arr, int target, int i) {
        if (arr[i] == target) {
            return i;
        }

        if (i == arr.length - 1) {
            return -1;
        }

        return search(arr, target, i + 1);
    }

    // approch 1: passing list in argument

    static ArrayList<Integer> search2(int[] arr, int target, int i, ArrayList<Integer> list) {

        if (arr[i] == target) {
            list.add(i);
        }

        if (i == arr.length - 1) {
            return list;
        }

        return search2(arr, target, i + 1, list);
    }

    // approach 2: return list but don't pass in the argument

    static ArrayList<Integer> search3(int[] arr, int target, int i) {

        ArrayList<Integer> list = new ArrayList<>();

        // this will contain list at each function call - though this is not very
        // optimised approach don't use it
        if (arr[i] == target) {
            list.add(i);
        }

        if (i == arr.length - 1) {
            return list;
        }

        ArrayList<Integer> ansFromBelowCalls = search3(arr, target, i + 1);
        list.addAll(ansFromBelowCalls);
        return list;

    }
}
