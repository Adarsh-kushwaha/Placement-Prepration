package DSA_3_Month_Practice.Day4;

import java.util.Arrays;
import java.util.Stack;

public class MergeIntervals {
    public static void main(String[] args) {

        int[][] interval = {{1,3},{2,6},{8,15}};
        int[][] ans = merge(interval);
        System.out.println(Arrays.toString(ans));
    }

    static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        // create a stack and push first interval in it
        Stack<int[]> stack = new Stack<>();
        stack.add(intervals[0]);

        for (int i = 0; i < intervals.length; i++) {

            int startPoint2 = intervals[i][0];
            int endPoint2 = intervals[i][1];

            int[] popArray = stack.pop();

            int startPoint1 = popArray[0];
            int endPoint1 = popArray[1];

            int endMax = Math.max(endPoint1, endPoint2);

            if (endPoint1 >= startPoint2) {
                int[] merge = new int[] { startPoint1, endMax };
                stack.add(merge);
            } else {
                stack.add(popArray);
                stack.add(intervals[i]);
            }
        }

        int[][] output = new int[stack.size()][2];
        for (int i = 0; i < output.length; i++) {
            int[] popArray = stack.pop();
            output[i][0] = popArray[0];
            output[i][1] = popArray[1];
        }

        return output;

    }
}
