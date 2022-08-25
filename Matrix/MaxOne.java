package Matrix;

import java.util.Scanner;

public class MaxOne {
    public static void main(String[] args) {
        int[][] matrix = { { 0, 0, 1 }, { 1, 0, 0 }, { 1, 1, 0 } };

        System.out.println(maxOne(matrix));
    }

    static int maxOne(int[][] matrix) {
        int index = 0;
        int max = 0;
        int count;
        for (int i = 0; i < matrix.length; i++) {
            count = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }

            if (max <= count) {
                max = count;
                index = i + 1;
            }
        }

        return index;
    }
}
