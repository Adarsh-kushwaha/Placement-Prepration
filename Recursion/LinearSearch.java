package Recursion;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 2, 40, 8, 8,9 };
        int target = 8;
        ArrayList <Integer> list = new ArrayList<>();
        System.out.println(search(arr, target, 0));
        search2(arr, target, 0, list);
        System.out.println(list);
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

    static ArrayList<Integer> search2(int[] arr, int target, int i, ArrayList<Integer>list) {
        
        if (arr[i] == target) {
            list.add(i);
        }

        if (i == arr.length - 1) {
            return list;
        }

        return search2(arr, target, i + 1, list);
    }
}
