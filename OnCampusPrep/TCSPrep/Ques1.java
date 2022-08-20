//A chocolate factory is packing chocolates into the packets. The chocolate packets here represent an array  of N number of integer values. The task is to find the empty packets(0) of chocolate and push it to the end of the conveyor belt(array)

package OnCampusPrep.TCSPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println(Arrays.toString(arr));
        zeroAtLast(arr, n);
    }

    static void zeroAtLast(int[] arr, int n) {

        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                second.add(arr[i]);
            } else {
                first.add(arr[i]);
            }
        }

        first.addAll(second);

        System.out.println(first);
    }
}
