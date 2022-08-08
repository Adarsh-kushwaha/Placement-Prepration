package DSA_3_Month_Practice.Day1;

import java.util.*;

public class UnionOfSet {
    public static void main(String[] args) {

    }

    static void union(int a[], int n, int b[], int m) {
        HashSet<Integer> s = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            s.add(a[i]);
        }

        for (int i = 0; i < b.length; i++) {
            s.add(b[i]);
        }

    }
}
